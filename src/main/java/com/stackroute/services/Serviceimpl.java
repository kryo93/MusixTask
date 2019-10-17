package com.stackroute.services;

import com.stackroute.exception.AlreadyExistsExeption;
import com.stackroute.packet.Music;
import com.stackroute.repository.MyMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Serviceimpl implements MusicService {
   MyMusicRepo myMusicRepo;

   @Autowired
    public Serviceimpl(MyMusicRepo myMusicRepo) {
       this.myMusicRepo = myMusicRepo;
    }



    @Override
    public void delTrack(int id) {
       Music delTrack = myMusicRepo.findBytrackId(id);
      myMusicRepo.delete(delTrack);

    }



    @Override
    public Music saveTrack(Music music)throws AlreadyExistsExeption {
       if(myMusicRepo.existsById(music.getTrackId()))
       {
           throw new AlreadyExistsExeption("pehle se hai");
       }
        Music savedTrack = myMusicRepo.save(music);
        return savedTrack;
    }

    @Override
    public List<Music> getAllTracks() {
        return (List<Music>) myMusicRepo.findAll();
    }

    @Override
    public Music updateTrack(Music music)
    {
        Music savedTrack = myMusicRepo.save(music);
        return savedTrack;
    }

    @Override
    public List<Music> getthistrack(String name) {
        return myMusicRepo.findByAlbum(name);
    }



}
