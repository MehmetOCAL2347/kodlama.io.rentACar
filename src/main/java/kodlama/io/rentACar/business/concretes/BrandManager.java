package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandServise;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service  // Bir business nesnesi olduğunu anlatmak için
@AllArgsConstructor
public class BrandManager implements BrandServise {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    //Autowired yerine @AllArgsConstructor kullandık classın üstünde
    /*@Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }*/

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        // Neyi neye çevircemizi soyluyoruz, cretateBrandRequest objemizi Brand'e çeviriyor
        Brand brand = this.modelMapperService.forRequests().map(createBrandRequest, Brand.class);
        this.brandRepository.save(brand);

    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();
        /*List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();

        for (Brand brand: brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        */
        List<GetAllBrandsResponse> brandsResponses = brands
                .stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class))
                .collect(Collectors.toList());


        return brandsResponses;
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequests().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
        return response;
    }
}
