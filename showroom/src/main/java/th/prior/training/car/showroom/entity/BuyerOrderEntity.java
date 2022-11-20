package th.prior.training.car.showroom.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Table(name = "BUYER_ORDER")
@Entity(name = "BUYER_ORDER")
@Data
public class BuyerOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String buyerName;
    private String orderStatus;
    private String orderCarType;
    private LocalDateTime orderDate;
    private String isActive;

}
