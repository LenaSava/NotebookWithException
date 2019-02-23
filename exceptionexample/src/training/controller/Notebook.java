package training.controller;

import training.model.Model;
import training.view.View;

public class Notebook {

    private View view;
    private Model model;
    private UtilityController utilityController;

    private String name;
    private String surname;
    private String nickName;

    public Notebook(Model model, View view, UtilityController utilityController) {
        this.view = view;
        this.model = model;
        this.utilityController = utilityController;
    }

    public void saveDataToModel() {
        saveInputData();
        saveNickNameToModel();
        model.setName(name);
        model.setSurname(surname);
        model.setNickName(nickName);

    }

    private void saveNickNameToModel() {
        saveInputNickName();
        model.setNickName(nickName);
    }

    private void saveInputData() {
        inputNameSurname();
    }

    private void saveInputNickName() {
        inputNickName();
    }

    private void inputNameSurname() {
        view.inputName();
        name = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputSurname();
        surname = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NAME);
    }


    private void inputNickName() {
        view.inputNickname();
        nickName = utilityController.inputValueStringWithRegex(RegularExpressions.REG_NICKNAME);
    }

}
