package org.example.dao;

import org.example.dto.StudentDto;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

public interface IDaoGenerics<T> {
    // CRUD
    // CREATE
    T create(T t) throws IOException;

    // FIND BY NAME,ID
    T findByName(String name);
    T  findById(int id);

    // LIST
    List<T> list();

    // UPDATE
    T update(int id, T t) throws IOException;

    // DELETE
    T delete(int id) throws IOException;

    // CHOOISE
    void chooise() throws IOException;

    // DATABASE CONNECTION
    default Connection getInterfaceConnection() {
        return null;
    }
}
