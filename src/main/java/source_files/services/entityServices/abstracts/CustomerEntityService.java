package source_files.services.entityServices.abstracts;

import source_files.data.models.userEntities.CustomerEntity;

import java.util.List;

public interface CustomerEntityService {
    CustomerEntity getByPhoneNumber();
}
