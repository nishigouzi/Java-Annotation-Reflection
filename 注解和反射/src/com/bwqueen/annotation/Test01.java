package com.bwqueen.annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	@Override		//@Override��д��ע��
	public String toString() {
		return super.toString();
	}
	
	@Deprecated		//���Ƽ�����Աʹ�ã����ǿ���������
	public static void test() {
		System.out.println("@Deprecated");
	}
	
	@SuppressWarnings("all")		//���Ʊ���������ʾ
	public void test02() {
		List list = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		test();
	}
}
