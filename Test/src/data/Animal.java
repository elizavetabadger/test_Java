package data;

public class Animal {

    private String color = "black";
    private boolean isAngry = false;

    public String getColor() {
        if(isAngry) return "red";
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Animal silent");
    }

    public void move() {
        System.out.println("Animal move");
    }

    protected void feed() {
        System.out.println("feed");
    }
}
