package th.prior.training.car.showroom.component.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


public interface BaseTransformComponent <M,E>{

    public M transFormEntityToModel(E e);

    public E transFormModelToEntity(M m);

    public void updateEntityByModel(E e, M m);

    public String modelToJson(M m) throws JsonProcessingException;

    public M jsonToModel(String json);
}
