import java.util.Scanner;

import org.jsoup.select.Elements;
public class 뮤직프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.println("=======메뉴=======");
			System.out.println("1. 목록 (TOP200)");
			System.out.println("2. 검색(곡명)");
			System.out.println("3. 검색(가수명)");
			System.out.println("4. 상승이 많은 곡)");
			System.out.println("5. 하강이 많은 곡");
			System.out.println("6. 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu<1 || menu>6)
			{
				System.out.println("존재하지 않은 메뉴입니다.");
				continue; //다시 메뉴 선택=> 처음으로 다시 돌아간다
			}
			
			if(menu==6)
			{
				System.out.println("")
				break; //프로그램 종료(for 종료)
			}
			else if(menu==1)
			{
				System.out.println("***** 뮤직Top200*****");
				int k=2;
				for(int i=1;i<=4;i++) 
				{
					Document doc=Jsoup.connect("")
					Elements tile=doc.select("")		
					//태그명 => class . id => #
					for(int j=0; j<=tile.size();j++)
					{
						try {
					}
				}
			}
			
		}
		
		
	}

}
