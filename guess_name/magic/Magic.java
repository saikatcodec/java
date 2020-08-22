package magic;

import java.util.Scanner;
import java.util.ArrayList;

public class Magic {
    
    public static void ma() {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        char ch1 = 'A';
        char[][] ch = new char[5][6];
        char[][] ch2;
        
        for (int row = 0; row<5; row++) {
            for (int col = 0; col<6; col++) {
                ch[row][col] = ch1;
                ch1++;
                if (ch1 == '[') {
                    break;
             }
            }
        }
        
        for (int i = 1; i<=6; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println(" ___________");
        System.out.println();
        for (int row = 0; row<5; row++) {
            for (int col = 0; col<6; col++) {
                System.out.print(" "+ch[row][col]);
            }
            System.out.println();
        }
        
        System.out.print("Select colume number : ");
        String select = input.next();
        ch2 = new char[select.length()][5];
        
        for (int j = 1; j<=5; j++) {
            System.out.print(" "+j);
        }
        System.out.println();
        System.out.println(" _________");
        System.out.println();
        
        for (int i = 0; i < select.length(); i++) {
            char test = select.charAt(i);
            int test1 = Integer.parseInt(Character.toString(test));
            for(int col = 0; col < 5; col++) {
                ch2[i][col] = ch[col][test1-1];
            }
            if (num.contains(test1)) {
                num1.add(i);
            }
            num.add(test1);
        }
        
        for(int row = 0; row < select.length(); row++) {
            if(num1.contains(row)) {
                continue;
            }
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+ch2[row][col]);
            }
            System.out.println();
        }
        
        System.out.print("Select again colume : ");
        String select1 = input.next();
        
        System.out.print("You guessed : ");
        for (int i = 0; i < select1.length(); i++) {
            int test = Integer.parseInt(Character.toString(select1.charAt(i)));
            if (i == 0) {
                System.out.print(ch2[i][test-1]);
            } else {
                System.out.print(Character.toLowerCase(ch2[i][test-1]));
            }
        }
        
        input.close();
    }
    
}
