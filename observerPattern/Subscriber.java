package observerPattern;
import java.util.ArrayList;
import java.util.List;
public class Subscriber implements SubscriberObserver{
    private String nameOfSubscriber;


    private List<String> categoryPreference = new ArrayList<>();

    public void setSubscriberName(String nameOfSubscriber) {
        this.nameOfSubscriber = nameOfSubscriber;
    }

    public String getNameOfSubscriber() {
        return nameOfSubscriber;
    }

    @Override
    public void updateSubscriber(NewsAgency news) {
       /* System.out.print("+ News Update is sent to: "+getNameOfSubscriber());
        System.out.printf("%-15s%03d%n", '+');
        System.out.println();*/
// Build the string with padding

        int space = 56;

        // Calculate the number of '+' characters needed before and after the subscriber name
        int paddingAfter = space - 25 - nameOfSubscriber.length();

        StringBuilder subs = new StringBuilder("+");

        subs.append(" News Update is sent to: ").append(nameOfSubscriber);

        for (int i = 0; i < paddingAfter; i++) {
            subs.append(" ");
        }

        subs.append("+");

        // Print the formatted message
        System.out.println(subs);
    }
    }

