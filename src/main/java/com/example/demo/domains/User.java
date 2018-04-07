package com.example.demo.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@Table
public class User extends BaseEntity {

    private String username;

    private String password;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
