package com.stackroute.listener;

import com.stackroute.repository.MyMusicRepo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationRunner {
    MyMusicRepo myMusicRepo;

    public ApplicationStartup() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        myMusicRepo.save(23,"");
    }
}
