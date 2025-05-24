package services;

import java.util.List;
import java.util.stream.Collectors;

import models.Room;

public class BookingServices {
	public static List<Room> getAvailableRooms(String roomType,List<Room> rooms) {
		// TODO Auto-generated method stub
	    List<Room> availableRooms= rooms.stream().
	    		filter(room->room.getIsAvailable()&&room.getRoomType().equalsIgnoreCase(roomType))
	    		.collect(Collectors.toList());
	    
	    return availableRooms;
	    
	}
	
	public static boolean isRoomAvailable(List<Room> availableRooms,int roomId) {
		// TODO Auto-generated method stub
		for(Room room : availableRooms)
			if(room.getRoomId()==roomId)
				return true;
		return false;
	}
	
	public static void displayRooms(List<Room> availableRooms) {
		// TODO Auto-generated method stub
		if(availableRooms.isEmpty())
	    	System.out.println("No rooms available rooms");
	    else
	    	System.out.println("Available Rooms are : \n\n"+availableRooms);
	}
	
}
