package com.example.tu_dien.repository;

import java.util.Map;

public interface IWorkRepository {
    Map<String, String> getAll();

    String search (String work);
}
