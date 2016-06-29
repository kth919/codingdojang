import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 2016-06-28.
 */
public class TabIsSpace {
    // 탭문자를 공백으로 치환하시오

    public static void main(String[] args) throws IOException {
        // 공백 아스키코드 = 32, 탭키 아스키코드 = 9

        String INstr;
        String result="";
        Scanner scan = new Scanner(System.in);
        char tab = 9;
        char space = 32;

        System.out.println("수정할 파일의 경로를 입력하세요");
        INstr = scan.nextLine();



        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(INstr), "euc-kr") ); // 파일을 읽는 객체 ecu-kr은 한글 깨짐 방지용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/tabresult.txt") , "euc-kr")); // 파일을 쓰는 객체

        while( (result = br.readLine()) != null){//문자 치환 반복문
            result = result.replace(tab , space);
            bw.write(result + "\r\n"); //한줄 읽었으니 띄고 다음줄 읽기
            bw.flush();
        }
        bw.close();
        br.close();

    }
}
