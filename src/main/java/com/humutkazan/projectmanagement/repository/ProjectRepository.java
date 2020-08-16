package com.humutkazan.projectmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humutkazan.projectmanagement.model.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByPublished(boolean published);
    List<Project> findByTitleContaining(String title);
}