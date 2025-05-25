import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        int wiseSayingId = 0;

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                wiseSayingId++;

                System.out.print("명언 : ");
                sc.nextLine();

                System.out.print("작가 : ");
                sc.nextLine();

                System.out.printf("%d번 명언이 등록되었습니다.%n", wiseSayingId);
            }
        }
        sc.close();
    }
}
