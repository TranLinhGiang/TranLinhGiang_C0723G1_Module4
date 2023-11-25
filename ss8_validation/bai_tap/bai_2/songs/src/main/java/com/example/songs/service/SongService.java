package com.example.songs.service;

import com.example.songs.model.Song;
import com.example.songs.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository songRepository;
    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public void update(int id,Song song) {
        songRepository.save(song);
    }

    @Override
    public Song finById(int id) {
        return songRepository.findById(id).get();
    }
}
