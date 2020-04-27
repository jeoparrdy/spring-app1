package org.example.springcourse.genres;

import org.example.springcourse.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz Song";
    }
}
