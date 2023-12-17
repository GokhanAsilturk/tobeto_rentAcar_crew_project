package source_files.services.entityServices.vehicleFeaturesEntityManagers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.ColorEntity;
import source_files.dataAccess.vehicleFeaturesRespositories.ColorRepository;
import source_files.services.entityServices.abstracts.vehicleFeaturesAbstracts.ColorEntityService;

import java.util.List;

@Service
@AllArgsConstructor
public class ColorEntityManager implements ColorEntityService {

    private final ColorRepository colorRepository;

    @Override
    public ColorEntity add(ColorEntity colorEntity) {
        return colorRepository.save(colorEntity);
    }

    @Override
    public ColorEntity update(ColorEntity colorEntity) {
        return colorRepository.save(colorEntity);
    }

    @Override
    public ColorEntity getById(int id) {
        return colorRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(ColorEntity colorEntity) {
        colorRepository.delete(colorEntity);
    }

    @Override
    public List<ColorEntity> getAll() {
        return colorRepository.findAll();
    }
}