package day12.Ex;
/*
 	문제 1]
 		노래 한곡의 데이터를 기억할 클래스 Song을 정의하고
 		10곡의 데이터를 입력해서
 		곡명을 입력하면 해당 곡의 정보를 출력해주는 프로그램을 작성하세요.
 		
 		곡정보는
 		곡명(title), 작곡가(composer), 가수(singer), 장르(genre)
 		를 기억하도록 하세요.
 			
 		extra ]
 			가수이름을 입력하면 해당 곡들이 출력되게 하세요.
 			
 */
import java.util.*;
public class Ex01 {
	Scanner sc = new Scanner(System.in);
	public Ex01() {
		Song[] list = getDataArr();

		toPrint(list);
		exec(list);
		sc.close();
		
	}
	public void exec(Song[] so) {
		
		while(true) {
			System.out.print("곡명 또는 가수이름을 입력하세요.");
			String no = sc.next();
			
			switch(no) {
			case 0:
				titleInfo(so);
				break;
			case 1:
				singerInfo(so);
				break;
			}
		}
	}
	public void titleInfo(Song[] so) {
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		
		for(int i = 0 ; i < so.length; i++) {
			if(so[i].getTitle().equals(title)) {
				System.out.println(so[i].toString());
				toPrint(so);
				
				break;
			}
		}
	}
	public void singerInfo(Song[] so) {
		
		System.out.print("가수이름 입력 : ");
		String singer = sc.nextLine();
		
		for(int i = 0 ; i < so.length; i++) {
			if(so[i].getSinger().equals(singer)) {
				System.out.println(so[i].toString());
				toPrint(so);
				
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
	public Song[] getDataArr() {
		Song[] so = new Song[10]; 
		for(int i = 0 ; i < so.length; i++) {
			so[i] = new Song();
		}
		String[] title = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ"};
		String[] composer = {"우병환","이준희","이건희","김석준","이승원","김민서","지효","사나","미나","다현"};
		String[] singer = {"나연","정연","모모","사나","채영","쯔위","원빈","진수","일호","인성"};
		String[] genre = {"발라드","댄스","팝","재즈","인디","힙합","알앤비","k팝","락","트로트"};
	
		for(int i = 0 ; i < 10; i++) {
			song[i] = new Song();
			String jemock = title[i];
			String jack = composer[i];
			String gasoo = singer[i];
			String jang = genre[i];
			
			
			so[i].setTitle(jemock);
			so[i].setComposer(jack);
			so[i].setSinger(gasoo);
			so[i].setGenre(jang);
		}
		return so;
	}
	
	public void toPrint(Song[] so) {
		for(int i = 0 ; i < so.length; i++) {
			System.out.println(so[i].toString());
		}
	}
	
	// 출력함수 오버로딩
	public void toPrint(Song[] so, int idx) {
		System.out.println(so[idx].toString());
	}
}
