package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsSubcriptionService {
    public static void main(String[] args) {
        NewsAgency newNews = new NewsAgency();

        Subscriber first = new Subscriber();
        Subscriber second = new Subscriber();
        Subscriber third = new Subscriber();

        first.setSubscriberName("Jemuel");
        second.setSubscriberName("Jaimart");
        third.setSubscriberName("Jun");

        newNews.subscribe(first);
        newNews.subscribe(second);
        newNews.subscribe(third);

        newNews.setCategory("General");
        newNews.setNews("- NURSING IN NEW ERA UNIVERSITY!                            -" +
                "\n-                                                           -\n" +
                "- The College of Nursing in New Era University " +
                "becomes one  -\n- of the country’s top performing schools in the 2023       -\n" +
                "- Philippine Nurse Licensure Examinations (PNLE)!           -");

        newNews.reportedNews();

        newNews.unsubscribe(first);

        Subscriber forth = new Subscriber();
        Subscriber fifth = new Subscriber();

        forth.setSubscriberName("Ian");
        fifth.setSubscriberName("Lanz");

        newNews.subscribe(forth);
        newNews.subscribe(fifth);

        System.out.println("\n******************************************************************\n");

        newNews.setCategory("Entertainment");
        newNews.setNews("- BLUE LOCK SEASON 2 IS CONFIRMED!                          -" +
                "\n-                                                           -\n" +
                "- Anime and sports enthusiasts get excited over the         -" +
                "\n- announcement that the highly anticipated anime will get   -\n" +
                "- its second season this coming year!                       -");

        newNews.reportedNews();

    }
}
