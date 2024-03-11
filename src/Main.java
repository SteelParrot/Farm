public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Rose rose = new Rose("Red Rose",50,1,0.4);
        Cow cow = new Cow("Meat🍖","Karla",Size.BIG,"none");

        try {
            farm.plantFlower(rose);
            farm.addAnimal(cow);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        farm.waterPlant(rose);
        farm.petAnimal(cow);





    }
}