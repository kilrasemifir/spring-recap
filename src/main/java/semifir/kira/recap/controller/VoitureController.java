package semifir.kira.recap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semifir.kira.recap.models.Moteur;
import semifir.kira.recap.models.Voiture;
import semifir.kira.recap.services.VoitureService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("voitures")
public class VoitureController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VoitureController.class);

    @Autowired
    private VoitureService service;

    @GetMapping
    public List<Voiture> findAll() {
        LOGGER.info("Récupération de l'ensemble des voitures");
        return service.findAll();
    }

    @PostMapping
    public <S extends Voiture> S save(@RequestBody S entity) {
        LOGGER.info("Sauvegarde d'une nouvelle voiture");
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Voiture findById(@PathVariable Long id) {
        LOGGER.info("Récupération de la voiture "+id);
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        LOGGER.warn("Suppression de la voiture avec l'id "+id);
        service.deleteById(id);
    }

    @GetMapping("{id}/moteur")
    public Moteur trouverLeMoteurDuneVoiture(@PathVariable Long id){
        return this.service.trouverLeMoteurDuneVoiture(id);
    }
}
