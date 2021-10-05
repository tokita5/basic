package ex;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

//BMIと適性体重を求める
public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }

//BMIと適正体重
    public static void main(String[] args) {
        double d1=1.76;
        System.out.println("身長");
        System.out.println(d1);

        double d2=63.2;
        System.out.println("体重");
        System.out.println(d2);

        double bmi ;
        System.out.println("BMI");
        System.out.println(d2/(d1*d1)*10.0);

        double appWidth = 0;
        System.out.println("適正体重");
        System.out.println((d1*d1)*22);
        System.out.println(appWidth);

        //体型の表示
        int score = (int) 19.69;
        if (score >=40) {
            System.out.println("肥満(4度)");
        } else if (score>=35) {
            System.out.println("肥満(3度)");
        }else if (score>=30) {
            System.out.println("肥満(2度)");
        }else if (score>=25) {
            System.out.println("肥満1度");
        }else if (score>=18.5) {
            System.out.println("普通体重");
        }else {
            System.out.println("低体重(痩せ型)");
        }
    }
}
