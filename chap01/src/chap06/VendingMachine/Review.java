package chap06.VendingMachine;

public class Review { //리뷰게시판
	
	String ItemName;		//상품 이름
	String review;			//리뷰글
	int reviewStarPoint;	//리뷰 별점
	String reviewName;		//리뷰 작성자
	
	
	
	
	
	public static void Board(Review[] reviews) {
		
		Review list1 = new Review();
		list1.ItemName = "트붕가붕세붕 LOL 스낵";
		list1.review = "LOL하면서 먹으니까 맛있어요 !!";
		list1.reviewStarPoint = 5;
		list1.reviewName = "FAKER";
		reviews[0]=list1;
		
		
		Review list2 = new Review();
		list2.ItemName = "삼촌이 다 뺏어먹은 스낵";
		list2.review = "정말 삼촌이 다 뺏어갔잖아요...";
		list2.reviewStarPoint = 2;
		list2.reviewName = "콩수니";
		reviews[1]=list2;
		
		
		Review list3 = new Review();
		list3.ItemName = "트붕가붕세붕 LOL 스낵";
		list3.review = "가붕이라고 지금 저 무시하는거에요??";
		list3.reviewStarPoint = 1;
		list3.reviewName = "가붕이의인생";
		reviews[2]=list3;
		
		
		Review list4 = new Review();
		list4.ItemName = "트붕가붕세붕 LOL 스낵";
		list4.review = "무난저난한 맛";
		list4.reviewStarPoint = 3;
		list4.reviewName = "katarina";
		reviews[3]=list4;
		
		
		Review list5 = new Review();
		list5.ItemName = "삼촌이 다 뺏어먹은 스낵";
		list5.review = "진짜 맛있나봐요^^ 제 딸 줄려고 샀는데 엄마아들이 다 X먹어버렸어요 ^^";
		list5.reviewStarPoint = 4;
		list5.reviewName = "쉿울지마나의아기새";
		reviews[4]=list5;
		
	}
	
	
	
	
	
	

}
