package org.ribhu.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {

		try {

			//			Triangle triangle = new Triangle();

			//			BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

			ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("spring.xml");

			//			Triangle triangle = (Triangle) beanFactory.getBean("triangle");
			
			Triangle triangle = (Triangle) applicationContext.getBean("triangle-name");
			
			triangle.draw();
			
			
		}
		catch (Exception e) {

			System.err.println(e.getMessage());

		}

	}

}
