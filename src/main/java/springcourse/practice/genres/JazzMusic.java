package springcourse.practice.genres;

import springcourse.practice.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}
