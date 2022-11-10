public class Main {
    public static void main(String[] args) {
        Animal dog=createObject("Dog");
        Animal cat=createObject("Cat");
        Animal cow=createObject("Cow");

        dog.print();
        cat.print();
        cow.print();

    }
    public static Animal createObject(String Animal){


        switch (Animal){
            case"Dog":
                return new Dog("Akmoinok",5) ;
            case "Cat":
                return  new Cat("Kisulya",3);
            case "Cow":
                return new Cow ("Bella","White") ;
    }
       return null;
    }
}