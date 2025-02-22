import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> susbcribers = new ArrayList<>();

    @Override
    public void susbcribe(Observer obs){
        susbcribers.add(obs);
    }
    
    @Override
    public void unsusbcribe(Observer obs){
        susbcribers.remove(obs);
    }

    @Override
    public void newVideoUploaded(String title){
        for (Observer ob : susbcribers){
            ob.notified(title);
        }
    }
}
