import java.util.List;

public class MeetingFactory {

    public static Meeting getMeeting(int startTime, int endTime, int noOfPeople){
        return new Meeting(startTime, endTime, noOfPeople);
    }

}
