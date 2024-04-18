package Ex_01;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double area = (this.base * this.altura) / 2;
        return area;
    }

    @Override
    public double perimetro() {
        double area = 3 * this.base;
        return area;
    }
}
