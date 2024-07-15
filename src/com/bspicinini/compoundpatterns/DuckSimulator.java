package compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        System.out.println("--------------- Duck Simulator ---------------");
        var simulator = new DuckSimulator();
        var factory = new CountingDuckFactory();
        // var factory = new DuckFactory();
        simulator.simulate(factory);
    }

    void simulate(AbstractDuckFactory factory) {
        var redHeadDuck = factory.createRedHeadDuck(); 
        var duckCall = factory.createDuckCall();
        var rubberDuck = factory.createRubberDuck();
        var gooseDuck = new GooseAdapter(new Goose());

        redHeadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();    
        gooseDuck.quack();        

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
} 
