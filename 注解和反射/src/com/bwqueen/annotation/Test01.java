package com.bwqueen.annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	@Override		//@Override重写的注解
	public String toString() {
		return super.toString();
	}
	
	@Deprecated		//不推荐程序员使用，但是可以拿来用
	public static void test() {
		System.out.println("@Deprecated");
	}
	
	@SuppressWarnings("all")		//抑制编译器的提示
	public void test02() {
		List list = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		test();
	}
}
