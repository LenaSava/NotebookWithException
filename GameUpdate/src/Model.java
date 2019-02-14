import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Model {
    private int secretNumber;
    private int minBarrier;
    private int maxBarrier;
    private int userNumber;
    public List<Integer> attempts = new ArrayList<Integer>();

    public Model() {
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }
    public int getSecretNumber() {
        return secretNumber;
    }
    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
    public List<Integer> getAttempts() {
        return attempts;
    }
    public String rulesWithRange() {

        return "GAME RULE: Guess the number from " + minBarrier + " to " + maxBarrier;
    }

    public String totalString() {

        return "Range from " + minBarrier + " to " + maxBarrier;
    }
    public String totalAttempts() {
        return "Your attempts " + getAttempts();
    }

    public void setSecretNumber(int minBarrier, int maxBarrier)
    {
        this.secretNumber = new Random().nextInt(maxBarrier - minBarrier - 1) + minBarrier + 1;
    }

}
