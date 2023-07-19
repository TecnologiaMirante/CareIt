package com.pmoc.mirante.models.checklist;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Table(name = "tarefa")
@Entity
@Getter
@Setter
public class Tarefas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 120)
    private String description;
    @Column(nullable = false)
    private Boolean check;
    @ManyToOne
    @JoinColumn(name = "checklist_id")
    private Checklist checklist;
    //atributo de documento
}
