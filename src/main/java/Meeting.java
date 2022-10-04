public class Meeting {

    private int startTime;
    private int endTime;
    int noOfPeople;
    boolean isCancelled;

    public Meeting(int startTime, int endTime, int noOfPeople) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.noOfPeople = noOfPeople;
    }

    public void updateMeeting(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public void deleteMeeting(){
        this.isCancelled = true;
    }
}
