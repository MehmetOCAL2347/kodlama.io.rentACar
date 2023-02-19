package kodlama.io.rentACar.business.requests;

import lombok.Getter;
import lombok.Setter;

/**
 Kullanıcıdan gelecek olan requestleri düzenlemek için kullacağız.
 Request içerisinde kullanıcıdan isim bilgisi gelsin istediğimiz için sadece name bilgisini değişken olarak verdik
 */
@Getter
@Setter
public class CreateBrandRequest {
    private String name;
}
