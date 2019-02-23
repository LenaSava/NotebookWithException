package training.model;


public class Model {

    private String name;
    private String surname;
    private String nickName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setLoginToEnum() throws UniqueLoginException {
        Login.LOGIN2.setLogin(nickName);
        Login.LOGIN1.setLogin(nickName);
        Login.LOGIN3.setLogin(nickName);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ")
                .append(name)
                .append(", Surname: ")
                .append(surname)
                .append(", Login: ")
                .append(nickName);
        return sb.toString();
    }
}