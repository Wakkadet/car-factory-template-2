package th.prior.training.car.factory.model.req;

import lombok.Data;

import java.util.Date;

@Data
public class BuyOrderReq {

    private String buyerName;

    private String OrderStatus;

    private String orderCarType;

    private Date orderDate;

    private String inActive;
}
