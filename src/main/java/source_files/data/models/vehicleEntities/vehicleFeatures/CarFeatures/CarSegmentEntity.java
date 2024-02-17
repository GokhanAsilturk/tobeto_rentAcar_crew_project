package source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import source_files.data.models.baseEntities.BaseEntity;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_segments")
public class CarSegmentEntity extends BaseEntity {

    @Column(name = "name", unique = true)
    private String name;
}
