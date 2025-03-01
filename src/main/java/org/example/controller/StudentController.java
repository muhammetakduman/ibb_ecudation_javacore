package org.example.controller;

import org.example.dao.IDaoGenerics;
import org.example.dao.StudentDao;
import org.example.dto.StudentDto;

import java.io.IOException;
import java.util.List;

public class StudentController implements IDaoGenerics<StudentDto> {

    // INJECTION
    private final StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() throws IOException {
        this.studentDao = new StudentDao();
    }

    // CREATE
    @Override
    public StudentDto create(StudentDto studentDto) throws IOException {
        return studentDao.create(studentDto);
    }

    // FIND BY NAME
    @Override
    public StudentDto findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // LIST
    @Override
    public List<StudentDto> list() {
        return studentDao.list();
    }

    // UPDATE
    @Override
    public StudentDto update(int id, StudentDto studentDto) throws IOException {
        return studentDao.update(id, studentDto);
    }

    // DELETE
    @Override
    public StudentDto delete(int id) throws IOException {
        return studentDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() throws IOException {
        studentDao.chooise();
    }
}