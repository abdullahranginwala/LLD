package Practice.MeetingScheduler;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Meeting {
    int id;
    MeetingRoom location;
    List<Attendee> attendees;
    Date start;
    Date end;

    public Meeting(MeetingRoom location, Date start, Date end) {
        this.id = 0;
        this.location = location;
        this.start = start;
        this.end = end;
        this.attendees = new ArrayList<>();
    }

    public void invite(List<Attendee> attendees) {
        this.attendees.addAll(attendees);
    }
}
