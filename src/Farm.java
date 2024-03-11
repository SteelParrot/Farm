import java.util.ArrayList;

public class Farm {
    private int landSize = 100; // 1 milion metru^2
    private final int maxFlowers = 5;
    int smallAnimalCount = 0;
    int bigAnimalCount = 0;

    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Animal> barn = new ArrayList<>();

    public void addAnimal(Animal animal) throws Exception {
        if (smallAnimalCount <= 10 && bigAnimalCount <= 10){
            barn.add(animal);
            if (animal.size == Size.SMALL){
                smallAnimalCount++;
            }else {
                bigAnimalCount++;
            }
        }else {
            throw new Exception("Animal can not fit");
        }
    }

    public void petAnimal(Animal animal){
        System.out.println(animal.doSound());
    }

    public void plantFlower(Flower fl) throws Exception {
        if (flowers.size() <= maxFlowers) {
            flowers.add(fl);
            landSize -= fl.neededArea;
        } else {
            throw new Exception("Not enough space for a flower") {
            };
        }
    }

    public void waterPlant(Flower fl) {
        for (Flower flower : flowers) {
            if (flower == fl) {
                fl.chanceOfGrowth += 0.5;
            }
        }
    }
}
