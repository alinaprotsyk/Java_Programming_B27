package day35_custom_classes.song;

import day35_custom_classes.song.Song;

public class SongInfo {
    public static void main(String[] args) {
        Song song1 = new Song("DeepSea", 3.19, "Minelli", "Pop");
        System.out.println(song1);


        Song song2 = new Song("Four season", 2.8);
        System.out.println(song2);
    }
}
