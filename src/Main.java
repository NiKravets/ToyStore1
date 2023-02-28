import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));

        for (int i = 0; i < 10; i++) {
            Toy toy = Get();
            writer.write(toy.toString() + "\n");
        }
        writer.close();
    }


    public static Toy Get() {

        ArrayList<Toy> toysInStore = new ArrayList();
        Toy car = new Toy(1, "Машинка", 20);
        Toy doll = new Toy(2, "Кукла", 20);
        Toy candy = new Toy(3, "Конфета", 50);
        Toy bike = new Toy(4,"Велосипед",10);
        toysInStore.add(car);
        toysInStore.add(doll);
        toysInStore.add(candy);
        toysInStore.add(bike);
        Toy result = null;
        Random random = new Random();
        int rn = random.nextInt(100);
        if (rn < car.getProbability())
            result = toysInStore.get(toysInStore.indexOf(car));
        else if (car.getProbability()<= rn && rn < car.getProbability() + doll.getProbability())
            result = toysInStore.get(toysInStore.indexOf(doll));
        else if (car.getProbability() + doll.getProbability()<= rn && rn < car.getProbability() + doll.getProbability()+ candy.getProbability())
            result = toysInStore.get(toysInStore.indexOf(candy));
        else if (car.getProbability() + doll.getProbability()+ candy.getProbability()<= rn && rn < 99)
            result = toysInStore.get(toysInStore.indexOf(bike));
        return result;

    }





}
