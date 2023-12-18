package nature.forest;

public class Forest {
    public class Lichen implements Surround{
        String family;
        public Lichen(String family){
            this.family = family;
        }
        public String toString() {
            return String.format("Loops of %s lichen", family);
        }
    }
    public class Roots implements Surround{
        String description;
        public Roots(String description){
            this.description = description;
        }
        public String toString(){
            return String.format("%s roots", description);
        }
    }
    public class Stones implements Appear{
        String description;
        public Stones(String description){
            this.description = description;
        }
        public String toString(){
            return String.format("Piles of %s stones", description);
        }
    }
    public class Wall implements Appear{
        String description;
        public Wall(String description){
            this.description = description;
        }
        public String toString(){
            return  String.format("Fragments of a %s wall", description);
        }
    }
}
