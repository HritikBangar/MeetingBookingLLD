import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    private int capacity;
    private List<Feature> roomFeatures;
    private ArrayList<Meeting> meetings;

    public MeetingRoom(int capacity, List<Feature> roomFeatures){
        this.capacity = capacity;
        this.roomFeatures = roomFeatures;
        this.meetings = new ArrayList<Meeting>();
    }

    public Meeting bookMeeting(Requirement requirement){
        if(isRoomAvailable(requirement)){
            Meeting meeting = (MeetingFactory.getMeeting(requirement.getStartTime(), requirement.getEndTime(), requirement.getCapacity()));
            meetings.add(meeting);
            return meeting;
        } else{
            throw new IllegalArgumentException("Room already booked");
        }
    }

    public boolean isRoomAvailable(Requirement requirement){
        for(Meeting meeting: meetings){
            if(isOverlapping(meeting, requirement)){
                return false;
            }
        }
        if(featuresPresent(requirement)){
            return true;
        }
        return false;
    }

    private boolean isOverlapping(Meeting m1, Requirement m2){
        if(m1.getStartTime()<m2.getStartTime() && m1.getEndTime()<m2.getEndTime()){
            return false;
        }
        else if(m2.getStartTime()<m1.getStartTime() && m2.getEndTime()<m1.getEndTime()){
            return false;
        }
        return true;
    }

    private Boolean featuresPresent(Requirement requirement){
        for(Feature feature: requirement.getFeatures()){
            boolean featurePresent=false;
            for(Feature roomFeature: roomFeatures){
                if(feature==roomFeature){
                    featurePresent=true;
                    break;
                }
            }
            if(!featurePresent) return false;
        }

        if(requirement.getCapacity()>capacity){
            return false;
        }

        return true;
    }

    @Override
    public String
    toString() {
        return "MeetingRoom{" +
                "capacity=" + capacity +
                ", roomFeatures=" + roomFeatures +
                ", meetings=" + meetings +
                '}';
    }
}
