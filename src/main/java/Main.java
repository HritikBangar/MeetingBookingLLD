import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        BookingSystem bookingSystem = new BookingSystem();
        ArrayList<MeetingRoom> meetingRoomList = new ArrayList<MeetingRoom>();
        meetingRoomList.add(MeetingRoomFactory.getMeetingRoom(100, List.of(Feature.VIDEO_CONF)));
        meetingRoomList.add(MeetingRoomFactory.getMeetingRoom(100, List.of(Feature.WHITEBOARD)));
        meetingRoomList.add(MeetingRoomFactory.getMeetingRoom(100, List.of(Feature.WHITEBOARD, Feature.VIDEO_CONF)));
        meetingRoomList.add(MeetingRoomFactory.getMeetingRoom(2000, List.of(Feature.WHITEBOARD, Feature.VIDEO_CONF)));
        for (MeetingRoom meetingRoom: meetingRoomList){
            bookingSystem.addMeetingRoom(meetingRoom);
        }
        Requirement requirement = new Requirement(2, 20, 1000, List.of(Feature.WHITEBOARD));
        List<MeetingRoom> meetingRooms = bookingSystem.showAvailableRooms(requirement);
        for(MeetingRoom meetingRoom:meetingRooms){
            System.out.println(meetingRoom);
        }
        System.out.println("-------");
        MeetingRoom meetingRoom = MeetingRoomFactory.getMeetingRoom(2000, List.of(Feature.WHITEBOARD, Feature.VIDEO_CONF));
        bookingSystem.bookMeeting(meetingRooms.get(0), requirement);
        Requirement requirement2 = new Requirement(30, 50, 1000, List.of(Feature.WHITEBOARD));
        meetingRooms = bookingSystem.showAvailableRooms(requirement2);
        for(MeetingRoom meetingRoom1:meetingRooms){
            System.out.println(meetingRoom1);
        }

    }



}
