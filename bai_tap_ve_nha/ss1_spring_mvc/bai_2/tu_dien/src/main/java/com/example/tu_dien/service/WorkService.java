package com.example.tu_dien.service;

import com.example.tu_dien.repository.IWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WorkService implements IWorkService {
    @Autowired
    private IWorkRepository iWorkRepository;

    @Override
    public Map<String, String> getAll() {
        return iWorkRepository.getAll();
    }

    @Override
    public String search(String work) {
        return iWorkRepository.search(work);
    }
}
