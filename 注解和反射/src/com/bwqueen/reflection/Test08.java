package com.bwqueen.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ��������Ϣ
 * 
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test08 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		Class c1 = Class.forName("com.bwqueen.reflection.User");

		// ����������
		System.out.println(c1.getName()); // ��ð��� +����
		System.out.println(c1.getSimpleName()); // �������

		// ����������
		System.out.println("===============================");
		Field[] fields = c1.getFields(); // ֻ���� ��public����

		fields = c1.getDeclaredFields(); // �����ҵ�ȫ��������
		for (Field field : fields) {
			System.out.println(field);
		}

		// ���ָ�����Ե�ֵ
		Field name = c1.getDeclaredField("name");
		System.out.println(name);
		
		// �����ķ���
		System.out.println("==========================");
		
		Method[] methods = c1.getMethods(); // ��ñ��༰�丸���ȫ��public����
		for (Method method: methods) {
			System.out.println("������:" + method);
		}
		
		methods = c1.getDeclaredMethods(); // ��ñ�������з���
		for (Method method: methods) {
			System.out.println("getDeclaredMethods:" + method);
		}

		
		//���ָ������
		//����
		Method getName = c1.getMethod("getName", null);
		Method setName = c1.getMethod("setName", String.class);
		System.out.println(getName) ; 
		System.out.println(setName);
		
		//���ָ���Ĺ�����
		System.out.println("==============================");
		Constructor[] constructors = c1.getConstructors();
		for (Constructor constructor: constructors) {
			System.out.println(constructor);
		}
		
		constructors = c1.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			System.out.println("#"+constructor);
		}
		
		//���ָ���Ĺ�����
		Constructor declaredConstructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
		System.out.println("ָ��:" + declaredConstructor);

	}

}
