package training.controller;


import training.view.View;
import java.util.Scanner;

public class UtilityController {

    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputValueStringWithRegex(String regex) {
        String value = scanner.next();
        while(!(value.matches(regex))) {
            view.showWrongInput();
            value = scanner.next();
        }

        return value;
    }

}
