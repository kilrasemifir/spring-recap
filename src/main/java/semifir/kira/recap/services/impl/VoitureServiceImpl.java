package semifir.kira.recap.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import semifir.kira.recap.models.Moteur;
import semifir.kira.recap.models.Voiture;
import semifir.kira.recap.services.CRUDService;
import semifir.kira.recap.services.VoitureService;

public class VoitureServiceImpl extends AbstractCRUDService<Voiture> implements VoitureService {

    public VoitureServiceImpl(JpaRepository<Voiture, Long> repository) {
        super(repository, "voiture");
    }

    @Override
    public Moteur trouverLeMoteurDuneVoiture(Long id) {
        Voiture voiture = this.findById(id);
        return voiture.getMoteur();
    }
}
