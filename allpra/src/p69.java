import java.io.*;
import java.util.StringTokenizer;
class sungDataExam {


    public void ReadingData(String fname) throws IOException {
        try {
            FileReader fr = new FileReader(new File(fname));
            System.out.println("fr : "+fr);
            System.out.println("fr.read() : "+fr.read());
            BufferedReader br = new BufferedReader(fr);
            String csvStr = "";
            String tmpStr = "";
            do {
                tmpStr = br.readLine();
                if (tmpStr != null) {
                    csvStr += tmpStr + " ";
                }
            } while (tmpStr != null);


            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            int length = parse.countTokens() / 4;
            String[] name = new String[length];
            String[] address = new String[length];
            double[] math = new double[length];
            double[] eng = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];
            for (int i = 0; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                eng[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + eng[i];
                avg[i] = total[i] / 2.0;
            }
            for (int i = 0; i < length; i++)
                System.out.println(name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + eng[i] + "\t" + total[i] + "\t" + avg[i]);
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
            System.out.println("e : " + e);
        }
    }
}
public class p69 {
    public static void main(String[] args) {
        sungDataExam wd = new sungDataExam();
        try {
            wd.ReadingData("writed.txt");

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
