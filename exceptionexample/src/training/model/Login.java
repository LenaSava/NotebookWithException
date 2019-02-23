package training.model;


public enum Login {

    LOGIN1("KingArthur"),
    LOGIN2("Koshe4ka"),
    LOGIN3("Lovelas");

    private String login;


    Login(String login) {
        this.login = login;
    }

    public void setLogin(String login) throws UniqueLoginException {
        for (Login temp : Login.values()) {
            if (login == null || login.equals(temp.getLogin())) {
                throw new UniqueLoginException();
            }
        }
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}