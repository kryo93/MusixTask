package com.stackroute.repository;

import com.stackroute.packet.Music;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyMusicRepo extends CrudRepository<Music,Integer>
{
    Music findBytrackId(int id);
    @Query(value="from Music where album =?1")
    List<Music> findByAlbum(String song);
}
