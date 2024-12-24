package com.example.lab2javafx;

public interface Iterator {
    boolean hasNext();
    Object next();
    Object preview();
    void reset();
}