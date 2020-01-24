public class Player {
    private String name = "";

    public Player(String name){
        this.name = name;
    }
    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString(){
        return name;
    }

    //getters
    public String getName() {
        return name;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

}
