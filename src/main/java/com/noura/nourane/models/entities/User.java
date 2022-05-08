package com.noura.nourane.models.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="users")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeUser")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter private Long id;
    @Column(name = "firstname") @NotNull @Getter @Setter private String firstname;
    @Column(name = "lastname") @NotNull @Getter @Setter private String lastname;
    @Column(name="email") @NotNull @Getter @Setter private String email;
    @Column(name="password") @NotNull @Getter @Setter private String password;
    @Column(name="avatar") @NotNull @Getter @Setter private String avatarUrl;
    @Column(name="typeUser") @NotNull @Getter @Setter private String typeUser;
}
