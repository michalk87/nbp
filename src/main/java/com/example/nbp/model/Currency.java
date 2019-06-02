package com.example.nbp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {

    private String currency;

    private String code;

    private List<Rate> rates = new ArrayList<>();

}
