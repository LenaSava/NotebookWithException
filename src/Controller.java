import java.util.Scanner;

public class Controller {

    public static final String hello = "Hello";
    public static final String world = "world";

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setHello(inputStringWithScanner(sc, hello));
        model.setWorld(inputStringWithScanner(sc,world));
        view.printMessage(view.FinalInput);
        view.printMessage(model.createString());

    }

    public String inputStringWithScanner(Scanner sc, String secondInput) {

        view.printMessage(view.SayHiToTheWorld);
        while (! sc.hasNext(secondInput)){
            view.printMessage(view.TryAgain);
            sc.next();
        }
        return sc.next();
    }
}