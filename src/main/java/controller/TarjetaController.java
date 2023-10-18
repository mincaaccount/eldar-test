package controller;

import model.RequestImporte;
import model.ResponseTasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TarjetaService;

@RestController
public class TarjetaController {

    private final TarjetaService tarjetaService;

    @Autowired
    public TarjetaController(TarjetaService tarjetaService) {
        this.tarjetaService = tarjetaService;
    }

    @PostMapping("/calcularTasa")
    @ResponseBody
    public ResponseTasa calcularTasaController(@RequestBody RequestImporte requestImporte) {
        double importe = requestImporte.getImporte();

        if (importe < 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo.");
        }

        double tasa = tarjetaService.calcularTasaService(requestImporte);
        return new ResponseTasa(tasa);
    }

}
