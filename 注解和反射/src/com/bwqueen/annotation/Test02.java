package com.bwqueen.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//����Ԫע��
@MyAnnotation
public class Test02 {
	
	
	public void test(){
		
	}

}


//����һ��ע��
//Target ��ʾ���ǵ�ע�����������Щ�ط�.
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//Retention��ʾ���ǵ�ע����ʲô�ط�����Ч��
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)

//Documented��ʾ�Ƿ����ǵ�ע��������JAVAdoc��
@Documented

//Inherited������Լ̳и����ע��
@Inherited
@interface MyAnnotation{
	
}
