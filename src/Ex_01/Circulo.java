package Ex_01;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = 3.14 * Math.pow(this.raio, 2);
        return area;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.raio;
    }
}
