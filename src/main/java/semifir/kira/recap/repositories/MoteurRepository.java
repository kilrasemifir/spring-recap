package semifir.kira.recap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import semifir.kira.recap.models.Moteur;

public interface MoteurRepository extends JpaRepository<Moteur, Long> {
}
