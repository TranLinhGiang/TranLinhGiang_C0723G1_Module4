package com.example.simpledictionaryapplication.service;

import java.util.Map;

public interface ISimpleDictionaryService {
    Map<String, String> getDictionary();
    String search(String word);
}
