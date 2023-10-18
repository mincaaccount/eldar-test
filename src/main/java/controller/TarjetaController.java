package controller;

import model.RequestImporte;
import model.ResponseTasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import service.TarjetaService;

@RestController
public class TarjetaController {

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/")
    public String getPage() {
        return "Example working";
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

    public static void main(String[] args) {
        SpringApplication.run(TarjetaController.class, args);
    }
}
