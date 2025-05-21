public class Car extends Vehicle {
    @Override
    public void service() {
        super.service();
        checkEngine();
    }

}