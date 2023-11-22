package com.example.tu_dien.service;

import java.util.Map;

public interface IWorkService {
    Map<String, String> getAll();

    String search (String work);
}
