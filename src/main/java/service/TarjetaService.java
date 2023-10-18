package service;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaService {

    private final TarjetaVisa tarjetaVisa;
    private final TarjetaNara tarjetaNara;
    private final TarjetaAmex tarjetaAmex;

    @Autowired
    public TarjetaService(TarjetaVisa tarjetaVisa, TarjetaNara tarjetaNara, TarjetaAmex tarjetaAmex) {
        this.tarjetaVisa = tarjetaVisa;
        this.tarjetaNara = tarjetaNara;
        this.tarjetaAmex = tarjetaAmex;
    }

    public double calcularTasaService(RequestImporte requestImporte) {
        String marca = requestImporte.getMarca();
        double importe = requestImporte.getImporte();

        try {
            switch (TipoTarjeta.valueOf(marca)) {
                case VISA:
                    return tarjetaVisa.calcularTasaConImporte(importe);
                case NARA:
                    return tarjetaNara.calcularTasaConImporte(importe);
                case AMEX:
                    return tarjetaAmex.calcularTasaConImporte(importe);
                default:
                    throw new IllegalArgumentException("Marca de tarjeta desconocida");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Marca de tarjeta desconocida: " + marca);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error al calcular la tasa", e);
        }
    }
}
