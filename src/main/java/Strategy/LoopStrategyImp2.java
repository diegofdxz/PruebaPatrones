public class LoopStrategyImp2 implements LoopStrategy{
    @Override
    public String execute() {
        System.out.println("contar para arriba");
        return "nunca";
    }
}
