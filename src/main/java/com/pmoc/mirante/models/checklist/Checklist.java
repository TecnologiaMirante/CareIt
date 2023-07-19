package com.pmoc.mirante.models.checklist;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Table(name = "checklist")
@Entity
@Getter
@Setter
public class Checklist implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tpequipamento_id")
    private TipoEquipamento tipoEquipamento;

    @Column(nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "checklist")
    private List<Tarefas> tarefa;

    @ManyToMany
    @JoinTable(name = "checklist_template",
    joinColumns = @JoinColumn(name = "checklist_fk"),
            inverseJoinColumns = @JoinColumn(name = "template_fk")
    )
    private List<Template> templates;

}
