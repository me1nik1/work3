public class Bicycle extends WheeledTransport {

    public Bicycle(String modeName, int wheelsCount) {
        super(modeName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void service() {
        updateTyre();
    }
}