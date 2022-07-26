package by.piskunou.springcourse;

import java.util.*;
import java.io.*;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class ClassicalMusic implements Music {
	private List<String> songs = new ArrayList<>(3);
	
	@PostConstruct
	public void init() throws FileNotFoundException, IOException{
		Scanner scanner = new Scanner(new File("/home/cichan/Documents/Prog/Spring/spring-app1/src/main/resources/classicalIn.txt"));
		while(scanner.hasNextLine()) {
			songs.add(scanner.nextLine());
		}
	}
	
	@Override
	public List<String> getSongs() {
		return songs;
	}
}
