public class Cow extends Animal implements Printable{
    private String color;

    public Cow(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Cow's name: "+getName()+"\nCow's color: "+color);
    }
}
