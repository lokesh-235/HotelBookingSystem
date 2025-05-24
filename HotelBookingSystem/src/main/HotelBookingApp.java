package main;

import java.util.*;	
import java.io.*;
import java.util.stream.*;

import models.*;
import exceptions.*;
import services.*;


public class HotelBookingApp {
	
	static int NoOfRooms=100;
	
	public static void main(String[] args) throws IOException{
		List<Room> rooms=Room.createRooms(NoOfRooms);
		Map<String,User> users=User.createUsers();
	
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
		
		List<Room> availableRooms=BookingServices.getAvailableRooms(roomType,rooms);
		
		BookingServices.displayRooms(availableRooms);
		System.out.println("Please Enter RoomID from the given rooms : ");
		int roomId=sc.nextInt();
		
		
		boolean isAvailable=BookingServices.isRoomAvailable(availableRooms, roomId);
		try
		{
			if(isAvailable)
			{
				//Start Booking
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Booking in process ");
				
				System.out.println("Please Enter your userId : ");
				String userId=br.readLine().trim();
				
				System.out.println(userId+" "+users.get(userId));
				System.out.println("Please Enter your password : ");
				String password=br.readLine().trim();
				
				try {
					
					if(users.containsKey(userId)&&users.get(userId).getPassword().equals(password))
					{
//						System.out.println("Start Booking");
						
					}
			
					else
						throw new UserIdOrPasswordDoesNotMatchException("Please Enter Correct User ID and Password");
					
						
				}
				catch(UserIdOrPasswordDoesNotMatchException e) {
					System.out.println(e);
				}
				
				
				
			}
			
			else
				throw new RoomUnavailableException("Room ID :"+roomId+" is currently not available");
			
		}
		catch(RoomUnavailableException e) {
			System.out.println(e);
		}
		
		
		
	}


	
}

