package co.edu.uniquindio.poo.tiendainformatica.model;

public class DirectorOrdenadores {

    public Ordenador ordenadorDeHelloKitty(){
        return new Ordenador.Builder()
                .setProcesador("Ryzen 7")
                .setRam(32)
                .setTarjetaGrafica("RTX 3090")
                .setAlmacenamientoHDD(1000)
                .setAlmacenamientoSSD(500)
                .setFuenteAlimentacion("a base de plomo")
                .setRatonGaming(new RatonGaming(true, "Logitech"))
                .setTecladoMecanico(new TecladoMecanico("rosita panza de michi"))
                .build();

    }

}
