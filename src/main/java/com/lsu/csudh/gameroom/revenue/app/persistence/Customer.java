package com.lsu.csudh.gameroom.revenue.app.persistence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CUSTOMER", schema = "LSU")
@ToString
@JsonDeserialize
@JsonSerialize
@NoArgsConstructor
@JsonIgnoreProperties
public class Customer {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(name = "STUDENT_ID", nullable = false)
    private Long studentId;
    @Getter
    @Setter
    @Column(name = "NAME", nullable = false)
    private String name;
    @Getter
    @Setter
    @Column(name = "AMOUNT", nullable = false)
    private String amount;
    @Getter
    @Setter
    @Column(name = "TIME", nullable = false)
    private String time;
    @Getter
    @Setter
    @Column(name = "TYPE", nullable = false)
    private String type;

}
