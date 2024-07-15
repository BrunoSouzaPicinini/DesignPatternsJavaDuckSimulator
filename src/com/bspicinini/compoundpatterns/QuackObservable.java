package compoundpatterns;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
