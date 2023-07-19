package com.pmoc.mirante.models.checklist;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tarefa")
@Entity
@Getter
@Setter
public class Tarefas {
    @Column(nullable = false, length = 120)
    private String description;
    @Column(nullable = false)
    private Boolean check;
    @ManyToOne
    @JoinColumn(name = "checklist_id")
    private Checklist checklist;
    //atributo de documento
}
