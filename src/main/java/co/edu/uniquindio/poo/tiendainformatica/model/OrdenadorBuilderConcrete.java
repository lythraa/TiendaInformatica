package co.edu.uniquindio.poo.tiendainformatica.model;

public class OrdenadorBuilderConcrete implements OrdenadorBuilder {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;
    private int almacenamientoHDD;
    private int almacenamientoSSD;
    private String fuenteAlimentacion;
    private String sistemaRefrigeracion;
    private TecladoMecanico tecladoMecanico;
    private RatonGaming ratonGaming;

    @Override
    public  void reset() {
        procesador = "";
        tarjetaGrafica = "";
        ram = 0;
        almacenamientoHDD = 0;
        almacenamientoSSD = 0;
        fuenteAlimentacion = "";
        sistemaRefrigeracion = "";
        tecladoMecanico = null;
        ratonGaming = null;
    }
    @Override
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void setAlmacenamientoHDD(int almacenamientoHDD) {
        this.almacenamientoHDD = almacenamientoHDD;
    }

    @Override
    public void setAlmacenamientoSSD(int almacenamientoSSD) {
        this.almacenamientoSSD = almacenamientoSSD;
    }

    @Override
    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    @Override
    public void setSistemaRefrigeracion(String sistemaRefrigeracion) {
        this.sistemaRefrigeracion = sistemaRefrigeracion;
    }

    @Override
    public void setTecladoMecanico(TecladoMecanico tecladoMecanico) {
        this.tecladoMecanico = tecladoMecanico;
    }

    @Override
    public void setRatonGaming(RatonGaming ratonGaming) {
        this.ratonGaming = ratonGaming;
    }

    @Override
    public Ordenador build() {
        return new Ordenador(procesador,tarjetaGrafica,ram,almacenamientoHDD,almacenamientoSSD,fuenteAlimentacion,sistemaRefrigeracion,tecladoMecanico,ratonGaming);
    }
}
