package com.projekt.projektfx.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tasks")
public class Tasks {
    @Id
    @Column(name = "Task_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;

    @Column(name = "Task_Name", length = 50)
    private String groupName;

    @Column(name = "Task_Description", length = 254)
    private String taskDescription;

    // (Pending, In Progress, Completed, Overdue)
    @Enumerated(EnumType.STRING)
    @Column(name = "Task_Status")
    private String taskStatus;

    // (High, Medium, Low)
    @Enumerated(EnumType.STRING)
    @Column(name = "Task_Priority")
    private String taskPriority;

    // Due Date
    @Column(name = "Due_Date")
    private LocalDate dueDate;

// Assigned to ID(Foreign Key) ?
//    @ManyToOne(targetEntity = Users.class)
//    @JoinColumn(name = "")
//    private Users user;

}
