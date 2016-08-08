package com.wqj;

/**
 * Created by MR.WEN on 2016/8/6.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 秦孟飞 on 2016/8/4.
 */
public class test1040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[] great = new int[n];
        int[] great2 = new int[n];
//        int[] output = new int[great.length];
        int[] output2 = new int[great.length];
        for (int i = 0; i < n; i++) {
            great[i] = in.nextInt();
            great2[i] = great[i];
            //    output[i]=2;
            output2[i]=1;

        }


        if (a > b) {
            Arrays.sort(great2);
            for (int j = great.length-1 ;j>great.length-b-1 ; j--)
            {
                for (int i = n-1;i>=0;i--) {
                    if (great[i] == great2[j]) {
                        output2[i] = 2;
                        great[i] = -1;
                        break;
                    }
                }
            }
            for (int jj = 0; jj < output2.length; jj++) {
                System.out.print(output2[jj] + " ");
            }
        }

        if (a < b) {

            Arrays.sort(great2);
            for (int j = 0 ;j<b ; j++)
            {
                for (int i = n-1;i>=0;i--)
                {
                    if (great[i]==great2[j])
                    {
                        output2[i] = 2;
                        great[i] = -1;
                        break;
                    }
                }
            }
            for (int jj = 0; jj < output2.length; jj++) {

                System.out.print(output2[jj] + " ");
            }
        }
        if (a == b) {
            int aaaa = 0;
            for (int i = 0; i < n; i++) {
                if (aaaa < a) {
                    aaaa++;
                    System.out.print(1 + " ");
                } else System.out.print(2 + " ");
            }
        }

    }
}

