public class Dog extends Animal implements Printable{
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public  void print() {
        System.out.println("Dog's name:"+getName()+"\nDog's age: "+age+" years old");
    }
}
