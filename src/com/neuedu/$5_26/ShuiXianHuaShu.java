package com.neuedu.$5_26;

public class ShuiXianHuaShu {
    //打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
    //1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
    public static void main(String[] args) {
        System.out.println("水仙花数为");
        for (int i = 100; i <= 999; i++) {
            int g = i % 10;
            int s = (i % 100 - g) / 10;
            int b = i / 100;
            int sum = g * g * g + s * s * s + b * b * b;
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
