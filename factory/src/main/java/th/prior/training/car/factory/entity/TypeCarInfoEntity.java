package th.prior.training.car.factory.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import th.prior.training.car.factory.serialization.DateTimeDeserializer;
import th.prior.training.car.factory.serialization.DateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "TYPE_CAR_INFO")
@Table(name = "TYPE_CAR_INFO")
@Data
public class TypeCarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TYPE_ID")
    private int typeId;

    @Column(name = "TYPE_GROUP")
    private String typeGroup;

    @Column(name = "TYPE_PART")
    private String typePart;

    @Column(name = "TYPE_AMOUNT")
    private int typeAmount;

    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonSerialize(using = DateTimeSerializer.class)
    @Column(name = "TYPE_CREATE_DATE")
    private LocalDateTime typeCreateDate;

    @Column(name = "IS_ACTIVE")
    private String isActive;
}
