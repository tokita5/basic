package ex99;

import java.util.Scanner;

//練習だよ
public class Pra {
    /**
     * @parm message String
     * @return double
     */

    static double inputDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        //身長と体重
        double height = inputDouble("身長を入力してくだせぇ(単位 m)");
        double weight = inputDouble("体重を入力してくだせぇ(単位 kg)");

        //BMIの計算
        double bmi = weight/Math.pow(height,2);
        bmi=Math.round(bmi*10.0)/10.0;

        //適正体重の計算
        

    }
}
