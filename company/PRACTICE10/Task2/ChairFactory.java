package PRACTICE10.Task2;

public class ChairFactory implements AbstractChairFactory {

    public VictorianChair createVictorianChair() {
        return new VictorianChair(183);
    }

    public MagicChair createMagicalChair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionChair() {
        return new FunctionalChair();
    }

}
