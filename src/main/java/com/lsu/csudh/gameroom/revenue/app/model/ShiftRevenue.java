package com.lsu.csudh.gameroom.revenue.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDate;

@ToString
@JsonDeserialize
@JsonSerialize
@NoArgsConstructor
@JsonIgnoreProperties
public class ShiftRevenue {

    @Getter
    private Date date = Date.valueOf(LocalDate.now());
    @Getter
    @Setter
    private Long attendantId;
    @Getter
    @Setter
    private String attendantName;
    @Getter
    @Setter
    private String cardTotal;
    @Getter
    @Setter
    private String cashTotal;
    @Getter
    @Setter
    private String total;

}
