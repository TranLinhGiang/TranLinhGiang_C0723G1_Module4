package com.example.simpledictionaryapplication.service;

import com.example.simpledictionaryapplication.repository.ISimpleDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SimpleDictionaryService implements ISimpleDictionaryService{
    @Autowired
    private ISimpleDictionaryRepository iSimpleDictionaryRepository;

    @Override
    public Map<String, String> getDictionary() {
        return iSimpleDictionaryRepository.getDictionary();
    }

    @Override
    public String search(String word) {
        return iSimpleDictionaryRepository.search(word);
    }
}
