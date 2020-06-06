package com.bwqueen.reflection;

/**
 * 获取Class类的实例
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test03 {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		System.out.println("这个人是:"+person.name) ;
		//方式一:通过对象获得
		Class c1 = person.getClass();
		System.out.println(c1.hashCode());
		//式二: forname 获得
		Class c2 = Class.forName("com.bwqueen.reflection.Student");
		System.out.println(c2.hashCode());
		//式三:通过类名.class 获得
		Class c3 = Student.class;
		System.out.println(c3.hashCode());
		//方式四:基本内置类型的包装类都有一Type属性
		Class c4 = Integer.TYPE;
		System.out.println(c4) ;
		//获得父类类型
		Class c5 = c1.getSuperclass();
		System.out.println(c5);
	}
}

class Person{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person{
	public Student() {
		this.name = "学生";
	}
}

class Teacher extends Person{
	public Teacher() {
		this.name = "老师";
	}
}

