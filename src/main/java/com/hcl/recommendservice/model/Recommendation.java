package com.hcl.recommendservice.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recommendations")
@Data
public class Recommendation {
    @Id
    @GeneratedValue
    private Long recommendationId;

    @NotBlank
    private Long destId;

    @NotBlank
    private String author;

    @NotBlank
    private int rate;

    @NotBlank
    private String content;

//    public Recommendation(){
//        super();
//    }
//
//    public Recommendation(Long recommendationId, Long destId, String author, int rate, String content) {
//        super();
//        this.recommendationId = recommendationId;
//        this.destId = destId;
//        this.author = author;
//        this.rate = rate;
//        this.content = content;
//    }





}
