package compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        System.out.println("--------------- Duck Simulator ---------------");
        var simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        var redHeadDuck = new RedHeadDuck(); 
        var duckCall = new DuckCall();
        var rubberDuck = new RubberDuck();

        redHeadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();    
    }
} 
