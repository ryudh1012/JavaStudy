import java.io.BufferedReader;
import java.io.FileReader;

public class Lab11_01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\javaWorks\\JavaStudy\\JavaStudy\\myData1.txt"));
        String inStr;

        int lineNum = 1;
        while(true){
            inStr = br.readLine();
            if (inStr == null)
                break;
            System.out.println(lineNum + " : " + inStr);
            lineNum ++;
        }

        br.close();
    }
}
