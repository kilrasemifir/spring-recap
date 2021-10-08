package semifir.kira.recap.conducteur.models;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import semifir.kira.recap.models.Voiture;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="conducteurs")
@Data
public class Conducteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nom", nullable = false)
    private String nom;
    private String prenom;

    @ManyToMany
    @JoinTable(
            name = "ma_table_de_jointure",
            joinColumns = @JoinColumn(name = "toto_id"),
            inverseJoinColumns = @JoinColumn(name = "tuture_id")
    )
    private List<Voiture> voitures;

    @ManyToMany
    @Fetch(FetchMode.SELECT)
    private List<Conducteur> amis;
}
