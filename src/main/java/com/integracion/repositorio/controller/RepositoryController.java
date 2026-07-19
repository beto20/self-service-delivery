package com.integracion.repositorio.controller;

import com.integracion.repositorio.model.RepositoryResponse;
import com.integracion.repositorio.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/repositories")
public class RepositoryController {

    @Autowired
    private RepositoryService repositoryService;

    @GetMapping
    public List<RepositoryResponse> getAll() {
        return repositoryService.getAll();
    }
}
