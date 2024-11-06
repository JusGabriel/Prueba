package FigurasRegulares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado();

        System.out.print("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());

        System.out.println("Cuadrado:");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println("Area: " + cuadrado.calcularArea());

        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese el ancho del rectangulo: ");
        rectangulo.setAncho(scanner.nextDouble());
        System.out.print("Ingrese la altura del rectangulo: ");
        rectangulo.setAltura(scanner.nextDouble());

        System.out.println("Rectangulo:");
        System.out.println("Ancho: " + rectangulo.getAncho());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Area: " + rectangulo.calcularArea());

        Circulo circulo = new Circulo();
        System.out.print("Ingrese el radio del circulo: ");
        circulo.setRadio(scanner.nextDouble());

        System.out.println("Circulo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Area: " + circulo.calcularArea());

        Triangulo triangulo = new Triangulo();
        System.out.print("Ingrese la base del triangulo: ");
        triangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del triangulo: ");
        triangulo.setAltura(scanner.nextDouble());
        System.out.print("Ingrese el lado 1 del triangulo: ");
        triangulo.setLado1(scanner.nextDouble());
        System.out.print("Ingrese el lado 2 del triangulo: ");
        triangulo.setLado2(scanner.nextDouble());
        System.out.print("Ingrese el lado 3 del triangulo: ");
        triangulo.setLado3(scanner.nextDouble());

        System.out.println("Triangulo:");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Area: " + triangulo.calcularArea());

        double sumaAreas = cuadrado.calcularArea() + rectangulo.calcularArea() +
                circulo.calcularArea() + triangulo.calcularArea();
        System.out.println("Suma de las areas de todas las figuras: " + sumaAreas);

    }
}
