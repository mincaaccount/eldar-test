package model;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private String marca;
    private String numeroTarjeta;
    private String cardholder;
    private LocalDate fechaVencimiento;

    public TarjetaDeCredito(String marca, String numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta de Crédito:\n" +
                "Marca: " + marca + "\n" +
                "Número de Tarjeta: " + numeroTarjeta + "\n" +
                "Cardholder: " + cardholder + "\n" +
                "Fecha de Vencimiento: " + fechaVencimiento;
    }

    public boolean esOperacionValida(double montoOperacion) {
        return montoOperacion < 1000;
    }

    public boolean esValidaParaOperar() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.isBefore(fechaVencimiento);
    }

    public boolean sonDistintas(TarjetaDeCredito tarjeta) {
        return !this.numeroTarjeta.equals(tarjeta.numeroTarjeta);
    }

    public double calcularTasaConImporte(double importe) {
        return 0;
    }

    public String getMarca() {
        return marca;
    }
}

