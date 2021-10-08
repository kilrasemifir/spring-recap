package semifir.kira.recap.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="moteurs")
public class Moteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marque;
    private String model;

    @OneToMany
    private List<Voiture> voitures;
}
