package com.bwqueen.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//测试元注解
@MyAnnotation
public class Test02 {
	
	
	public void test(){
		
	}

}


//定义一个注解
//Target 表示我们的注解可以用在哪些地方.
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//Retention表示我们的注解在什么地方还有效。
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)

//Documented表示是否将我们的注解生成在JAVAdoc中
@Documented

//Inherited子类可以继承父类的注解
@Inherited
@interface MyAnnotation{
	
}
