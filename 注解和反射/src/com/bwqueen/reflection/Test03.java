package com.bwqueen.reflection;

/**
 * ��ȡClass���ʵ��
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test03 {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		System.out.println("�������:"+person.name) ;
		//��ʽһ:ͨ��������
		Class c1 = person.getClass();
		System.out.println(c1.hashCode());
		//ʽ��: forname ���
		Class c2 = Class.forName("com.bwqueen.reflection.Student");
		System.out.println(c2.hashCode());
		//ʽ��:ͨ������.class ���
		Class c3 = Student.class;
		System.out.println(c3.hashCode());
		//��ʽ��:�����������͵İ�װ�඼��һType����
		Class c4 = Integer.TYPE;
		System.out.println(c4) ;
		//��ø�������
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
		this.name = "ѧ��";
	}
}

class Teacher extends Person{
	public Teacher() {
		this.name = "��ʦ";
	}
}

