package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "models")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model { // Araçlara ait modelleri kullanacağız

    @Id // Bu değişken bir primary keydir anlamına gelir
    @GeneratedValue(strategy = GenerationType.IDENTITY) //bu değeri 1 er 1 er artır otomatik olarak anlamına gelir
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Brand brand;

}
