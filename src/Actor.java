public abstract class Actor {
    private String name;
    private boolean isMakeOrder=false;
    private boolean isTakeOrder=false;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Actor(String name){
        this.name=name;

    }


}
