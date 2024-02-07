package source_files.services.entityServices.abstracts;

import source_files.data.models.DrivingLicenseTypeEntity;

import java.util.List;

public interface DrivingLicenseTypeEntityService {
    DrivingLicenseTypeEntity create(DrivingLicenseTypeEntity drivingLicenseTypeEntity);

    DrivingLicenseTypeEntity update(DrivingLicenseTypeEntity drivingLicenseTypeEntity);

    void delete(DrivingLicenseTypeEntity drivingLicenseTypeEntity);

    DrivingLicenseTypeEntity getById(int id);

    List<DrivingLicenseTypeEntity> getAll();

    List<DrivingLicenseTypeEntity> getAllByDeletedState(boolean isDeleted);
}