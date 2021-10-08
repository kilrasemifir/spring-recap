package semifir.kira.recap.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import semifir.kira.recap.models.Moteur;
import semifir.kira.recap.services.MoteurService;

public class MoteurServiceImpl extends AbstractCRUDService<Moteur> implements MoteurService {

    public MoteurServiceImpl(JpaRepository<Moteur, Long> repository) {
        super(repository, "moteur");
    }
}
