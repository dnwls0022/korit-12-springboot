package com.korit12.cardatabase;

import com.korit12.cardatabase.domain.Car;
import com.korit12.cardatabase.domain.CarRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
@RequiredArgsConstructor
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("애플리케이션이 실행됩니다.");
	}

	// field 선언
	private final CarRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car("현대", "소나타", "검정", "123가4567", 2026, 30000000));
		repository.save(new Car("기아", "K9", "흰색", "987나5432", 2025, 20000000));
		repository.save(new Car("람보르기니", "쿤타치", "빨강", "159다7532", 2010, 130000000));
	}
}
