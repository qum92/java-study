package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		String wha = "";
do {
		System.out.println("===============================================================");
		System.out.println(" 환영합니다.");
		System.out.println(" 아래에 아이디를 입력해보아요.");
		System.out.println("===============================================================");
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		if("osfu".equals(id)) {
			System.out.print("비밀번호: ");
			String pwd = scan.nextLine();
			if("12345678".equals(pwd)) {
				BoardService bs = new BoardService();
				System.out.println("환영 합니다. osfu님! 서비스를 맘껏 이용하세요!");
				while(!"q".equals(cmd)){
				System.out.println("1. 게시물 등록");
				System.out.println("2. 게시물 삭제");
				System.out.println("3. 게시물 조회");
				System.out.println("4. 게시물 수정");
				System.out.println("q. 종료");
				System.out.println("원하시는 번호를 눌러주세요.");
				System.out.print("번호 : ");
				cmd = scan.nextLine();
				if("1".equals(cmd)) {
					System.out.print("제목 : ");
					String title = scan.nextLine();
					System.out.print("내용 : ");
					String content = scan.nextLine();
					bs.insertBoard(title, content);
				}else if("2".equals(cmd)) {
					System.out.print("삭제하실 열을 입력해주세요.");
					String rowNum = scan.nextLine();
					bs.deleteBoard(rowNum);
				}else if("3".equals(cmd)) {
					bs.selectBoard();
				}else if("4".equals(cmd)) {
					System.out.println("수정하실 게시물 번호를 입력해주세요.");
					int wh  = Integer.parseInt(scan.nextLine());
					System.out.println("무엇을 수정하시겠습니까?");
					System.out.println("제목을 수정하고 싶으시면 1번을 입력해주세요.");
					System.out.println("내용을 수정하고 싶으시면 2번을 입력해주세요.");
					System.out.println("제목 과 내용을 수정하고 싶으시면 3번을 입력해주세요.");
					wha = scan.nextLine();
					if(wha.equals("1")) {
						System.out.println("수정하실 제목으로 입력해주세요.");
						String title = scan.nextLine();
						bs.updateBoard(wh, title);
					}else if(wha.equals("2")) {
						System.out.println("수정하실 내용으로 입력해주세요.");
						String content = scan.nextLine();
						bs.updateBoard1(wh, content);
					}else if(wha.equals("3")) {
					System.out.println("수정하실 제목으로 입력해주세요.");
						String title = scan.nextLine();
					System.out.println("수정하실 내용으로 입력해주세요.");
						String content = scan.nextLine();
						bs.updateBoard(wh,title, content);
					}
				}
			}
			}else {
				System.out.println("입력하신 비밀번호가 틀립니다.");
			}
		}else {
			System.out.println("없는 아이디 입니다.");
		}
	}while(!"q".equals(cmd));
		System.out.println("이용해주셔서 감사합니다. 다음에도 이용해주세요.");
	}
}