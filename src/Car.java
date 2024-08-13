public class Car extends MotorTransport {

    public Car(String modeName, int wheelsCount) {
        super(modeName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у " + getModelName());
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());

    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}