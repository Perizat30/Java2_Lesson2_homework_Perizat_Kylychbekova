

public class Cat extends Animal implements Printable{
    private int weight;

    public Cat(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Cat's name: "+ getName()+"\nCat's weight: "+weight+"kg");
    }
}
