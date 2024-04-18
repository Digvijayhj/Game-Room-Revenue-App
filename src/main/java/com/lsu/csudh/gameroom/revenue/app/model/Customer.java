package com.lsu.csudh.gameroom.revenue.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@JsonDeserialize
@JsonSerialize
@NoArgsConstructor
@JsonIgnoreProperties
public class Customer {

    @Getter
    @Setter
    private Long studentId;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String amount;
    @Getter
    @Setter
    private String time;
    @Getter
    @Setter
    private String type;

}
