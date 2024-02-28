package Practice.MeetingScheduler;

import java.sql.Date;

public class MeetingRoom {
    Calendar calendar;

    public MeetingRoom() {
        this.calendar = new Calendar(this);
    }

    public boolean isAvailable(Date start, Date end) {
        return calendar.checkAvailability(start, end);
    }

    public Meeting scheduleMeeting(Date start, Date end) {
        return calendar.scheduleMeeting(start, end);
    }
    
}
