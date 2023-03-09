package com.projekt.projektfx.entities;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "Messages")
public class Messages {
    @Id
    @Column(name = "Message_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;

    // Sender ID (Foreign Key)
    //    @ManyToOne(targetEntity = Sender.class)
    //    @JoinColumn(name = "")
    //    private Sender user;

    // Recipient ID (Foreign Key)
    //    @ManyToOne(targetEntity = Recipient.class)
    //    @JoinColumn(name = "")
    //    private Recipient user;

    @Column(name = "Message_Content", length = 50)
    private String groupName;

    @Column(name = "Timestaps")
    private Timestamp timestamp;
}
