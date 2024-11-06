package FigurasRegulares;

public class Rectangulo {
    private double ancho;
    private double altura;

    public Rectangulo() {}

    public Rectangulo(double ancho, double altura) {
        this.ancho= ancho;
        this.altura= altura;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho= ancho;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura= altura;
    }
    public double calcularPerimetro() {
        return (ancho + altura)*2;
    }
    public double calcularArea() {
        return ancho* altura;
    }
}