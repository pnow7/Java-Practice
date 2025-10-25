package ct.Ct3.p_interface.animal;

public class AnimalTest {
    
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal frog = new Frog();

        System.out.println("멍멍이는" + dog.makeSound());
        System.out.println("개구리는" + frog.makeSound());
    }
}
