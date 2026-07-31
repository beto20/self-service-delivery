package com.integracion.repositorio.repository;

import com.integracion.repositorio.model.RepositoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelfService extends CrudRepository<RepositoryEntity, Long> {

}
