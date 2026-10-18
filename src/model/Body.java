package model;

public class Body {
    private final String type;
    private final float height, width, length;
    private final float bootCapacityL;
    private final int seats;
    private final boolean isRightHandDrive;

    public Body(String type, float height, float width, float length, float bootCapacityL, int seats, boolean isRightHandDrive){
        if(type != null && !type.isEmpty())
            this.type = type;
        else this.type = "NULL/BODY_TYPE";
        if(height > 0)
            this.height = height;
        else this.height = -1;
        if(width > 0)
            this.width = width;
        else this.width = -1;
        if(length > 0)
            this.length = length;
        else this.length = -1;
        if(bootCapacityL >= 0)
            this.bootCapacityL = bootCapacityL;
        else this.bootCapacityL = -1;
        if(seats > 0)
            this.seats = seats;
        else this.seats = -1;
        this.isRightHandDrive = isRightHandDrive;
    }

    public String getType(){
        return type;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getLength(){
        return length;
    }

    public float getBootCapacityL() {
        return bootCapacityL;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isRightHandDrive() {
        return isRightHandDrive;
    }

    @Override
    public String toString() {
        return  "type = '" + type + '\'' +
                ", height = " + height +
                ", width = " + width +
                ", length = " + length +
                ", bootCapacityL = " + bootCapacityL +
                ", seats = " + seats +
                ", isRightHandDrive = " + isRightHandDrive;
    }
}
