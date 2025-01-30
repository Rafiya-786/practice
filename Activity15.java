package Day3;
import java.io.*;

import java.util.*;


interface IFilm {

void setTitle(String title);

String getTitle();

void setDirector(String director);

String getDirector();

void setYear(int year);

int getYear();

}


interface IFilmLibrary {

void addFilm(IFilm film);

void removeFilm(String title);

List<IFilm> getFilms();

List<IFilm> searchFilms(String query);

int getTotalFilmCount();

}

class Film implements IFilm{
	private String title;
	private String director;
	private int year;
	public void Film(String title,String director,int year) {
this.title=title;
this.director=director;
this.year=year;
	}
	public void setTitle(String title) {
		this.title=title;
	}
public String getTitle() {
	return title;
}
public void setDirector(String director) {
	this.director=director;
}
public String getDirector() {
	return director;
}
public void setYear(int year) {
	this.year=year;
}
public int getYear() {
	return year;
	}
public String toString() {
	return title+"("+director+","+year+")";
}
}
class FilmLibrary implements IFilmLibrary{
	private List<IFilm> lst=new ArrayList<>();
	public void addFilm(IFilm film) {
		lst.add(film);
	}
	public void removeFilm(String title) {
		Iterator<IFilm> it=lst.iterator();
		while(it.hasNext()) {
			IFilm ref=it.next();
			if(ref.getTitle().equals(title)) {
				lst.remove(ref);
			}
			
		}
	}
	public List<IFilm> getFilms() {
		return lst;
	}
	public List searchFilms(String query) {
		List<IFilm> l=new ArrayList<>();
		Iterator<IFilm> it=lst.iterator();
		while(it.hasNext()) {
			IFilm ref=it.next();
			if(ref.getTitle().contains(query) || ref.getDirector().contains(query)) {
				l.add(ref);
			}
			
		}
		return l;
	}
	public int getTotalFilmCount() {
		return lst.size();
	}
	
}

public class Activity15 {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//PrintWriter out = new PrintWriter(System.out);


IFilmLibrary filmLibrary = new FilmLibrary();

List<IFilm> films = new ArrayList<>();

int fCount = Integer.parseInt(br.readLine().trim());


for (int i = 0; i < fCount; i++) {

String[] a = br.readLine().trim().split(" ");

IFilm e = new Film();

e.setTitle(a[0]);

e.setDirector(a[1]);

e.setYear(Integer.parseInt(a[2]));


filmLibrary.addFilm(e);

films.add(e);

}


int totalFilmCount = filmLibrary.getTotalFilmCount();

System.out.println("Total Film Count: " + totalFilmCount);


String[] b = br.readLine().trim().split(" ");

String query = b[0];

List<IFilm> searchResults = filmLibrary.searchFilms(query);


System.out.println("Search Results for " + query + ":");

for (IFilm film : searchResults) {

System.out.println(film.getTitle() + " (" + film.getDirector() + ", " + film.getYear() + ")");

}


String[] c = br.readLine().trim().split(" ");

String title = c[0];

IFilm randomFilm = null;


for (IFilm film : films) {

if (film.getTitle().equals(title)) {

randomFilm = film;

break;

}

}


if (randomFilm != null) {

filmLibrary.removeFilm(randomFilm.getTitle());

System.out.println("Removed Film: " + randomFilm.getTitle() + " (" + randomFilm.getDirector() + ", " + randomFilm.getYear() + ")");

}


List<IFilm> allFilms = filmLibrary.getFilms();

System.out.println("All Films:");

for (IFilm film : allFilms) {

System.out.println(film.getTitle() + " (" + film.getDirector() + ", " + film.getYear() + ")");

}
}
}