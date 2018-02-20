package core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ansu.config.RoomConfig;
import com.ansu.domain.Room;
import com.ansu.domain.RoomDetails;
import com.ansu.service.RoomService;

public class RoomAppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(RoomConfig.class);
		
		RoomService marriotHotelRoomService= context.getBean(RoomService.class);
		
		//RoomService marriotHotelRoomService= (RoomService)context.getBean("marriotHotelRoomService");
		
		Room marriotRoom = new Room("alex", "luxury", 200.00);
		
		if(marriotHotelRoomService!=null)
		{
			marriotHotelRoomService.addRoom(marriotRoom);
		}
		
		RoomDetails roomDetails= context.getBean(RoomDetails.class);
		
		if(roomDetails!=null)
		{
			System.out.println("No of Beds:"+roomDetails.getNoOfBeds());
		}
		
		 ((ConfigurableApplicationContext) context).close();

	}

}
