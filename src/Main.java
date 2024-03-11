public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Rose rose = new Rose("Red Rose",50,1,0.4);
        Sunflower sunflower = new Sunflower("Sunny the Sunflower",4000,2,0.5);

        Cow cow = new Cow("Meat🍖","Karla",Size.BIG,"none");
        Cow cow2 = new Cow("mottled","ZANG",Size.SMALL, "none");

        Sheep sheep = new Sheep("wool giver","Katka",Size.BIG,"none");

        Pig pig = new Pig("muddy","Hanush",Size.BIG,"needs extra food");
        Pig pig2 = new Pig("black","Natasha",Size.SMALL,"drinks a lot");

        try {
            farm.plantFlower(rose);
            farm.plantFlower(sunflower);

            farm.addAnimal(cow);
            farm.addAnimal(cow2);
            farm.addAnimal(pig);
            farm.addAnimal(pig2);

            farm.waterPlant(rose);
            farm.petAnimal(cow);

            farm.sellAnimal(sheep);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }








    }
}