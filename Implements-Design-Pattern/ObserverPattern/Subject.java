import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();

    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    public int getState(){
        return this.state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }

}
