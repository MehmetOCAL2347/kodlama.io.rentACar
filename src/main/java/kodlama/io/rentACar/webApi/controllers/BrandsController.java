package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandServise;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Rest controller oldugunu belirledik
@RequestMapping("/api/brands") // Adresleme -> request atacağımız adres
public class BrandsController { // Api isimleri çoğul verilir

    private BrandServise brandServise;

    @Autowired // Springin yeni versiyonlarında yazmasakta oluyor
    public BrandsController(BrandServise brandServise) {
        this.brandServise = brandServise;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandServise.getAll();
    }
}
