package core.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.beans.HelloWorld;



public class MainApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing the Main App ...");
		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		if(applicationContext!=null)
		{
			HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloWorld");
			if(helloWorld!=null)
				helloWorld.sayHello("Ansuman tt");
			
		}
		

	}

}
