interface Service {
    void check(Vehicle transport);
}

public class ServiceStation implements Service {

    public void check(Vehicle transport) {
        transport.service();
    }
}