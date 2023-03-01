package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> { // BrandDao olarak ta kullanılabilir
    //boolean existByName(String name); // JPA exist gördüğü zaman bizim için true | false şeklinde değer döner
    // Spring jpa keywords araştırılacak
}
