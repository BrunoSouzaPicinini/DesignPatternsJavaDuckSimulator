package compoundpatterns;

public class RedHeadDuck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Quack");    
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }

}
