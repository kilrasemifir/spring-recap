package semifir.kira.recap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import semifir.kira.recap.models.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
