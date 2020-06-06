package com.bwqueen.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 如何通过反射动态的创建一个对象
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test09 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//##########################  构造一个对象   ################################
		//获得Class对象
		Class c1 = Class.forName("com.bwqueen.reflection.User");
		
		//构造一个对象
		//User user = (User)c1.newInstance(); //本质是调用了类的无参构造器
		//System.out.println(user);
		
		//通过构造器创建对象
		//Constructor constructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
		//User user2 = (User)constructor.newInstance(001, "秦疆", 18);
		//System.out.println(user2);
		
		//##########################   通过反射调用方法   ################################
		
		//通过反射调用普通方法
		User user3 = (User)c1.newInstance();
		//通过反射获取一个方法
		Method setName = c1.getDeclaredMethod("setName", String.class);
		
		//invoke :激活的意思
		// (对象，"方法的值")
		setName.invoke(user3, "狂神");
		System.out.println(user3.getName());

		//##########################   通过反射操作属性   ################################
		
		//通过反射操作属性
		User user4 = (User )c1.newInstance();
		Field name = c1.getDeclaredField("name");
		//不能直接操作私有属性，我们需要关闭程序的安全检测，属性或 者方法的setAccessible(true)|
		name.setAccessible(true); //会降低程序的效率
		name.set(user4, "狂神2") ;
		System.out.println(user4.getName());
		
	}

}
