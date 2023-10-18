package model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TarjetaAmex extends TarjetaDeCredito {
    public TarjetaAmex(String numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        super("AMEX", numeroTarjeta, cardholder, fechaVencimiento);
    }

    @Override
    public double calcularTasaConImporte(double importe) {
        double tasa = getFechaVencimiento().getMonthValue() * 0.1;
        tasa *= importe;
        return tasa / 100;
    }
}
