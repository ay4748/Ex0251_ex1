public class Motorcycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("starting the motorcycle engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating the motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("stopping the motorcycle engine");
    }
}
