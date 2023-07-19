package com.pmoc.mirante.models.tarefa;

import com.pmoc.mirante.models.checklist.Checklist;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "tarefa")
@Entity
@Getter
@Setter
public class Tarefa implements Serializable {

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

    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
    //atributo de documento
}
