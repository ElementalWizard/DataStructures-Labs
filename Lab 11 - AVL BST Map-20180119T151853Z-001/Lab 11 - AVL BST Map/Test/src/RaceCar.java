public class RaceCar {

    int wheels = 4;
    float speed;
    boolean isRacing = false;
    String carName;


    public RaceCar(int speed, String carName){
        this.speed = speed;
        this.carName = carName;

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isRacing() {
        return isRacing;
    }

    public void setRacing(boolean racing) {
        isRacing = racing;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
