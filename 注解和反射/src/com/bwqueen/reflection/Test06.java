package com.bwqueen.reflection;

/**
 * ʲôʱ��ᷢ�����ʼ��
 * @author ovo
 *
 */
public class Test06 {
	
	static {
		System.out.println("Main�౻����");
	}
	
	public static void main(String[] args) {
		//1.��������
		//Son son = new Son();
		//����Ҳ�������������
		//Class.forName("com.kuang.reflection.Son");
		//�������������õķ���
		//System.out.println(Son.b);
		//Son[] array = new Son[5];
		System.out.println(Son.M);
	}
}

class Father {
	static int b = 2;
	static {
		System.out.println("���౻����");
	}
}

class Son extends Father {
	static {
		System.out.println("���౻����");
		m = 300;
	}
	static int m = 100;
	static final int M = 1;
}
