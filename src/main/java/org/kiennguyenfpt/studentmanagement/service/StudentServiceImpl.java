package org.kiennguyenfpt.studentmanagement.service;

import org.kiennguyenfpt.studentmanagement.entity.Student;
import org.kiennguyenfpt.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    /*

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        try {
            List<Student> students = studentRepository.findAll();
            if(students.isEmpty()) {
                throw new NoSuchElementException("No students found!");
            }
            return students;
        }
        catch (Exception e) {
            throw new RuntimeException("Error while getting students!", e);
        }
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No student found with id " + id));
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(long id, Map<String, Objects> studentMap) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            for(Map.Entry<String, Objects> entry : studentMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case "age":
                        student.setAge(Integer.parseInt(value.toString()));
                        break;
                    case "address":
                        student.setAddress(value.toString());
                        break;
                    case "major":
                        student.setMajor(value.toString());
                        break;
                    case "phone":
                        student.setPhone(value.toString());
                        break;
                    case "GPA":
                        student.setGPA(Double.parseDouble(value.toString()));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid key: " + key);
                }
            }
            return studentRepository.save(student);
        }
        else {
            throw new NoSuchElementException("No student found with id " + id);
        }
    }

     */


}


