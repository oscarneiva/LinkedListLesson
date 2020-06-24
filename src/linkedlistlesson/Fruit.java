package project;

public class Fruit {
    private String name;
    private String type;
    private String colour;

    public Fruit(String n, String t, String c){
        this.name = n;
        this.type = t;
        this.colour = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
