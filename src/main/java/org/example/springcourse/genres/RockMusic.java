package org.example.springcourse.genres;

import org.example.springcourse.Music;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
