import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab11_02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("C:\\javaWorks\\JavaStudy\\JavaStudy\\myData1.txt"));
        FileWriter fw = new FileWriter("C:\\javaWorks\\JavaStudy\\JavaStudy\\newFile.txt");
        String inStr;

        while(true){
            inStr = br.readLine();
            if (inStr == null)
                break;
            fw.write(inStr + "\n");
        }

        br.close();
        fw.close();
        System.out.println("--- myData1.txt가 newFile.txt로 복사되었음 ---");
    }
}
