//import java.util.ArrayList;
//
//import static java.lang.Long.parseLong;
//
///**
// * Created by admin on 2016-06-28.
// */
//public class SplitAndMultipleAndPlus {
// //10~1000까지의 각각의 수를 분해하여 곱한 다음 그것들을 모두 더하시오.
//
//    public  static void main(String[] args) {
//
//        String str;
//        char[] ch;
//        String[] tmp;
//        long MultipleSum;
//        long Sum = 0;
//
//        for (int i = 10; i <= 1000; i++) {
//
//            str = String.valueOf(i);
//
//            ch = str.toCharArray();
//            tmp = new String[ch.length];
//            MultipleSum = 1; // 맨 바깥에서 초기화하면 곱이 0이되는 순간 변수를 다시 복구하지 못해서 값이 0으로 되어버림.
//
//            for(int j = 0; j<ch.length; j++) {
//                tmp[j] = String.valueOf(ch[j]); //숫자를 텍스트화 후 조각내서 저장
//
//                MultipleSum *= ( parseLong(tmp[j])); // int화 후에 배열곱 실행
//
//            }
//            Sum += MultipleSum;
//        }
//        System.out.println("합은"+Sum);
//    }
//}
