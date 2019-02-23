package training.view;


public class View {


    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showWrongInput() {
        showMessage(StringConstants.WRONG_INPUT_DATA);
    }

    public void inputName() { showMessage(StringConstants.INPUT_NAME); }

    public void inputSurname() { showMessage(StringConstants.INPUT_SURNAME); }

    public void inputNickname() {
        showMessage(StringConstants.INPUT_NICKNAME);
    }
}
