package com.pmoc.mirante.models.switcher;

import com.pmoc.mirante.enums.Categories;
import com.pmoc.mirante.enums.Status;
import com.pmoc.mirante.models.gerais.DadosGerais;
import com.pmoc.mirante.models.gerais.Gerais;
import com.pmoc.mirante.models.station.StationModel;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "switch")
@Entity
@Getter
@Setter
public class SwitcherModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Embedded
    private DadosGerais gerais;
    @Column(nullable = false, length = 100)
    private int qtd_portas;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 100)
    private Categories category;
    @ManyToOne
    @JoinColumn(name = "station_id")
    private StationModel station;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

}
