package com.productservice.productservice;

//import com.productservice.productservice.inheritancerelations.mappedsuperclass.*;
import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication  implements CommandLineRunner {

	private final PriceRepository priceRepository;
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
//	private MentorRepository mentorRepository;
//	private TaRepository taRepository;
//	private StudentRepository studentRepository;
//
//	ProductServiceApplication(@Qualifier("ms_mentorrepository") MentorRepository mentorRepository,
//							  @Qualifier("ms_tarepository") TaRepository taRepository,
//							  @Qualifier("ms_studentrepository") StudentRepository studentRepository) {
//		this.mentorRepository = mentorRepository;
//	}
    public ProductServiceApplication(PriceRepository priceRepository,
									 CategoryRepository categoryRepository,
									 ProductRepository productRepository) {
		this.priceRepository = priceRepository;
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mentor mentor = new Mentor();
//		mentor.setName("Deepak");
//		mentor.setEmail("deepak.kasera@scaler.com");
//		mentor.setAvgRating(4.8);
//
//		mentorRepository.save(mentor);


		//tpc_mentor
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.7);
//        mentorRepository.save(mentor);
//
//
//        Student student = new Student();
//        student.setEmail("abhishek@scaler.com");
//        student.setName("Abhishek");
//        student.setPsp(90.0);
//        studentRepository.save(student);
//
//
//
//        //Get all the Users.
//        List<User> users = userRepository.findAll();
//
//        for (User user1 : users) {
//            System.out.println(user1.toString());
//        }


//		User user = new User();
//		user.setName("Arshi");
//		user.setEmail("arshi@gmail.com");
//		userRepository.save(user);
//
//		Mentor mentor = new Mentor();
//		mentor.setName("Deepak");
//		mentor.setEmail("deepak.kasera@scaler.com");
//		mentor.setAvgRating(4.7);
//		mentorRepository.save(mentor);
//
//		Student student = new Student();
//		student.setName("harsh");
//		student.setEmail("harsh@gmail.com");
//		student.setPsp(99.0);
//		studentRepository.save(student);

		Price price = new Price();
        price.setCurrency("INR");
        price.setValue(40000);
        Price savedPrice = priceRepository.save(price);

		Category category = new Category();
        category.setName("binge");
        Category savedCategoy = categoryRepository.save(category);

		Product product = new Product();
        product.setTitle(" binge");
        product.setDescription(" binge");
        product.setCategory(savedCategoy);
        product.setPrice(savedPrice);
		Product savedProduct = productRepository.save(product);

	}

}
