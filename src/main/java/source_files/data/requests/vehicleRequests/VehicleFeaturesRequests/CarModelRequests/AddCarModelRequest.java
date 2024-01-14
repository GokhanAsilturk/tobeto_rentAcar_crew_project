package source_files.data.requests.vehicleRequests.VehicleFeaturesRequests.CarModelRequests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import source_files.data.requests.BaseRequest;

@Getter
@Setter
public class AddCarModelRequest implements BaseRequest {
    @NotBlank(message = "Model adı boş geçilemez")
    @Size(min = 2, message = "Model en az 2 karakter olmalıdır.")
    String carModelEntityName;

    @NotBlank(message = "Marka boş geçilemez")
    int brandEntityId;
}