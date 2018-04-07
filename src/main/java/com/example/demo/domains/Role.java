package com.example.demo.domains;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Role extends BaseEntity {

    private String name;

}
