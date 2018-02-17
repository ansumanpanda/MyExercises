package core.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ansu.core.beans.Circle;
import com.ansu.core.beans.Rectangle;
import com.ansu.core.beans.Shape;
import com.ansu.core.beans.Square;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		if(applicationContext!=null)
		{
			Circle circle=(Circle) applicationContext.getBean("circle");
			
			if(circle!=null)
			{
				System.out.println(circle.getType()); 
				circle.draw();
			}
			
			Square square=(Square) applicationContext.getBean("square");
			
			if(square!=null)
			{
				System.out.println(square.getType()); 
				square.draw();
			}
			
			Rectangle rectangle=(Rectangle) applicationContext.getBean("rectangle");
			
			if(rectangle!=null)
			{
				System.out.println(rectangle.getType()); 
				rectangle.draw();
			}
			
		}
		

	}
	
}
