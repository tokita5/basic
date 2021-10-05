package ex55;

import java.time.LocalDateTime;
import java.util. Random;
import java.util. Scanner;

//ifがわからんくて畏怖を抱くと云ふ。
public class bray {
    public static void main(String[] args) {
        //乱数の発生
        Random random = new Random(LocalDateTime.now().getSecond());
        int cpu = random.nextInt(3);//0.1.2の3種類の値

        //プレイヤーの手の入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの手を選んでください");
        System.out.println("0.グー 1.チョキ 2.パー");
        int player = scanner.nextInt();

        //CPUの手を表示
        switch (cpu){
            case 0:
                System.out.println("");
        }
    }
}
