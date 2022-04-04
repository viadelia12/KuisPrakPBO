/**
 *
 * @author user
 */
public class Hewan implements Animal {
    String name;
    String type;
    String sound;
    
    public Hewan(String name, String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
}
