package th.prior.training.car.factory.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import th.prior.training.car.factory.serialization.DateTimeDeserializer;
import th.prior.training.car.factory.serialization.DateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "type_car_info")
@Table(name = "type_car_info")
@Data
public class TypeCarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="type_id")
    private int typeId;

    @Column(name = "type_group")
    private String typeGroup;

    @Column(name = "type_part")
    private String typePart;

    @Column(name = "type_amount")
    private int typeAmount;

    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonSerialize(using = DateTimeSerializer.class)
    @Column(name = "type_create_date")
    private LocalDateTime typeCreateDate;

    @Column(name = "is_active")
    private String isActive;
}
