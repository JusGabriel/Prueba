package FigurasRegulares;

public class Cuadrado {
    private double lado;

    public Cuadrado(){}

    public Cuadrado(double lado) {
        this.lado= lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado= lado;
    }
    public double calcularPerimetro() {
        return 4*lado;
    }
    public double calcularArea() {
        return lado* lado;
    }
}

