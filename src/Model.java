public class Model {
    private String hello;
    private String world;

    public void setHello(String hello) {
        this.hello = hello;
    }
    public void setWorld(String world) {
        this.world = world;
    }

    public String createString (){
        return  hello + " " + world + "!";
    }
}