package com.pmoc.mirante.models.checklist;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Table(name = "template")
@Entity
@Getter
@Setter
public class Template implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 120)
    private String name;

    @ManyToMany // Remover o mappedBy, pois a propriedade é mapeada na outra classe
    @JoinTable(name = "checklist_template",
            joinColumns = @JoinColumn(name = "template_fk"),
            inverseJoinColumns = @JoinColumn(name = "checklist_fk")
    )
    private List<Checklist> checklists;
}
