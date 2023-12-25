package source_files.data.requests.itemRequests.VehicleFeaturesRequests.CarBodyTypeRequests;

import jakarta.validation.constraints.Size;
import lombok.*;
import source_files.data.requests.BaseRequest;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarBodyTypeRequest extends BaseRequest {
    int id;
    @Size(min = 2, message = "Body Type en az 2 karakter olmalıdır.")
    String name;
}
