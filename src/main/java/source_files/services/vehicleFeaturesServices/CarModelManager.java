package source_files.services.vehicleFeaturesServices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import source_files.data.DTO.Mappers.ModelMapperService;
import source_files.data.DTO.itemDTOs.CarModelDTO;
import source_files.data.models.vehicleEntities.vehicleFeatures.CarFeatures.CarModelEntity;
import source_files.data.requests.itemRequests.VehicleFeaturesRequests.CarModelRequests.AddCarModelRequest;
import source_files.data.requests.itemRequests.VehicleFeaturesRequests.CarModelRequests.UpdateCarModelRequest;
import source_files.services.entityServices.abstracts.vehicleFeaturesAbstracts.CarModelEntityService;
import source_files.services.vehicleFeaturesServices.abstracts.CarModelService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarModelManager implements CarModelService {

    private final CarModelEntityService carModelEntityService;
    private final ModelMapperService modelMapperService;

    @Override
    public CarModelDTO add(AddCarModelRequest addCarModelRequest) {
        CarModelEntity carModelEntity = modelMapperService.forRequest().map(addCarModelRequest, CarModelEntity.class);
        CarModelDTO carModelDTO = modelMapperService.forResponse().map(carModelEntityService.add(carModelEntity), CarModelDTO.class);
        return carModelDTO;
    }

    @Override
    public CarModelDTO update(UpdateCarModelRequest updateCarModelRequest) {
        CarModelEntity  carModelEntity = modelMapperService.forRequest().map(updateCarModelRequest, CarModelEntity.class);
        carModelEntity = carModelEntityService.updateCarModel(carModelEntity);
        return modelMapperService.forResponse().map(carModelEntity, CarModelDTO.class);
    }

    @Override
    public CarModelDTO getById(int id) {
        CarModelDTO carModelDTO = modelMapperService.forResponse().map(carModelEntityService.getCarModelById(id), CarModelDTO.class);
        return carModelDTO;
    }

    @Override
    public void delete(int id) {
        carModelEntityService.deleteCarModel(carModelEntityService.getCarModelById(id));
    }

    @Override
    public List<CarModelDTO> getAll() {
        List<CarModelEntity> carModelEntities = carModelEntityService.getAllCarModel();
        List<CarModelDTO> carModelDTOS = carModelEntities.stream().map(carModel ->
                modelMapperService.forResponse().map(carModel, CarModelDTO.class)).collect(Collectors.toList());
        return carModelDTOS;
    }

}
