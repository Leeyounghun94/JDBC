package chap08.WebBoard.Service;

import java.util.Scanner;

import chap08.WebBoard.DTO.BoardDTO;
import chap08.WebBoard.DTO.Member;
import chap08.WebBoard.DTO.fileBoardDTO;


public class FileBoardService extends BoardDTO {
	
	
	private static void fileBoard(Scanner scanner, fileBoardDTO fileDTOs, Member loginMember) {
		fileBoardDTO fileDTOs = new fileBoardDTO();
		System.out.println(" File 게시판에 오신걸 환영합니다.");
		System.out.println("");
		
		System.out.println("글을 작성하시겠습니까?");
		System.out.println("1.Yes　|2.No");
		int select = scanner.nextInt();
		
		switch (select) {

		case 1 :
			System.out.println("파일 이름을 입력해주세요");
			fileDTOs.setFileName(scanner.next());
			
			System.out.println("파일 내용을 입력해주세요");
			fileDTOs.setFileName(scanner.next());
			
			System.out.println("파일 이름을 입력해주세요");
			fileDTOs.setFileReview(scanner.next());
			
			for(int i=0; i < fileDTOs.length; i++) {
				if (fileDTOs[i] == null) {
					fileDTOs[i] = fileDTO;
					break;
			}
		
		}
		
	
		
		
		
	}
	
}
