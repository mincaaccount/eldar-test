package model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TarjetaVisa extends TarjetaDeCredito {

    public TarjetaVisa(String numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        super("VISA", numeroTarjeta, cardholder, fechaVencimiento);
    }

    @Override
    public double calcularTasaConImporte(double importe) {
        double tasa = (double) getFechaVencimiento().getYear() / getFechaVencimiento().getMonthValue();
        tasa *= importe;
        return tasa / 100;
    }
}

