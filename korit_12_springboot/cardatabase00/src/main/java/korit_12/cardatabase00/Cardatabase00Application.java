package korit_12.cardatabase00;

import korit_12.cardatabase00.entity.Car;
import korit_12.cardatabase00.entity.Owner;
import korit_12.cardatabase00.repository.CarRepository;
import korit_12.cardatabase00.repository.OwnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Cardatabase00Application implements CommandLineRunner {
	private final CarRepository carRepository;
	private final OwnerRepository ownerRepository;

	public Cardatabase00Application(CarRepository carRepository, OwnerRepository ownerRepository) {
		this.carRepository = carRepository;
		this.ownerRepository = ownerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Cardatabase00Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner0 = new Owner("김", "영");
		Owner owner1 = new Owner("김", "일");

		ownerRepository.save(owner0);
		ownerRepository.save(owner1);

		Car car0 = new Car("르노", "QM6", "회색", "987나6543", 2026, 1234567, owner0);
		Car car1 = new Car("기아", "셀토스", "차콜그레이", "370수5690", 2020, 12345670, owner1);

		carRepository.saveAll(Arrays.asList(car0, car1));
	}
}
