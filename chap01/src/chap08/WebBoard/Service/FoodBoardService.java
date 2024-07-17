package chap08.WebBoard.Service;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import chap08.WebBoard.DTO.BoardDTO;
import chap08.WebBoard.DTO.FoodBoardDTO;
import chap08.WebBoard.DTO.Member;

public class FoodBoardService extends BoardDTO {
	
	//필드
	
	
	
	
	//생성자
	
	
	
	
	
	//필드

	public static void foodBoard(Scanner scanner, FoodBoardDTO[] foods,Member loginMember) {
		System.out.println(" FOOOD 게시판에 오신걸 환영합니다.");
		System.out.println("1. 게시글 작성하기 /t.2.게시글 수정하기");
		System.out.println("3. 게시글 확인하기 /t.4.게시글 삭제하기");
		System.out.print(">>>");
		int select = scanner.nextInt();
		
		switch (select) {
		
		case 1 : 
			System.out.println("게시글을 작성합니다.");
			writer(scanner,foods);
			break;
			
		case 2:
			System.out.println("게시글 수정하기");
			modify();
			break;
		case 3:
			System.out.println("게시글 확인하기");
			check(foods);
			
			break;
		case 4:
			System.out.println("게시글 삭제하기");
			delete();
			break;
			
		default:
			System.out.println("1 ~ 4값만 입력해주세요");
			
		}
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}

	private static void delete() {
		
		
	}//푸드게시판 삭제 메서드 종료

	private static void check(FoodBoardDTO[] foods) {
		System.out.println("게시글을 확인해볼까요 ?");
		for(int i=0; i < foods.length; i++) {
			if(foods[i] !=null) {
				System.out.println("게시물 번호 : " + foods[i].getBno());
				System.out.println("게시물 제목 : " + foods[i].getTitle());
				System.out.println("게시물 내용 : " + foods[i].getContent());
				System.out.println("음식  : " + foods[i].getFood());
				System.out.println("음식점  : " + foods[i].getFoodStore());
				System.out.println("음식점 리뷰  : " + foods[i].getFoodReview());
				System.out.println("별점  : " + foods[i].getFoodStarPoint());
				break;
			} else {
				System.out.println("작성된 글이 없는데요? ");
				break;
			}//게시글 확인하고 싶은데 . ..
			
		}
		
		
		
	}//푸드게시판 확인 메서드 종료

	private static void modify() {
		
		
	}//푸드게시판 수정 메서드 종료

	private static void writer(Scanner scanner, FoodBoardDTO[] foods) {
		// 
	
		System.out.println("게시글의 제목을 입력해주세요");
		System.out.println(">>>");
		String newTitle = scanner.next();	//게시판 제목을 키보드로 입력 받음.
	
		System.out.println("게시글의 내용을 입력해주세요");
		String newContent = scanner.next(); // 게시글의 내용을 키보드로 입력 받음.
		System.out.println("작성자를 입력해주세요");
		String newnickName = scanner.next();// 작성자를 키보드로 입력 받음.
		
		System.out.println("음식 이름을 입력하세요. ");
		String foodName = scanner.next();
		
		System.out.println("음식점을 입력하세요.");
		String foodStore = scanner.next();
		FoodBoardDTO
		
		System.out.println("음식 리뷰를 적어주세요.");
		String foodReview = scanner.next();
		
		System.out.println("별점을 얼마 주시겠습니까 ? (5개 만점)");
		String foodStarPoint = scanner.next();
		
		for(int i=0; i < foods.length; i++) {
			if(foods[i] != null) {
				for( int j = 0; j < foods.length; j++) {
					j += 1;
					foods[i].setBno(j);
				}//푸드게시판 번호 증가
				foods[i].setTitle(newTitle);	
				foods[i].setContent(newContent);
				SimpleDateFormat regDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				break;
			}//if문 종료
		}//for문 종료
		
	}//푸드게시판 작성하기 메서드 종료

}//클래스 종료
