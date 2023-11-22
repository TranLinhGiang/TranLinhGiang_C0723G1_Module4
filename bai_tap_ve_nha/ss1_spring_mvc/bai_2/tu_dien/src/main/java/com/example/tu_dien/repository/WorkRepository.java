package com.example.tu_dien.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class WorkRepository implements IWorkRepository {
    private static final Map<String, String> workList= new HashMap<>();
    static {
        workList.put("banana","chuối");
        workList.put("apple","táo");
        workList.put("red","đỏ");
        workList.put("yellow","vàng");
        workList.put("blue","xanh");
        workList.put("while","trắng");
    }

    @Override
    public Map<String, String> getAll() {
        return workList;
    }

    @Override
    public String search(String work) {
        return workList.get(work);
    }
}
