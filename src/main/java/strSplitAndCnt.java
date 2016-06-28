/**
 * Created by admin on 2016-06-27.
 */
public class strSplitAndCnt {
//1~1000까지의 숫자를 받아 각 숫자를 구성하는 원소숫자의 개수를 세시오.

    public static void main(String[] args) {



        int[] cnt = new int[10]; //개수를 담을 변수 배열
        String str;
        int tmp;

        for(int i = 1; i<1001; i++){ //1부터 1000까지 숫자를 탐색

            str = String.valueOf(i);

            char[] ch = str.toCharArray();

            for(int j =0; j < str.length(); j++) {
               tmp = Integer.parseInt(String.valueOf(ch[j]));
                cnt[tmp]++;
            }
        }

        for(int j = 0; j<10; j++){
            System.out.println(j + "의 개수" + cnt[j]);
        }
    }



}
