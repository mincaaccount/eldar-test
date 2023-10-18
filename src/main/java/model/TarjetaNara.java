package model;

import java.time.LocalDate;

public class TarjetaNara extends TarjetaDeCredito {
    public TarjetaNara(String numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        super("NARA", numeroTarjeta, cardholder, fechaVencimiento);
    }

    @Override
    public double calcularTasaConImporte(double importe) {
        double tasa = getFechaVencimiento().getDayOfMonth() * 0.5;
        tasa *= importe;
        return tasa / 100;
    }
}
