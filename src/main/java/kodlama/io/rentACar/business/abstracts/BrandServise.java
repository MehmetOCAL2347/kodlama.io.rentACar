package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandServise {
    List<GetAllBrandsResponse> getAll();
}
