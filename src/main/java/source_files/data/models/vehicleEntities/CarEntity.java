package source_files.data.models.vehicleEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import source_files.data.models.baseEntities.Vehicle;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.CarBodyTypeEntity;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.CarModelEntity;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@SuperBuilder
@Table(name = "cars")
public class CarEntity extends Vehicle {

    @ManyToOne
    @JoinColumn(name = "body_type_id")
    private CarBodyTypeEntity bodyTypeEntity;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private CarModelEntity carModelEntity;

    @Column(name = "license_plate", unique = true)
    private String licensePlate;

    @Column(name = "kilometer")
    private Integer kilometer;

    //todo : shot tipinde minFindexRate diye bir alan ekledi hoca araba kiralamalarda kullanılıyormuş
    //todo : imagePath eklenecek yada birden fazla resim varsa başka tabloda tut
}