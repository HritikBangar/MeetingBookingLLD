import java.util.List;

public class Requirement {

    private int startTime;
    private int endTime;
    private int capacity;
    private List<Feature> features;

    private boolean isRequirementValid(){
        return startTime < endTime;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Requirement(Builder builder){
        this.startTime = builder.getStartTime();
        this.endTime = builder.getEndTime();
        this.capacity = builder.getCapacity();
        this.features = builder.getFeatures();
    }

    public Requirement(int startTime, int endTime, int capacity, List<Feature> features){
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.features =features;
    }


    public static class Builder{
        private int startTime;
        private int endTime;
        private int capacity;
        private List<Feature> features;


        public static Builder getInstance(){
            return new Builder();
        }


        public int getStartTime() {
            return startTime;
        }

        public Builder setStartTime(int startTime) {
            this.startTime = startTime;
            return this;
        }

        public int getEndTime() {
            return endTime;
        }

        public Builder setEndTime(int endTime) {
            this.endTime = endTime;
            return this;
        }

        public int getCapacity() {
            return capacity;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public List<Feature> getFeatures() {
            return features;
        }

        public Builder setFeatures(List<Feature> features) {
            this.features = features;
            return this;
        }
    }

}
