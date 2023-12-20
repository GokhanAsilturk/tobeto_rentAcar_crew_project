package source_files.dataAccess.vehicleFeaturesRespositories;

import org.springframework.data.jpa.repository.JpaRepository;
import source_files.data.models.paperWorkEntities.rentalEntities.RentalEntity;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.BrandEntity;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.ColorEntity;

import java.util.List;

public interface ColorRepository extends JpaRepository<ColorEntity, Integer> {
    boolean existsByName(String colorName);

    List<ColorEntity> findAllByIsDeletedFalse();

    List<ColorEntity> findAllByIsDeletedTrue();
}
