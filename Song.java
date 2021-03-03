package day12.Ex;

public class Song {
	private String title, composer, singer, genre;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	} 
	public String toString() {
		return"°î¸í : " + title + ", ÀÛ°î°¡ : " + composer + ", °¡¼ö : " + singer + ", Àå¸£ : " + genre;
	}
}
