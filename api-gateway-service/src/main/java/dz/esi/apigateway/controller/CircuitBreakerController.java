package dz.esi.apigateway.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CircuitBreakerController {

   /**
   @GetMapping("/dossierMedicalServiceDefaultResponse")
    public String dossierMedicalServiceFallBack() {
        return " Dossier Medical Service Goes Down";
    }

    @PostMapping("/dossierMedicalServiceDefaultResponse")
    public String dossierMedicalServiceFallBackPost() {
        return " Dossier Medical Service Goes Down";
    }
    */


    /**
    @GetMapping("/examenCliniqueServiceDefaultResponse")
    public String examenCliniqueServiceFallBack() {
        return " Examen Clinique Service Goes Down";
    }

    @PostMapping("/examenCliniqueServiceDefaultResponse")
    public String examenCliniqueServiceFallBackPost() {
        return " Examen Clinique Service Goes Down";
    }
    */

    /**
    @GetMapping("/gestionCompteServiceDefaultResponse")
    public String gestionCompteServiceFallBack() {
        return "Gestion Compte Service Goes Down";
    }

    @PostMapping("/gestionCompteServiceDefaultResponse")
    public String gestionCompteServiceFallBackPost() {
        return "Gestion Compte Service Goes Down";
    }
    */
}
