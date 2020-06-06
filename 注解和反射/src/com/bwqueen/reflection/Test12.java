package com.bwqueen.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 练习反射操作注解
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test12 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class c1 = Class.forName("com.bwqueen.reflection.Student2");
		
		//通过反射获得注解
		Annotation[] annotations = c1.getAnnotations() ;
		for (Annotation annotation : annotations) {
			System.out.println(annotation) ;
		}
		
		//获得注解的value的值。
		Tablebbq tablebbq = (Tablebbq)c1.getAnnotation(Tablebbq.class);
		String value = tablebbq.value();
		System.out.println(value);
		

		//获得类指定的注解
		Field f = c1.getDeclaredField("name");
		Fieldbbq annotation = f.getAnnotation(Fieldbbq.class);
		System.out.println(annotation.columnName()) ;
		System.out.println(annotation.type()) ;
		System.out.println(annotation.length());


	}
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablebbq{
	String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldbbq{
	String columnName() ;
	String type();
	int length();
}


@Tablebbq("tb_student")
class Student2 {
	@Fieldbbq(columnName = "id",type = "int",length = 10)
	private int id;
	@Fieldbbq(columnName = "age",type = "int",length = 10)
	private int age;
	@Fieldbbq(columnName = "name",type = "varchar",length = 3)
	private String name;
	
	public Student2() {
	}

	public Student2(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{id:"+this.id+",age:"+this.age+",name:"+this.name+"}";
	}
}