public class Bicycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("start the paddling");
    }

    @Override
    public void accelerate() {
        System.out.println("paddle faster");
    }

    @Override
    public void stop() {
        System.out.println("stop the paddling");
    }
}
