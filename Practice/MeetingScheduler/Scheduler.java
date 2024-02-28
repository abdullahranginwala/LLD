package Practice.MeetingScheduler;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Scheduler {
    private static final int MAX_HISTORICAL_MEETINGS = 20;

    List<MeetingRoom> meetingRooms;
    LinkedList<Meeting> history;

    public Scheduler(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
        this.history = new LinkedList<>();
    }

    public Meeting book(Date startDate, Date end) {

        for(MeetingRoom meetingRoom: meetingRooms) {
            if(meetingRoom.isAvailable(startDate, end)) {
                Meeting newMeeting = meetingRoom.scheduleMeeting(startDate, end);

                addToHistory(newMeeting);

                return newMeeting;
            }
        }

        return null;
    }

    private void addToHistory(Meeting meeting) {
        history.addFirst(meeting);
        if(history.size() > MAX_HISTORICAL_MEETINGS) {
            history.removeLast();
        }
    }

    public List<Meeting> getHistory() {
        return null;
    }

    
}
