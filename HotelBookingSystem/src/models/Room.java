package models;

import java.util.*;
import java.util.Random;

public class Room {
	private int roomId;
	private String roomType;
	private float roomPrice;
	private boolean isAvailable;
    private static int NoOfRooms=0;	
	
	public Room(int roomId,String roomType,float roomPrice) {
		this.roomId=roomId;
		this.roomType=roomType;
		this.roomPrice=roomPrice;
		this.isAvailable=true;
	}
	
	
	public static List<Room> createRooms(int NoOfRooms){
		
		Room.NoOfRooms=NoOfRooms;
		List<Room> rooms=new ArrayList<>();
		String roomTypes[]= {"AC","Non-AC","Deluxe","Non-Deluxe"};
		float prices[]= {1000f,500f,300f,200f};
		Random random=new Random();
		
		for(int i=1;i<=NoOfRooms;i++) {
		  int randValue=random.nextInt(4);
		  rooms.add(new Room(i,roomTypes[randValue],prices[randValue]));
		  
		}
		return rooms;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public float getRoomPrice() {
       return roomPrice;		
	}
	
	public int getRoomId() {
		return roomId;
	}
	
	public int getNoOfRooms() {
		return NoOfRooms;
	}
	
	
	
	public String toString() {
		return "Room ID : "+roomId+"\nRoom Type : "+roomType+"\nRoom Price : "+roomPrice+"\nRoom is Available : "+isAvailable+"\n";
		
	}
}
