package training;


import training.controller.Controller;
import training.model.Model;
import training.view.View;




public class Main {
    public static void main(String[] args ) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);

        controller.processUser();


    }
}