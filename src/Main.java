import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 변수
//        int a; // 변수 선언
//        int a = 9; // 변수 초기화
//        int a = "9"; // 타입 에러
//        String a = "9"; // string 은 객체, 대문자로 String

//        int age = 20;
//        age = 30;
//
//        char gender = 'M'; // char 는 무조건 홑따옴표, 1글자만 가능
//        String name = "John"; // String 은 쌍따옴표
//        boolean married = false;
//        float avgAge = 52.1f; // 반드시 맨 뒤에 f 붙여줘야함
//        double avgAge2 = 52.1; // d 생략가능
//
//        byte max = 127;
//        byte min = -128;
//
//        byte sum = (byte) (max + 1);
//        System.out.println(sum); // -128, overflow 현상
//
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a + b); // 0.30000000000000004
//
// //        BigDecimal bd = new BigDecimal(a);
// //        BigDecimal bd2 = new BigDecimal(b);
// //        BigDecimal bsum = bd.add(bd2);
// //        System.out.println(bsum); // 0.3000000000000000166533453693773481063544750213623046875
//
//        BigDecimal bd = new BigDecimal("0.1");
//        BigDecimal bd2 = new BigDecimal("0.2");
//        BigDecimal bsum = bd.add(bd2);
//        System.out.println(bsum); // 0.3


        // 연산자
//        System.out.println(1 == "1");
//        System.out.println(1 != 1);

//        String a = new String ("Hello World");
//        String b = new String ("Hello World");
//
//        System.out.println(a == b);

        // equals 문자열 비교
//        String a = "Hello World";
//        String b = "Hello World";
//        System.out.println(a.equals(b)); // 스트링 비교

        // for 문
//        for(int i = 1; i <= 5; i++) {
//            if(i == 3) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // 1 ~ 100까지 숫자 중 3과 7의 배수를 출력
//        int cnt = 0;
//        for(int a = 1; a <= 100; a++) {
//            if(a % 3 == 0 || a % 7 == 0) {
//                System.out.println(a);
//                cnt++;
//            }
//        }
//
//        System.out.println(cnt + "개"); // 총 개수

        // 배열
//        int[] arrInt = new int[10]; // []안 숫자는 배열의 길이
        int[] arrInt = {1, 2, 3, 4, 5}; // length 5인 배열을 선언과 동시에 초기화
        String[] arrString = {"a", "b", "c"};
//        arrInt[0] = "45"; // int 배열에 String 넣으면 데이터타입 안맞아서 에러

        // -----------------------------------------------------------------------
//        int[] arrInt2 = arrInt; // 이렇게 하면 arrInt 의 값이 아닌 주소를 참조
//        arrInt2[0] = 100; // arrInt[0]을 찾아가서 변경
//
//        System.out.println(Arrays.toString(arrInt)); // [100, 2, 3, 4, 5]
        // -----------------------------------------------------------------------

        // copyOf
        int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length); // 복사하고 싶은 배열, 복사하고싶은 배열의 길이

        arrInt2[0] = 100;

        System.out.println(Arrays.toString(arrInt)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arrInt2)); // [100, 2, 3, 4, 5]

    }
}