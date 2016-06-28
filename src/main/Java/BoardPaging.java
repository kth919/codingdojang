import java.util.Scanner;

/**
 * Created by admin on 2016-06-28.
 */
public class BoardPaging {

    public static void main(String[] args){

        int M;
        int N;
        int result = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("게시글의 총 갯수를 입력하세요");
        M = scan.nextInt();

        System.out.println("페이지당 몇개의 게시글을 올립니까?");
        N = scan.nextInt();

        result = M/N;

        if(M%N != 0){
            result += 1;
        }

        System.out.println("총 페이지 갯수는" + result);

    }
}
