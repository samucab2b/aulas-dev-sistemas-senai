public class App {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica quadrado = new Quadrado(10.0);
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());

        FiguraGeometrica triangulo = new Triangulo(10.0);
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());
    }
}
