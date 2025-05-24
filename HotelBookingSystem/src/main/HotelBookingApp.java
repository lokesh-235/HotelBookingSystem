package main;

import java.util.*;
import java.util.stream.*;

import models.*;
import exceptions.*;

public class HotelBookingApp {
	
	static int NoOfRooms=100;
	
	public static void main(String[] args) {
		List<Room> rooms=Room.createRooms(NoOfRooms);
		
//		for(int i=0;i<100;i++)
//			System.out.println(rooms.get(i));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Room Type (AC,Non-AC,Deluxe,Non-Deluxe) : ");
		String roomType=sc.nextLine();
		
		System.out.println(" Please Enter the from and to as (Month Date-Month Date) : ");
		String StayDates[]=sc.nextLine().split("-");
		String from=StayDates[0];
		String to=StayDates[1];
//		System.out.println(from+" "+to);
		
		List<Room> availableRooms=AvailableRooms(roomType,rooms);
		displayRooms(availableRooms);
		System.out.println("Please Enter RoomID from the given rooms : ");
		int roomId=sc.nextInt();
		
		
		boolean isAvailable=isRoomAvailable(availableRooms, roomId);
		try
		{
			if(isAvailable)
			{
				//Start Booking
				System.out.println("Booked");
			}
			
			else
				throw new RoomUnavailableException("Room ID :"+roomId+" is currently not available");
			
		}
		catch(RoomUnavailableException e) {
			System.out.println(e);
		}
		
		
		
	}

	private static boolean isRoomAvailable(List<Room> availableRooms,int roomId) {
		// TODO Auto-generated method stub
		for(Room room : availableRooms)
			if(room.getRoomId()==roomId)
				return true;
		return false;
	}

	private static void displayRooms(List<Room> availableRooms) {
		// TODO Auto-generated method stub
		if(availableRooms.isEmpty())
	    	System.out.println("No rooms available rooms");
	    else
	    	System.out.println("Available Rooms are : \n\n"+availableRooms);
	}

	private static List<Room> AvailableRooms(String roomType,List<Room> rooms) {
		// TODO Auto-generated method stub
	    List<Room> availableRooms= rooms.stream().
	    		filter(room->room.getIsAvailable()&&room.getRoomType().equalsIgnoreCase(roomType))
	    		.collect(Collectors.toList());
	    
	    return availableRooms;
	    
	}
	
	
	
}

