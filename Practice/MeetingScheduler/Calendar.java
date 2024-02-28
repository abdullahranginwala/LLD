package Practice.MeetingScheduler;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    List<Meeting> meetings;
    MeetingRoom meetingRoom;

    public Calendar(MeetingRoom meetingRoom) {
        this.meetings = new ArrayList<>();
        this.meetingRoom = meetingRoom;
    }

    public boolean checkAvailability(Date start, Date end) {
        for (Meeting meeting: meetings) {
            if( (meeting.start.compareTo(start) > 0 && meeting.start.compareTo(end) < 0) || 
                (meeting.end.compareTo(start) > 0 && meeting.end.compareTo(end) < 0)  ) {
                return false;
            }
        }
        return true;
    }

    public Meeting scheduleMeeting(Date start, Date end) {
        Meeting newMeeting = new Meeting(meetingRoom, start, end);
        meetings.add(newMeeting);
        return newMeeting;
    }
}
