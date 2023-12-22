package source_files.data.requests.userRequests;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import source_files.data.types.DrivingLicenseType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateCustomerRequest {
    int id;
    @NotBlank(message = "Müşteri adı boş geçilemez")
    @Size(min = 2, max = 20)
    String name;

    @NotBlank(message = "Müşteri soyadı boş geçilemez")
    @Size(min = 2, max = 20)
    String surname;

    @Email//-> Email alırken @gmail @hotmail gibi kullanımları denetler.
    @NotBlank(message = "Müşteri mail adresi boş geçilemez")
    String emailAddress;

    @Size(min = 8, max = 30)
    @NotBlank(message = "Müşteri şifresi boş geçilemez")
    String password;

    @NotBlank(message = "Müşteri telefon numarası boş geçilemez")
    @Size(min = 10, max = 10,message = "Telefon numarası 10 hane olmalıdır.")
    String phoneNumber;

    @Size(max = 6,message = "Ehliyet seri numarası 6 haneli olmalıdır.")
    String drivingLicenseNumber;

    @Size(min = 1, max = 16, message = "Sürücü belgesi türü listesi 1 ile 16 arasında olmalıdır.")
    List<DrivingLicenseType> drivingLicenseTypes;
}