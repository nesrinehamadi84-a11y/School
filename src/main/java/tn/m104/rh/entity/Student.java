package tn.m104.rh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

// premier test de commit
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer rollNumber;
    String name;
    String address;
    Double percentage;

}
