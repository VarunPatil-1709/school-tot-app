package com.school.tutorialApp.repository;

import com.school.tutorialApp.entity.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClassRepository extends JpaRepository<SchoolClass, UUID> {
}
