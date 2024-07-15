package compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
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

        var flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        var mallardDuck = factory.createMallardDuck();
        var mallardDuckTwo = factory.createMallardDuck();
        var mallardDuckThree = factory.createMallardDuck();
        var mallardDuckFour = factory.createMallardDuck();

        var flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
} 
