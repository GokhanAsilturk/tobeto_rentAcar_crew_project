package source_files.data.requests.itemRequests.VehicleFeaturesRequests.ColorRequests;

import jakarta.validation.constraints.Size;
import lombok.*;
import source_files.data.requests.BaseRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddColorRequest extends BaseRequest {
    @Size(min = 2, message = "Renk en az 2 karakter olmalıdır.")
    String colorEntityName;
}
