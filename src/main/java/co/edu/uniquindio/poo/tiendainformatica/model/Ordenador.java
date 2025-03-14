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

    public Ordenador(Builder builder) {
        this.procesador = builder.procesador;
        this.tarjetaGrafica = builder.tarjetaGrafica;
        this.ram = builder.ram;
        this.almacenamientoHDD = builder.almacenamientoHDD;
        this.almacenamientoSSD = builder.almacenamientoSSD;
        this.fuenteAlimentacion = builder.fuenteAlimentacion;
        this.sistemaRefrigeracion = builder.sistemaRefrigeracion;
        this.tecladoMecanico = builder.tecladoMecanico;
        this.ratonGaming = builder.ratonGaming;
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

    public static class Builder{
        private String procesador;
        private String tarjetaGrafica;
        private int ram;
        private int almacenamientoHDD;
        private int almacenamientoSSD;
        private String fuenteAlimentacion;
        private String sistemaRefrigeracion;
        private TecladoMecanico tecladoMecanico;
        private RatonGaming ratonGaming;

        public Builder setProcesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        public Builder setTarjetaGrafica(String tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setAlmacenamientoHDD(int almacenamientoHDD) {
            this.almacenamientoHDD = almacenamientoHDD;
            return this;
        }

        public Builder setAlmacenamientoSSD(int almacenamientoSSD) {
            this.almacenamientoSSD = almacenamientoSSD;
            return this;
        }

        public Builder setFuenteAlimentacion(String fuenteAlimentacion) {
            this.fuenteAlimentacion = fuenteAlimentacion;
            return this;
        }

        public Builder setSistemaRefrigeracion(String sistemaRefrigeracion) {
            this.sistemaRefrigeracion = sistemaRefrigeracion;
            return this;
        }

        public Builder setTecladoMecanico(TecladoMecanico tecladoMecanico) {
            this.tecladoMecanico = tecladoMecanico;
            return this;
        }

        public Builder setRatonGaming(RatonGaming ratonGaming) {
            this.ratonGaming = ratonGaming;
            return this;
        }

        public Ordenador build(){
            return new Ordenador(this);
        }


    }
}
