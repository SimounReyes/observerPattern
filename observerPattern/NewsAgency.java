package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private String news;
    private String category;
    private List<Subscriber> listOfSubscriber = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        listOfSubscriber.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        listOfSubscriber.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("Updating all Subscribers!\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       for (Subscriber subscriber : listOfSubscriber) {
            subscriber.updateSubscriber(this);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\nSuccessfully Updated all Subscribers!");
    }
    public String getNews() {
        return news;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNews(String news) {
        this.news = news;
    }
    public void reportedNews(){
        System.out.println("NEWS AHEAD!");
        System.out.println("News Category: "+getCategory());
        System.out.println("-------------------------------------------------------------\n"+getNews()+
                "\n-------------------------------------------------------------\n");
        this.notifySubscribers();
    }

}
