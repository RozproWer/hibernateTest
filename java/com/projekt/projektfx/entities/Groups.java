package com.projekt.projektfx.entities;

import javax.persistence.*;

@Entity
@Table(name = "Groups")
public class Groups {
    @Id
    @Column(name = "Group_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupID;

    @Column(name = "Group_Name", length = 50)
    private String groupName;

    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "Group_ID")
    private Groups group;

}
