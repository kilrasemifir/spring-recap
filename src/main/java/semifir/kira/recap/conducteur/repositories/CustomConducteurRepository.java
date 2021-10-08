package semifir.kira.recap.conducteur.repositories;

import semifir.kira.recap.conducteur.models.Conducteur;

public interface CustomConducteurRepository {

    public Conducteur trouverParId(Long id);

}
