package PRACTICE10.Task2;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("неожиданно стул стал показывает магический фокус");
    }

    @Override
    public void sit() {
        System.out.println("Время посидеть на магическом стуле");
        doMagic();
    }

}
