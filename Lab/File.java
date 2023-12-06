import java.io.*;
import java.util.*;

class File {
    public static void main(String[] args) throws IOException {
        String[] name = new String[20];
        int[] hours = new int[20];
        float[] points = new float[20];
        float[] gpa = new float[20];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Students");
        n = sc.nextInt();

        FileWriter fw = new FileWriter("Warning.txt");
        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));

        String line;
        int i = 0; 

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
             while(st.hasMoreTokens()){
                        name[i] = st.nextToken();
                        hours[i] = Integer.parseInt(st.nextToken());
                        points[i] = Float.parseFloat(st.nextToken());
                    }
            i++;
        }

        br.close();
        for(int j=0;j<n;j++){
            gpa[j] = (points[j]/hours[j]);
        }
        for (int j = 0; j < n; j++) {
                if (hours[j] < 30 && gpa[j] < 1.5) {
                    fw.write(name[j] + " " + hours[j] + " " + points[j] + "\n");
                } else if (hours[j] >= 30 && gpa[j] < 1.75) {
                    fw.write(name[j] + " " + hours[j] + " " + points[j] + "\n");
                }
            }
            fw.close();
    }
}
