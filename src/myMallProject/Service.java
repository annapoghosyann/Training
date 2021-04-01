package myMallProject;

public class Service {

    public static String Security = "Security";
    public static String Cleaning = "Cleaning";
    public static String Advertisement = "Advertisement";
    Employee[] employees;
    private byte floor;

    public void setFloor(byte floor) {
        if (floor > 0 && floor < 4)
            this.floor = floor;
    }

    public byte getFloor() {
        return floor;
    }

}