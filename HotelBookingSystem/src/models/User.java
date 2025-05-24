package models;

import java.util.*;

public class User {
	private String userId;
	private String userName;
	private String password;
	private String phoneNo;
	public User(String userId,String userName,String password,String phoneNo) {
		this.userId=userId;
		this.userName=userName;
		this.phoneNo=phoneNo;
		this.password=password;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public String toString() {
		return "User ID : "+userId+"\nUser Name : "+userName+"\nUser Password : "+password+"\nUser Phone Number : "+phoneNo;
	}
	
	public static Map<String,User> createUsers(){
		Map<String , User> users=new HashMap<>();
		 String userNames[]= {"loki","thor","tony","johnwick"};
		 String passwords[]= {"loki123","thor123","tony123","johnwick123"};
		 String phoneNos[]= {"123","456","789","234"};
		for(int i=0;i<4;i++) {
			users.put("User"+i,new User("User"+i,userNames[i],passwords[i],phoneNos[i]));
			
		}
		return users;
	}
	
//	public static void main(String[] args) {
//		Map<String , User> users=createUsers();
//		System.out.println(users);
//		
//	}
}
