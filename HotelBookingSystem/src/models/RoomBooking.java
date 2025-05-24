package models;



import java.time.LocalDate;

public class RoomBooking {
	private String BookingId;
    private Room room;
    private User user; 
    private LocalDate fromDate;
    private LocalDate toDate;

    public RoomBooking(String BookingId,Room room, User user, LocalDate fromDate, LocalDate toDate) {
        this.BookingId=BookingId;
    	this.room = room;
        this.user = user;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getBookingId() {
    	return BookingId;
    }
    
    public Room getRoom() {
        return room;
    }

    public String getUserName() {
        return user.getUserName();
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    @Override
    public String toString() {
        return "Booking [User: " + user.getUserName() + ", Room: " + room.getRoomId() +
               ", Type: " + room.getRoomType() + ", From: " + fromDate + ", To: " + toDate + "]";
    }
}

