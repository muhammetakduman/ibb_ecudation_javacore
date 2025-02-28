package org.example.dao;

import java.sql.Connection;
import java.util.List;

public interface IDaoGenerics {
    //crud
    //create
    T create(T t);

    // find name,ıd
    T findByName(String name);
    T findById(int id);

    //list
    List<T> list();

    //update
    T update (int id , T t);

    //delete
    T delete(int id);

    //chooise
    void chooise();

    //db connection
    default Connection getInterfaceConnection(){
        return null;
    }
}
