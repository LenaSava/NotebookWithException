import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Model {
    private int secretNumber;
    private int minBarrier;
    private int maxBarrier;
    private int userNumber;
    public List<Integer> attempts = new ArrayList<Integer>();

    public Model() {
        minBarrier = 0;
        maxBarrier = 99;
        secretNumber = (int) Math.floor(Math.random() * 100 - 1);
    }

    public int getMinBarrier() {
        return minBarrier;
    }
    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }
    public int getMaxBarrier() {
        return maxBarrier;
    }
    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }
    public int getSecretNumber() {
        return secretNumber;
    }
    public int getUserNumber() {
        return userNumber;
    }
    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
    public List<Integer> getAttempts() {
        return attempts;
    }

    public String totalString() {

        return "New range from " + minBarrier + " to " + maxBarrier;
    }
    public String totalAttempts() {
        return "Your attempts " + getAttempts();
    }

}
