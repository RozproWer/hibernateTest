package com.projekt.projektfx.entities;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "User_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "Username", length = 50)
    private String username;

    // Need hashing(other table)
    @Column(name = "Password", length = 50)
    private String password;

    @Column(name = "Email_Address", length = 100)
    private String emailAddress;

    @Column(name = "First_Name", length = 50)
    private String firstName;

    @Column(name = "Last_Name", length = 50)
    private String lastName;

    // (Doctor, Patient, Admin)?
    @Enumerated(EnumType.STRING)
    @Column(name = "Role")
    private String role;

    // Group ID (Foreign Key)
    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "Group_ID")
    private Groups group;

}
