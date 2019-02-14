import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public int userNumber, firstNumber, lastNumber = 0;
    public int secretNumber = 0;

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public  void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.gameRule);
        firstNumber = sc.nextInt();
        model.setMinBarrier(firstNumber);
        lastNumber = sc.nextInt();
        model.setMaxBarrier(lastNumber);
        view.printMessage(model.rulesWithRange());
        model.setSecretNumber(firstNumber, lastNumber);
        secretNumber = model.getSecretNumber();
        System.out.println(secretNumber);
        model.setUserNumber(inputWithScanner(sc, secretNumber));

    }

    public int inputWithScanner(Scanner sc, int secretNumber) {

        do {
            view.printMessage(view.letTheGameStart);


            userNumber = sc.nextInt();

            if( userNumber > secretNumber) {
                model.attempts.add(userNumber);
                model.setMaxBarrier(userNumber);
                view.printMessage(view.myNumberLess);
                view.printMessage(model.totalString());
            }
            if ( userNumber < secretNumber) {
                model.attempts.add(userNumber);
                model.setMinBarrier(userNumber);
                view.printMessage(view.myNumberBigger);
                view.printMessage(model.totalString());
            }
        } while (userNumber != secretNumber);
        view.printMessage(view.winMasage);
        view.printMessage(model.totalAttempts());
        return secretNumber;
    }
}
