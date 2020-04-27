package org.example.springcourse.config;

import org.example.springcourse.Computer;
import org.example.springcourse.Music;
import org.example.springcourse.MusicPlayer;
import org.example.springcourse.genres.ClassicalMusic;
import org.example.springcourse.genres.JazzMusic;
import org.example.springcourse.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}