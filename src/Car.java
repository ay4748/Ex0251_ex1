public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("starting the car engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car engine");
    }
}
