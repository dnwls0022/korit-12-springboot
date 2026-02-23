package korit_12.cardatabase00.repository;

import korit_12.cardatabase00.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "vehicles")
public interface CarRepository extends JpaRepository<Car, Long> {
        //브랜드로자동차검색
    List<Car> findByBrand(@Param("brand") String brand);
        //섹상으로 자동차검색
    List<Car> findByColor(@Param("color") String color);


}


