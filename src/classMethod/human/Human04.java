package classMethod.human;

public class Human04 {

	static public int humanCount = 0;
    public String name;

    public static final String GREETING = "こんにちは";

    public Human04(String name) {
        this.name = name;
        Human04.humanCount++;
    }

    static public void staticMethodPrint() {
        // staticメソッドからインスタンス変数は使用できない（コンパイルエラー）
        // System.out.println("名前は、" + name);
        System.out.println("人の数は" + Human04.humanCount);
    }

    public void instanceMethodPrint() {
        // インスタンス変数のnameを表示
        System.out.println("名前は" + name);
    }
}
