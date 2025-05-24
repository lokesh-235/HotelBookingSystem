package models;



import java.time.LocalDate;

public class RoomBooking {
    private Room room;
    private User user; 
    private LocalDate fromDate;
    private LocalDate toDate;

    public RoomBooking(Room room, User user, LocalDate fromDate, LocalDate toDate) {
        this.room = room;
        this.user = user;
        this.fromDate = fromDate;
        this.toDate = toDate;
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

