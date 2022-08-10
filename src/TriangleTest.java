public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(5, 3, 4);
        System.out.println(triangle);

        triangle = new Triangle("red", true, 6, 5, 2);
        System.out.println(triangle);
    }
}
