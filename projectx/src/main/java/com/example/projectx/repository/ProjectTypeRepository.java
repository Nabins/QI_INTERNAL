package com.example.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectx.model.ProjectType;

public interface ProjectTypeRepository extends JpaRepository<ProjectType,String> {

}
