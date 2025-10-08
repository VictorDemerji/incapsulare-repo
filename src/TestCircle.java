public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle( 2.0, "blue");
        System.out.println("Radius = " + c1.getRadius() + " Culoare - " +
                c1.getColor() + " Suprafata = " + c1.getRadius());

        Circle c2 = new Circle( 2.0);
        System.out.println("Radius = " + c2.getRadius() + " Culoare - " +
                c2.getColor() + " Suprafata = " + c2.getRadius());

        Circle c3 = new Circle();
        System.out.println("Radius = " + c3.getRadius() + " Culoare - " +
                c3.getColor() + " Suprafata = " + c3.getRadius());
    }
}
