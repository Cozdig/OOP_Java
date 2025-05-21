public class Truck extends Vehicle {
    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }
}