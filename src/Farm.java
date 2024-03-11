import java.util.ArrayList;

public class Farm {
    private int landSize = 100; // i dont know what is this for (nothing)
    private final int maxFlowers = 5;
    int smallAnimalCount = 0;
    int bigAnimalCount = 0;

    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Animal> barn = new ArrayList<>();

    public void addAnimal(Animal animal) throws Exception {
        if (smallAnimalCount <= 10 && bigAnimalCount <= 10){
            barn.add(animal);
            increaseBarnOccupation(animal.size);
        }else {
            throw new Exception("Animal can not fit");
        }
    }

    public void sellAnimal(Animal animal) throws Exception {
        if (barn.contains(animal)){
            barn.remove(animal);
            decreaseAnimalOccupation(animal.size);
        }else {
            throw new Exception("Can not sell animal that you dont own");
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

    private void increaseBarnOccupation(Size size){
        if (size == Size.BIG){
            bigAnimalCount++;
        }else {
            smallAnimalCount++;
        }
    }

    private void decreaseAnimalOccupation(Size size){
        if (size == Size.BIG){
            bigAnimalCount--;
        }else {
            smallAnimalCount--;
        }
    }
}
