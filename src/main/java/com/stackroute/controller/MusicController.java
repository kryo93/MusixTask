package com.stackroute.controller;

import com.stackroute.exception.AlreadyExistsExeption;
import com.stackroute.packet.Music;
import com.stackroute.services.MusicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MusicController
{
    MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @PostMapping("/saveTrack")
    public String saveTrack(@RequestBody Music music)
    {
        System.out.println("entered");
        try{
     musicService.saveTrack(music);}
        catch (AlreadyExistsExeption e){
            e.getMessage();
            e.printStackTrace();
        }

     return "saved";
    }
    @GetMapping("/getTrack")
    public List<Music> getAllSong()
    {
        return musicService.getAllTracks();
    }
    @DeleteMapping("/delTrack/{id}")
    public String delTrack(@PathVariable int id)
    {
        musicService.delTrack(id);
        return "deleted";
    }
//    @PutMapping("/updateTrack")
//    public String updateTrack(@RequestBody Music music)
//    {
//        System.out.println("entered");
//        musicService.saveTrack(music);
//        return "saved";
//    }
    @GetMapping("/byName/{name}")
    public List<Music> getTrack(@PathVariable String name)
    {
        return musicService.getthistrack(name);
    }

}
