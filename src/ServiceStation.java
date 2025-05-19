interface Service {
    void check(Transport transport);
}

public class ServiceStation implements Service {

    public void check(Transport transport) {
        transport.service();
    }
}