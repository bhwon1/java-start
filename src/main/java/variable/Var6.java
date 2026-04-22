package variable;

public class Var6 {
    static void main(String[] args) {
        int a;
//        System.out.println(a);

        // 초기화를 하지 않아서 오류가 나는 이유: 기존에 누가 사용하고 있었는데, 거기에 아무것도 들어있는지 아무도 모른다. 초기화를 하지 않으면 이상한 값이 출력될수 있어서 초기화하는것이 기본 디폴트!!! (지역변수라고 함)
        // 지금은 컴파일 에러라고 함.
    }
}
