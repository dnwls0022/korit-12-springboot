package korit_12.cardatabase00.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Schema(description = "자동차 엔티티 모델")
@Entity
@RequiredArgsConstructor

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "자동 생성되는 고유 id", example = "1")
    private Long id;

    @Schema(description = "자동차 모델명", example = "현대")
    private String brand;
    @Nonnull
    @Schema(description = "자동차 이름", example = "팰리세이드")
    private String model;
    @Nonnull
    @Schema(description = "자동차 색상", example = "회색")
    private String color;
    @Nonnull
    @Schema(description = "자동차 연식", example = "32434431")
    private String registrationNumber;
    @Setter
    @Nonnull
    @Schema(description = "자동차 년도", example = "2024")
    private int modelYear;
    @Setter
    @Schema(description = "자동차 가격", example = "45000000")
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    @JsonIgnore
    private Owner owner;

    public Car() {}

    public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getPrice() {
        return price;
    }

}
