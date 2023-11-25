package com.example.songs.service;

import com.example.songs.model.Song;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    void update(int id,Song song);

    Song finById(int id);
}
