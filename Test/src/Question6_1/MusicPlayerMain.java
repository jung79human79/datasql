package Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<MusicVO> MusicList = new ArrayList<MusicVO>();

		// int i = 0;

		System.out.println("==========뮤직플레이어============");

		while (true) {
			System.out.print("[1]등록 [2]목록 [3]삭제 [4]전체삭제 [5]종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("====등록====");
				
				System.out.print("제목입력 : ");
				String title = sc.next();
				System.out.print("가수입력 : ");
				String singer = sc.next();
				System.out.print("재생시간입력 : ");
				int PlayTime = sc.nextInt();

				MusicList.add(new MusicVO(title, singer, PlayTime));
				
				System.out.println("제목: " + title);
				System.out.println("가수: " + singer);
				System.out.println("시간: " + PlayTime);

			} else if (input == 2) {
				System.out.println("=====전체 노래 목록======");

				for (int i = 1; i <= MusicList.size(); i++) {
					System.out.println(i +""+ MusicList.get(i - 1).getTitle() + "\t" + MusicList.get(i - 1).getSinger()
							+ "\t" + MusicList.get(i - 1).getPlayTime());
				}

			} else if (input == 3) {
				System.out.println("=====노래 삭제======");
				System.out.print("삭제하고 싶은 번호 입력: ");
				int num = sc.nextInt();
				// MusicList.get(num-1);
				if(num>0 && num <=MusicList.size())
				System.out.println(MusicList.get(num-1).getTitle() + "을 삭제합니다");
				MusicList.remove(num-1);

			} else if (input == 4) {
				System.out.println("=====전체 노래 삭제======");

				System.out.println("전체 노래가 삭제되었습니다");
				for (MusicVO v : MusicList) {
					MusicList.remove(v);
				}

			} else if (input == 5) {

				break;
			} else {
				break;
			}
		}

	}

}
