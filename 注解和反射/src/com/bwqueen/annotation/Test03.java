package com.bwqueen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test03 {
	//注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
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
	//注解的参数：参数类型 + 参数名();
	String name() default "";
	int age();
	int id() default -1;
	
	String[] schools() default {"数据1", "数据2"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
	//如果注解的参数只有一个，并且参数名为value时，可以在使用时省略参数名不写
	String value();
}

