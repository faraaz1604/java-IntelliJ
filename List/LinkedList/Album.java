package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        return songs.stream()
                .filter(song -> song.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public boolean addToPlayList(int num, LinkedList<Song> playlist) {
        int index = num - 1;
        if (index >= 0 && index < songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}