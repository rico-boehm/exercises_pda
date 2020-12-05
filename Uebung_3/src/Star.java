public class Star {

    private String starName = "";
    private String starID = "";
    private double starDistance;
    private double starApparentMagnitude;
    private String starType = "";

    public Star(){

    }

    public Star(String starName, String starID, double starDistance, double starApparentMagnitude, String starType){
        this.starName = starName;
        this.starID = starID;
        this.starDistance = starDistance;
        this.starApparentMagnitude = starApparentMagnitude;
        this.starType = starType;

    }

    public String getStarName() {
        return starName;
    }

    public String getStarID() {
        return starID;
    }

    public double getStarDistance() {
        return starDistance;
    }

    public double getStarApparentMagnitude() {
        return starApparentMagnitude;
    }

    public String getStarType() {
        return starType;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public void setStarID(String starID) {
        this.starID = starID;
    }

    public void setStarDistance(double starDistance) {
        this.starDistance = starDistance;
    }

    public void setStarApparentMagnitude(double starApparentMagnitude) {
        this.starApparentMagnitude = starApparentMagnitude;
    }

    public void setStarType(String starType) {
        this.starType = starType;
    }
}
