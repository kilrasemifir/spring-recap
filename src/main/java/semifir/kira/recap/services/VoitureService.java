package semifir.kira.recap.services;

import semifir.kira.recap.models.Moteur;
import semifir.kira.recap.models.Voiture;

public interface VoitureService extends CRUDService<Voiture>{

    Moteur trouverLeMoteurDuneVoiture(Long id);
}
