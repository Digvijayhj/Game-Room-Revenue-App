package com.lsu.csudh.gameroom.revenue.app.persistence;

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

@Entity
@Table(name = "SHIFT_REVENUE", schema = "LSU")
@ToString
@JsonDeserialize
@JsonSerialize
@NoArgsConstructor
@JsonIgnoreProperties
public class ShiftRevenue {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shiftId;

    @Getter
    private Date date = Date.valueOf(LocalDate.now());

    @Getter
    @Setter
    @Column(name = "ATTENDANT_ID", nullable = false)
    private Long attendantId;
    @Getter
    @Setter
    @Column(name = "ATTENDANT_NAME", nullable = false)
    private String attendantName;
    @Getter
    @Setter
    @Column(name = "CARD_TOTAL", nullable = false)
    private String cardTotal;
    @Getter
    @Setter
    @Column(name = "CASH_TOTAL", nullable = false)
    private String cashTotal;
    @Getter
    @Setter
    @Column(name = "TOTAL")
    private String total;

}
