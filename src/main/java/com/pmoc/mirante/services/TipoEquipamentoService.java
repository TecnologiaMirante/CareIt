package com.pmoc.mirante.services;

import com.pmoc.mirante.models.checklist.TipoEquipamento;

import java.util.List;
import java.util.Optional;

public interface TipoEquipamentoService {
    Optional<TipoEquipamento> findById(Long id);

    List<TipoEquipamento> findAll();

    TipoEquipamento save(TipoEquipamento tipoEquipamento);

    void delete(TipoEquipamento tipoEquipamento);
}
