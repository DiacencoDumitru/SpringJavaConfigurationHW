package springcourse.practice.genres;

import springcourse.practice.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
