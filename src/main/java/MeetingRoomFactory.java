import java.util.List;

public class MeetingRoomFactory {

    public static MeetingRoom getMeetingRoom(int capacity, List<Feature> features){
        return new MeetingRoom(capacity, features);
    }

}
