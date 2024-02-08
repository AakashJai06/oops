import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int[] n = new int[20];
        int[] pal = new int[20];
        int s = 0, r;

        while (i < args.length) {
            n[i] = Integer.parseInt(args[i]);
            int m = n[i];
            while (n[i] > 0) {
                r = n[i] % 10;
                s = s * 10 + r;
                n[i] = n[i] / 10;
            }
            if (s == m) {
                pal[j] = s;
                j++;
            }
            i++;
            s = 0; 
        }

        try {
            FileWriter fw = new FileWriter("Output.txt");
            for (int k = 0; k < j; k++) {
                fw.write(pal[k] + " ");
            }
            fw.close(); 
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
}
