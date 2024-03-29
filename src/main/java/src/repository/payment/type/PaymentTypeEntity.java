package src.repository.payment.type;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import src.controller.payment.type.response.PaymentTypeResponse;
import src.core.BaseEntity;
import src.service.payment.type.model.DefaultPaymentType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder(builderMethodName = "paymentTypeBuilder")
@Table(name = "payment_type")
public class PaymentTypeEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private DefaultPaymentType paymentType;

    @Column(name = "is_active")
    private boolean isActive = true;

    public PaymentTypeResponse toModel() {
        return PaymentTypeResponse.builder()
                .id(getId())
                .name(getName())
                .isActive(isActive())
                .build();
    }
}
