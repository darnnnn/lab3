package nature.forest;

public class Wall {
    String description;
    public Wall(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return  "fragments of a " + description + " wall";
    }
}
