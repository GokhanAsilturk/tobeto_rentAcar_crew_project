package source_files.services.entityServices.abstracts.paperWorkAbstracts;

import source_files.data.models.paperWorkEntities.rentalEntities.RentalEntity;

import java.util.List;

public interface RentalEntityService {

    RentalEntity add(RentalEntity rentalEntity);

    RentalEntity update(RentalEntity rentalEntity);

    void delete(RentalEntity rentalEntity);

    RentalEntity getById(int id);

    List<RentalEntity> getAll();

    List<RentalEntity> getAllByIsDeletedFalse();

    List<RentalEntity> getAllByIsDeletedTrue();
}
