package com.pmoc.mirante.models.checklist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEquipamentoRepository extends JpaRepository<TipoEquipamento, Long> {
    // Você pode adicionar métodos personalizados de busca aqui, se necessário
}
