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
    private int typeId;
    private String typeGroup;
    private String typePart;
    private int typeAmount;
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonSerialize(using = DateTimeSerializer.class)
    private LocalDateTime typeCreateDate;
    private String isActive;
}
