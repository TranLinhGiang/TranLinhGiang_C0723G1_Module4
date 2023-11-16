package com.example.simpledictionaryapplication.repository;

import java.util.Map;

public interface ISimpleDictionaryRepository {
    Map<String, String> getDictionary();
    String search(String word);
}
