package com.integracion.repositorio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_repository")
public class RepositoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gitUrl;
    private String organization;

    public RepositoryEntity() {
    }

    public RepositoryEntity(String name, String gitUrl, String organization) {
        this.name = name;
        this.gitUrl = gitUrl;
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
