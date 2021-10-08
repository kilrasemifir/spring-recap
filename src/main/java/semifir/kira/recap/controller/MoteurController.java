package semifir.kira.recap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semifir.kira.recap.models.Moteur;
import semifir.kira.recap.services.MoteurService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("moteurs")
public class MoteurController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MoteurController.class);

    @Autowired
    private MoteurService service;

    @GetMapping("")
    public List<Moteur> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public <S extends Moteur> S save(@RequestBody  S entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Moteur findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
