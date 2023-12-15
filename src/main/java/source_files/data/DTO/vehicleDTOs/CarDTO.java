package source_files.data.DTO.vehicleDTOs;

import lombok.*;
import source_files.data.types.DrivingLicenseType;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    //TODO brand model color bodyType null dönüyor.
    String brandName;
    String modelName;
    String colorName;
    int year;
    String bodyTypeName;
    String details;
    double rentalPrice;
    String licensePlate;
    int kilometer;
    List<DrivingLicenseType> expectedDrivingLicenseTypes;
}
