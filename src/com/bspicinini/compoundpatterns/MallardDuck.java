package compoundpatterns;

public class MallardDuck implements Quackable {  

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public String toString() {
        return "Mallard Duck";
    }

}
