package com.bwqueen.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ������������
 * 
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test10 {

	// ��ͨ��ʽ����
	public static void test01() {
		User user = new User();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			user.getName();
		}
		Long endTime = System.currentTimeMillis();

		System.out.println("��ͨ��ʽִ��10�ڴ�:" + (endTime - startTime) + "ms");
		
	}

	// ���䷽ʽ����
	public static void test02() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		User user = new User();
		Class c1 = user.getClass();
		Method getName = c1.getDeclaredMethod("getName", null);
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 1000000000; i++) {
			getName.invoke(user, null);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("��ͨ��ʽִ��10�ڴ�:" + (endTime-startTime) + "ms");

	}
	
	// ���䷽ʽ���� �رռ��
	public static void test03() throws NoSuchMethodException,InvocationTargetException, IllegalAccessException, IllegalArgumentException{
		User user = new User() ;
		Class c1 = user.getClass() ;
		Method getName = c1.getDeclaredMethod("getName", null) ;
		getName.setAccessible(true);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			getName.invoke(user, null);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("�رռ��ִ��10�ڴ�:"+ (endTime - startTime) + "ms");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		test01();
		test02();
		test03();
	}
	
	
	
}
