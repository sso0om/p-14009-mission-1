import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                sc.nextLine();

                System.out.print("작가 : ");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
