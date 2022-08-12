package chapter3;

public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = ++gameScore; // 151
        System.out.println(lastScore1);

        int lastScore2 = --gameScore; // 150
        System.out.println(lastScore2);
    }
}
