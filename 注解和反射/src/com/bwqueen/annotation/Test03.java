package com.bwqueen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�Զ���ע��
public class Test03 {
	//ע�������ʽ��ֵ�����û��Ĭ��ֵ�����Ǿͱ����ע�⸳ֵ
	@MyAnnotation2(age = 22)
	public void test() {

	}
	
	@MyAnnotation3("QBW")
	public void test2() {
		
	}
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
	//ע��Ĳ������������� + ������();
	String name() default "";
	int age();
	int id() default -1;
	
	String[] schools() default {"����1", "����2"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
	//���ע��Ĳ���ֻ��һ�������Ҳ�����Ϊvalueʱ��������ʹ��ʱʡ�Բ�������д
	String value();
}

