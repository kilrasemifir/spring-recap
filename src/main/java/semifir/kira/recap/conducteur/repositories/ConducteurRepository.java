package semifir.kira.recap.conducteur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import semifir.kira.recap.conducteur.models.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long> {
}
