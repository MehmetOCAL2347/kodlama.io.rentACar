package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {

    // Bütün iş kurallarını void ile yazıcaz ???

    private BrandRepository brandRepository;

    /**
     *
     * @param name
     * Marka ismi tekrar ediyor mu kontrol sağlayacağız
     */
    public void checkIfBrandNameExist(String name){
        //if(this.brandRepository.existByName(name)){
            /*
            1. Java exception types, runtime değil de normal exception fırlatırsak throws ile belirtmek gerekir
                Fakat bunun yerine kendi exception classımızı oluşturcaz. Çünkü sadece runtime exceptions business
                katmanında alınmayabilir. Bunu ayırt etmemiz gerekir

            throw new RuntimeException("Brand already exists");

             */

            //throw new BusinessException("Business already exists");

        //}
    }

}
