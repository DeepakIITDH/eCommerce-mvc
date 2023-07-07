package com.abc.ecommerce.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private String name;
    private int cost;
    private String url;
    private String description;
}
