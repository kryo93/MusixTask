package com.stackroute.services;

import com.stackroute.exception.AlreadyExistsExeption;
import com.stackroute.packet.Music;

import java.util.List;

public interface MusicService
{
    public Music saveTrack(Music music) throws AlreadyExistsExeption;
    public List<Music> getAllTracks();
    public void delTrack(int id);
    public Music updateTrack(Music music);

    public List<Music> getthistrack(String name);
}
