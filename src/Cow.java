public class Cow extends Animal{
    public Cow(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String doSound() {
        return "MOOOOO";
    }
}
