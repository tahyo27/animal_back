package com.animal.anirest.domain.animals;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String imgUrl;

}
