package day12.Ex;
/*
 	���� 1]
 		�뷡 �Ѱ��� �����͸� ����� Ŭ���� Song�� �����ϰ�
 		10���� �����͸� �Է��ؼ�
 		����� �Է��ϸ� �ش� ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		��������
 		���(title), �۰(composer), ����(singer), �帣(genre)
 		�� ����ϵ��� �ϼ���.
 			
 		extra ]
 			�����̸��� �Է��ϸ� �ش� ����� ��µǰ� �ϼ���.
 			
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
			System.out.print("��� �Ǵ� �����̸��� �Է��ϼ���.");
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
		System.out.print("��� �Է� : ");
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
		
		System.out.print("�����̸� �Է� : ");
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
		String[] title = {"��","��","��","��","��","��","��","��","��","��"};
		String[] composer = {"�캴ȯ","������","�̰���","�輮��","�̽¿�","��μ�","��ȿ","�糪","�̳�","����"};
		String[] singer = {"����","����","���","�糪","ä��","����","����","����","��ȣ","�μ�"};
		String[] genre = {"�߶��","��","��","����","�ε�","����","�˾غ�","k��","��","Ʈ��Ʈ"};
	
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
	
	// ����Լ� �����ε�
	public void toPrint(Song[] so, int idx) {
		System.out.println(so[idx].toString());
	}
}
