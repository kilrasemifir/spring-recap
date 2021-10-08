package semifir.kira.recap.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="voitures")
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marque;
    private String model;

    @ManyToOne(cascade = CascadeType.ALL)
    private Moteur moteur;


}
