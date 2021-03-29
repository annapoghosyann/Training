package myMallProject;

public class Shop {
    String name;
    Employee[] employees;

    protected String shopType (){
        String type = "";
        return type;
    }

    private byte floor;

    public void setFloor(byte floor) {
        if (floor > 0 && floor < 4)
            this.floor = floor;
    }

    public byte getFloor() {
        return floor;
    }

}
