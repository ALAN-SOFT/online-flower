package com.cl.flower.domain;

import lombok.Data;

@Data
public class Goods {
    private Integer id;
    private String name;
    private String info;
    private String picture;
    private Integer number;
    private Double price;
    private Integer typeId;
}
