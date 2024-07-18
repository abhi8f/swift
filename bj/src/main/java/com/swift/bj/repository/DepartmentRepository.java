package com.swift.bj.repository;

import org.springframework.stereotype.Repository;
import com.swift.bj.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer> {

}
