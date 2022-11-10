package com.jai.shoppingmall;

import java.util.ArrayList;
import com.jai.shoppingmall.entities.Brand;
import com.jai.shoppingmall.entities.Model;
import com.jai.shoppingmall.repository.BrandRespository;
import com.jai.shoppingmall.repository.ModelRepository;
public class App {
	public static void main(String[] args) {// inserting objects to the brand repo

	new Thread( ()->{
			ArrayList<Brand> brand = new ArrayList<>();
			brand.add(new Brand(1, "Puma", "1996", "2050cr", "USA"));
			brand.add(new Brand(2, "Nike", "1952", "2560cr", "Canada"));
//			creating instance for BrandRepository
			BrandRespository brandRespository = new BrandRespository();
			
//			brandRespository.saveBrandDetails(brand);
		Brand b=	brandRespository.getBrand(1);
			System.out.println(b);
//	        brandRespository.deleteBrand(2);
		}).start();
		
	new Thread(()->{
		// inserting objects to the model repo
		ArrayList<Model> model = new ArrayList<>();
		model.add(new Model(1, "sneaker", "puma", 2500.00, "black"));
		model.add(new Model(2, "shoes", "adidas", 2999.00, "red"));
//		creating instance for ModelRepository
		ModelRepository modelRepository = new ModelRepository();
		modelRepository.saveModelDetails(model);
//        modelRepository.deleteModel(2);
	});
	}
}
