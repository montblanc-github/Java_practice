
public class DoWhile01 {
    public static void main(String[] args) {
//    	numberを100にした場合、先に2倍してから処理するため、出力結果は200になる。
        int number = 1;
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
    }
}
