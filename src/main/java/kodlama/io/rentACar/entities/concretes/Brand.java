package kodlama.io.rentACar.entities.concretes;
import jakarta.persistence.*;
import lombok.*;

//@Data // @Getter + @Setter = @Data
@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor // Constructor oluturacağı anlamına gelir
@NoArgsConstructor // Parametresiz constructor oluşturulması için de gerekli
@Entity
public class Brand {

    @Id // Bu değişken bir primary keydir anlamına gelir
    @GeneratedValue(strategy = GenerationType.IDENTITY) //bu değeri 1 er 1 er artır otomatik olarak anlamına gelir
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
