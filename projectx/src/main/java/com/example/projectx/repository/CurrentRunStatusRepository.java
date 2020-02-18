package com.example.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectx.model.CurrentRunStatus;



public interface CurrentRunStatusRepository extends JpaRepository<CurrentRunStatus, String> {

}
