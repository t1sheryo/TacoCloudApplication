package com.tacocloud.impl.model;

import lombok.Data;

import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos;

    public void addTaco(Taco taco){
        tacos.add(taco);
    }

    // TODO : add more actions with order
}
