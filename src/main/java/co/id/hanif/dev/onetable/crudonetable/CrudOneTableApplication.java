package co.id.hanif.dev.onetable.crudonetable;

import co.id.hanif.dev.onetable.crudonetable.entity.Student;
import co.id.hanif.dev.onetable.crudonetable.repository.RepositoryStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudOneTableApplication {

	private static final Logger log = LoggerFactory.getLogger(CrudOneTableApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CrudOneTableApplication.class, args);

	}

//	@Bean
//	public CommandLineRunner demo(RepositoryStudent repository) {
//		return (args) -> {
//			// save a few customers
//			repository.save(new Student("10511173", "Muhamad Hanif Muhsin"));
//			repository.save(new Student("10511148", "Dimas Maryanto"));
//
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Student student : repository.findAll()) {
//				log.info(student.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.findById(1L);
//			log.info("Customer found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			//  log.info(bauer.toString());
//			// }
//			log.info("");
//		};
//	}
}
