package semifir.kira.recap.conducteur.services;

import semifir.kira.recap.conducteur.models.Conducteur;
import semifir.kira.recap.conducteur.repositories.ConducteurRepository;
import semifir.kira.recap.services.impl.AbstractCRUDService;

public class ConducteurServiceImpl extends AbstractCRUDService<Conducteur> implements ConducteurService {

    public ConducteurServiceImpl(ConducteurRepository repository) {
        super(repository, "conducteur");
    }
}
