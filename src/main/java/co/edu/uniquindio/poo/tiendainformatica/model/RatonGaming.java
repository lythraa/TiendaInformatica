package co.edu.uniquindio.poo.tiendainformatica.model;

public class RatonGaming extends Accesorios {
    private boolean retroIluminacionRGB;
    private String marca;

    public RatonGaming(boolean retroIluminacionRGB, String marca) {
        this.retroIluminacionRGB = retroIluminacionRGB;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca;
    }
}
