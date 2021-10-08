package semifir.kira.recap.conducteur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semifir.kira.recap.conducteur.models.Conducteur;
import semifir.kira.recap.conducteur.services.ConducteurService;

import java.util.List;

@RestController
@RequestMapping("conducteurs")
@CrossOrigin
public class ConducteurController {

    @Autowired
    private ConducteurService service;

    @GetMapping
    public List<Conducteur> findAll() {
        return service.findAll();
    }

    @PostMapping
    public <S extends Conducteur> S save(@RequestBody S entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Conducteur findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
