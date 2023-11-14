package com.example.simpledictionaryapplication.repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class SimpleDictionaryRepository implements ISimpleDictionaryRepository{
    public static final Map<String,String> stringStringMap= new LinkedHashMap<>();
    static {
        stringStringMap.put("banana","chuối");
        stringStringMap.put("apple","táo");
        stringStringMap.put("red","đỏ");
        stringStringMap.put("while","trắng");
        stringStringMap.put("yellow","vàng");
        stringStringMap.put("pet","thú cưng");
    }

    @Override
    public Map<String, String> getDictionary() {
        return stringStringMap;
    }
}
