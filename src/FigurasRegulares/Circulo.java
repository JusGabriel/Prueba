package FigurasRegulares;

public class Circulo {
    private double radio;

    public Circulo(){}

    public Circulo(double radio) {
        this.radio=radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio=radio;
    }
    public double calcularPerimetro() {
        return 2 *(3.14) * radio;
    }
    public double calcularArea() {
        return 2*(3.14) * radio * radio;
    }
}