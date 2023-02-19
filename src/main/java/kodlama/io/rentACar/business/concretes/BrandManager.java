package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandServise;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service  // Bir business nesnesi olduğunu anlatmak için
@AllArgsConstructor
public class BrandManager implements BrandServise {

    private BrandRepository brandRepository;

    //Autowired yerine @AllArgsConstructor kullandık classın üstünde
    /*@Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }*/

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();

        for (Brand brand: brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }

        return brandsResponses;
    }
}
