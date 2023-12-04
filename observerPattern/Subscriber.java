package observerPattern;
import java.util.ArrayList;
import java.util.List;
public class Subscriber implements SubscriberObserver{
    private String nameOfSubscriber;

    public void setSubscriberName(String nameOfSubscriber) {
        this.nameOfSubscriber = nameOfSubscriber;
    }

    @Override
    public void updateSubscriber(NewsAgency news) {
        int space = 56;

        int paddingAfter = space - 25 - nameOfSubscriber.length();

        StringBuilder subs = new StringBuilder("+");

        subs.append(" News Update is sent to: ").append(nameOfSubscriber);

        for (int i = 0; i < paddingAfter; i++) {
            subs.append(" ");
        }

        subs.append("+");

        System.out.println(subs);
    }
    }

