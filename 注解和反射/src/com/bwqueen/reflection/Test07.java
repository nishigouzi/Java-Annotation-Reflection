package com.bwqueen.reflection;

/**
 * ��ȡϵͳ���õļ�����
 * @author ovo
 *
 */
public class Test07 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡϵͳ��ļ�����
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader() ;
		System.out.println(systemClassLoader);
		//��ȡϵͳ��������ĸ��������-->��չ�������
		ClassLoader parent = systemClassLoader.getParent();
		System.out.println(parent) ;
		//��ȡ��չ��������ĸ��������-->��������(C/c++)
		ClassLoader parent1 = parent.getParent();
		System.out.println(parent1) ;
		
		//���Ե�ǰ�����ĸ����������ص�
		ClassLoader classLoader = Class.forName("com.bwqueen.reflection.Test07").getClassLoader();
		System.out.println(classLoader); 
		//����JDK���õ�����˭���ص�
		classLoader = Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classLoader) ;

		//.��λ��ϵͳ����������Լ��ص�·��
		System.out.println(System.getProperty("java.class.path"));
		/**
		 * D:\dev_env\ovo\workspace-sts\ע��ͷ���\bin
		 */

		// ˫��ί�ɻ���
		//   �������Լ�дһ��java.lang.String������ǲ��ᱻ�������ʹ�õģ���Ϊ���ü�������
		//   �Ѿ��и�java.lang.String��
		
	}
	
	

}
