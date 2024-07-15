package compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        System.out.println("--------------- Duck Simulator ---------------");
        var simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        var redHeadDuck = new QuackCounter(new RedHeadDuck()); 
        var duckCall = new QuackCounter(new DuckCall());
        var rubberDuck = new QuackCounter(new RubberDuck());
        var gooseDuck = new GooseAdapter(new Goose());

        redHeadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();    
        gooseDuck.quack();        

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
} 
