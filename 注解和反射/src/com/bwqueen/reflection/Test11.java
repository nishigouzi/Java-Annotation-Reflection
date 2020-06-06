package com.bwqueen.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 通过反射获取泛型
 * @author ovo
 *
 */
@SuppressWarnings("all")
public class Test11 {

	public void test01(Map<String, User> map, List<User> list) {
		System.out.println("test01");
	}
	
	public Map<String, User> test02(){
		System.out.println("test02");
		return null;
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method = Test11.class.getMethod("test01", Map.class, List.class);
		Type[] gPT = method.getGenericParameterTypes();
		for (Type type : gPT) {
			System.out.println("#" + type);
			if (type instanceof ParameterizedType) {
				Type[] actualTypeArumentsTypes = ((ParameterizedType)type).getActualTypeArguments();
				for (Type type2 : actualTypeArumentsTypes) {
					System.out.println(type2);
				}
			}
		}
		
		Method method2 = Test11.class.getMethod("test02", null);
		Type type = method2.getGenericReturnType();
		if (type instanceof ParameterizedType) {
			Type[] actualTypeArumentsTypes = ((ParameterizedType)type).getActualTypeArguments();
			for (Type type2 : actualTypeArumentsTypes) {
				System.out.println(type2);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
