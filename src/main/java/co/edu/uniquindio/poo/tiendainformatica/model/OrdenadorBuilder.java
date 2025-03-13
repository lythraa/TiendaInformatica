package co.edu.uniquindio.poo.tiendainformatica.model;

public interface OrdenadorBuilder {
    void setProcesador(String procesador);
    void setTarjetaGrafica(String tarjetaGrafica);
    void setRam(int ram);
    void setAlmacenamientoHDD(int almacenamientoHDD);
    void setAlmacenamientoSSD(int almacenamientoSSD);
    void setFuenteAlimentacion(String fuenteAlimentacion);
    void setSistemaRefrigeracion(String sistemaRefrigeracion);
    void setTecladoMecanico(TecladoMecanico tecladoMecanico);
    void setRatonGaming(RatonGaming ratonGaming);
    Ordenador build();
    void reset();
}
