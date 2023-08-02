package com.pmoc.mirante.models.checklist;

import com.pmoc.mirante.models.tarefa.Task;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tpequipamento_id")
    private TipoEquipamento tipoEquipamento;

    @Column(nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "checklist", fetch = FetchType.EAGER)
    private List<Task> tasks;

    @ManyToMany(mappedBy = "checklists", fetch = FetchType.EAGER)
    private List<Template> templates;

}
