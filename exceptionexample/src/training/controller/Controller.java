package training.controller;


import training.model.UniqueLoginException;
import training.model.Model;
import training.view.View;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        Notebook notebook = new Notebook(model, view, new UtilityController(view, scanner));

        notebook.saveDataToModel();

        boolean sameLogin = true;
        while(sameLogin) {
            try {
                model.setLoginToEnum();
                sameLogin = false;
            } catch (UniqueLoginException e) {
                view.showMessage(e.getMessage());
                notebook.saveDataToModel();
            }
        }

        view.showMessage(model.toString());
    }
}