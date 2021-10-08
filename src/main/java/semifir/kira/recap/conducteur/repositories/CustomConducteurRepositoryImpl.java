package semifir.kira.recap.conducteur.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import semifir.kira.recap.conducteur.models.Conducteur;

@Repository
public class CustomConducteurRepositoryImpl implements CustomConducteurRepository {

    private static RowMapper<Conducteur> mapper = (resultSet, index) -> {
        Conducteur result = new Conducteur();
        Long idConducteur = resultSet.getLong("id");
        String nom = resultSet.getString("nom");
        String prenom = resultSet.getString("prenom");
        result.setId(idConducteur);
        result.setNom(nom);
        result.setPrenom(prenom);
        return result;
    };

    @Autowired
    private JdbcTemplate template;

    @Override
    public Conducteur trouverParId(Long id) {

        return template.queryForObject("SELECT id, nom, prenom FROM conducteurs WHERE id=?", Conducteur.class, id);
    }

}
