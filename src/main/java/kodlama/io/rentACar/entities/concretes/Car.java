package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id // Bu değişken bir primary keydir anlamına gelir
    @GeneratedValue(strategy = GenerationType.IDENTITY) //bu değeri 1 er 1 er artır otomatik olarak anlamına gelir
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private String plate; // Plaka

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state; // 1.Available, 2.Rented, 3.Maintanance  --> Durumu

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
