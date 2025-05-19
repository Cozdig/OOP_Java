interface CheckInterface {
    void updateTyre();

    void checkEngine();

    void checkTrailer();
}

public abstract class Check implements CheckInterface {

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

