package korit_12.cardatabase00.repository;

import korit_12.cardatabase00.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
