package com.bwqueen.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * ��ϰ�������ע��
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test12 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class c1 = Class.forName("com.bwqueen.reflection.Student2");
		
		//ͨ��������ע��
		Annotation[] annotations = c1.getAnnotations() ;
		for (Annotation annotation : annotations) {
			System.out.println(annotation) ;
		}
		
		//���ע���value��ֵ��
		Tablebbq tablebbq = (Tablebbq)c1.getAnnotation(Tablebbq.class);
		String value = tablebbq.value();
		System.out.println(value);
		

		//�����ָ����ע��
		Field f = c1.getDeclaredField("name");
		Fieldbbq annotation = f.getAnnotation(Fieldbbq.class);
		System.out.println(annotation.columnName()) ;
		System.out.println(annotation.type()) ;
		System.out.println(annotation.length());


	}
}

//������ע��
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablebbq{
	String value();
}

//���Ե�ע��
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