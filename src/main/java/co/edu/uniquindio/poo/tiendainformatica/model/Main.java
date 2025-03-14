package co.edu.uniquindio.poo.tiendainformatica.model;

public class Main {
    public static void main(String[] args) {

        DirectorOrdenadores director = new DirectorOrdenadores();

        Ordenador helloKitty = director.ordenadorDeHelloKitty();

        System.out.println(helloKitty.toString());

    }
}
