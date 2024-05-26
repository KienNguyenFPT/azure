package org.kiennguyenfpt.studentmanagement.repository;

import org.kiennguyenfpt.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}

