package ex55;

//最大値、最小値
public class Pray {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40,};//配列の宣言
        int max = array[0];
        int min = array[0];
        int ave = array[0];

        for (int num:array) {
            if (num>max){
                max=num;//最大値の更新
            }
            if (num<min){
                min=num;//最小値の更新
            }
            System.out.println("Max"+max);
            System.out.println("Min"+min);
        }
    }

}
