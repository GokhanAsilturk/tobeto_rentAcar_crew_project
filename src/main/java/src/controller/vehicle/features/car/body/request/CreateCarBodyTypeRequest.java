package src.controller.vehicle.features.car.body.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarBodyTypeRequest {

    @NotBlank(message = "Body Type adı boş geçilemez")
    @Size(min = 2, message = "Body Type en az 2 karakter olmalıdır.")
    @Pattern(regexp = "^[a-zA-ZğüşıöçĞÜŞİÖÇ]+$", message = "Body Type sadece harflerden oluşmalıdır.")
    String carBodyTypeEntityName;


}
