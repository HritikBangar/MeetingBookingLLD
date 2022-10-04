import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    private List<MeetingRoom> rooms;

    public BookingSystem(){
        this.rooms = new ArrayList<MeetingRoom>();
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        rooms.add(meetingRoom);
    }

    public List<MeetingRoom> showAvailableRooms(Requirement requirement){
        List<MeetingRoom> availableRooms = new ArrayList<MeetingRoom>();
        for(MeetingRoom meetingRoom: rooms){
            if(meetingRoom.isRoomAvailable(requirement)){
                availableRooms.add(meetingRoom);
            }
        }
        return availableRooms;
    }

    public void bookMeeting(MeetingRoom room, Requirement requirement){
        room.bookMeeting(requirement);
    }

    public void updateMeeting(Meeting meeting, int startTime, int endTime){
        meeting.updateMeeting(startTime, endTime);
    }

    public void deleteMeeting(Meeting meeting){
        meeting.deleteMeeting();
    }

}
