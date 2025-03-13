package co.edu.uniquindio.poo.tiendainformatica.model;

public class Ordenador {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;
    private int almacenamientoHDD;
    private int almacenamientoSSD;
    private String fuenteAlimentacion;
    private String sistemaRefrigeracion;
    private TecladoMecanico tecladoMecanico;
    private RatonGaming ratonGaming;

    public Ordenador(String procesador, String tarjetaGrafica, int ram,
                     int almacenamientoHDD, int almacenamientoSSD, String fuenteAlimentacion,
                     String sistemaRefrigeracion, TecladoMecanico tecladoMecanico,
                     RatonGaming ratonGaming) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
        this.almacenamientoHDD = almacenamientoHDD;
        this.almacenamientoSSD = almacenamientoSSD;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.sistemaRefrigeracion = sistemaRefrigeracion;
        this.tecladoMecanico = tecladoMecanico;
        this.ratonGaming = ratonGaming;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "procesador='" + procesador + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", ram=" + ram +
                ", almacenamientoHDD=" + almacenamientoHDD +
                ", almacenamientoSSD=" + almacenamientoSSD +
                ", fuenteAlimentacion='" + fuenteAlimentacion + '\'' +
                ", sistemaRefrigeracion='" + sistemaRefrigeracion + '\'' +
                ", tecladoMecanico=" + tecladoMecanico +
                ", ratonGaming=" + ratonGaming +
                '}';
    }
}
