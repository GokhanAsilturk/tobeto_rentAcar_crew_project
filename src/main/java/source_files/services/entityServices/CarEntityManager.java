package source_files.services.entityServices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import source_files.data.models.vehicleEntities.CarEntity;
import source_files.dataAccess.vehicleRepositories.CarRepository;
import source_files.services.entityServices.abstracts.CarEntityService;

import java.util.List;

@AllArgsConstructor
@Service
public class CarEntityManager implements CarEntityService {

    private final CarRepository carRepository;

    @Override
    public CarEntity add(CarEntity carEntity) {
        return this.carRepository.save(carEntity);
    }

    @Override
    public CarEntity update(CarEntity carEntity) {
        //CarEntity uptatedCar = carRepository.findById(id).orElseThrow();
        return this.carRepository.save(carEntity);
    }

    @Override
    public CarEntity getById(int id) {
        return this.carRepository.findById(id).orElseThrow();
    }

    @Override
    public List<CarEntity> getAll() {
        return this.carRepository.findAll();
    }

    @Override
    public List<CarEntity> getAllByIsDeletedFalse() {
        return null;
    }

    @Override
    public List<CarEntity> getAllByIsDeletedTrue() {
        return null;
    }

    @Override
    public void delete(CarEntity carEntity) {
        this.carRepository.delete(carEntity);
    }
}
