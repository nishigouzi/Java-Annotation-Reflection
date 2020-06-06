package com.bwqueen.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ���ͨ�����䶯̬�Ĵ���һ������
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test09 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//##########################  ����һ������   ################################
		//���Class����
		Class c1 = Class.forName("com.bwqueen.reflection.User");
		
		//����һ������
		//User user = (User)c1.newInstance(); //�����ǵ���������޲ι�����
		//System.out.println(user);
		
		//ͨ����������������
		//Constructor constructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
		//User user2 = (User)constructor.newInstance(001, "�ؽ�", 18);
		//System.out.println(user2);
		
		//##########################   ͨ��������÷���   ################################
		
		//ͨ�����������ͨ����
		User user3 = (User)c1.newInstance();
		//ͨ�������ȡһ������
		Method setName = c1.getDeclaredMethod("setName", String.class);
		
		//invoke :�������˼
		// (����"������ֵ")
		setName.invoke(user3, "����");
		System.out.println(user3.getName());

		//##########################   ͨ�������������   ################################
		
		//ͨ�������������
		User user4 = (User )c1.newInstance();
		Field name = c1.getDeclaredField("name");
		//����ֱ�Ӳ���˽�����ԣ�������Ҫ�رճ���İ�ȫ��⣬���Ի� �߷�����setAccessible(true)|
		name.setAccessible(true); //�ή�ͳ����Ч��
		name.set(user4, "����2") ;
		System.out.println(user4.getName());
		
	}

}
