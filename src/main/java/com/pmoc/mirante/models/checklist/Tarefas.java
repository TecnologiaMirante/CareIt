package com.pmoc.mirante.models.checklist;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
