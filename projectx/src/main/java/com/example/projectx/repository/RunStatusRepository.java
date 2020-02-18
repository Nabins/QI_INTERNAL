package com.example.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectx.model.Run;

public interface RunStatusRepository extends JpaRepository<Run, String> {

}
