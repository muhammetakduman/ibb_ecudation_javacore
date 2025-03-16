package org.example.dao;

import org.example.dto.StudentDto;

import java.io.IOException;
import java.util.List;
import java.sql.Connection;
import java.util.Optional;

public interface IDaoGenerics<T> {
    // CRUD
    // CREATE
    T create(T t) throws IOException;

    // FIND BY NAME,ID
    Optional<T> findByName(String name);
    Optional<T>  findById(int id);

    // LIST
    List<T> list();

    // UPDATE
    Optional<T> update(int id, T t) throws IOException;

    // DELETE
    Optional<T> delete(int id) throws IOException;

    // CHOOISE
    void chooise() throws IOException;

    // DATABASE CONNECTION
    default Connection getInterfaceConnection() {

        return null;
    }
}
