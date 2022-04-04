/**
 *
 * @author user
 */
public class Main {
    public static void printAnimal(Animal animal){
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");
        animal.makeSound();
    }
    public static void main(String[] args) {
        Hewan m1 = new Hewan("m1","macan","p");
        Hewan m2 = new Hewan("m1","macan","pp");
        Hewan k = new Hewan("k","kambing","k");
        Hewan a = new Hewan("a","ayam","a");
        printAnimal(m1);
        printAnimal(m2);
        printAnimal(k);
        printAnimal(a);
    }
}
