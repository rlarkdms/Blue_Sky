package com.rds_project_demo.repository;

import com.rds_project_demo.Member.Member;
import com.rds_project_demo.Member.Trash;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrashRepository extends JpaRepository<Trash, String> {

        List<Trash> findBydong(String dong);
}

