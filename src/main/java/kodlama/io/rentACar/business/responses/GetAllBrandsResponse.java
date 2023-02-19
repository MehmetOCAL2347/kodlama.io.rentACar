package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetAllBrandsResponse {
    /*
    Burada amaç son kullanıcıya DB'deki tüm bilgiler göndermeyiz. Bu örnekte DB'de bulunan tüm değerleri döndürmüşüz
    gibi gözüküyor fakat normalde birden çok sütun olur hepsini kullanıcıya göndermek istemeyiz
     */
    private int id;
    private String name;
}
