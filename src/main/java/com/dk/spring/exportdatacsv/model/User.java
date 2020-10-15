package com.dk.spring.exportdatacsv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

//    Enable columns positions if you want to
//    have your customs order.

//    @CsvBindByPosition(position = 0)
    private long id;
//    @CsvBindByPosition(position = 1)
    private String name;
//    @CsvBindByPosition(position = 2)
    private String email;
//    @CsvBindByPosition(position = 3)
    private String country;
//    @CsvBindByPosition(position = 4)
    private int age;

}
