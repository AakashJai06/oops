import java.io.*;
class Main{
    public static void main (String[] args) {
        try{
            FileWriter f1 = new FileWriter("Output.txt");
            FileReader f2 = new FileReader("Input.txt");
            BufferedReader br = new BufferedReader(f2);
            String s;
            while((s=br.readLine())!=null){
                f1.write(s+"\n");
            }
            f1.close();
            f2.close();
        }
        catch(IOException e){
            return;
        }
    }
}
