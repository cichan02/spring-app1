package by.piskunou.springcourse;

import java.util.*;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music1;
	private Music music2;
	
	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music1, 
						@Qualifier("rockMusic") Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}
	
	public void playMusic(MusicGenre genre) {
		Random rand = new Random();
		int songsSize;
		int song;
		if(genre == MusicGenre.CLASSICAL) {
			songsSize = music1.getSongs().size();
			song = rand.nextInt(songsSize);
			System.out.println(music1.getSongs().get(song));
		}
		else {
			songsSize = music2.getSongs().size();
			song = rand.nextInt(songsSize);
			System.out.println(music2.getSongs().get(song));
		}
	}
}
