public class Mmn13StudentTester {

    public static void main(String[] args) {
        System.out.println("************ test Q1 - maxDigit START *************");

        int res = Ex13.maxDigit(123);
        System.out.println("\nrunning maxDigit(1023); expected 3, got " + res);

        res = Ex13.maxDigit(1320);
        System.out.println("\nrunning maxDigit(1320); expected 3, got " + res);

        res = Ex13.maxDigit(3012);
        System.out.println("\nrunning maxDigit(3012); expected 3, got " + res);

        System.out.println("\n************ test Q1 - maxDigit END *************");


        System.out.println("\n************ test Q2 - minOps START *************");

        res = Ex13.minOps(10, 22);
        System.out.println("\nrunning minOps(10, 22); expected 2, got " + res);

        res = Ex13.minOps(7, 12);
        System.out.println("\nrunning minOps(7, 12); expected 5, got " + res);

        res = Ex13.minOps(2, 10);
        System.out.println("\nrunning minOps(2, 10); expected 3, got " + res);

        System.out.println("\n************ test Q2 - minOps END *************");


        System.out.println("\n************ test Q3 - noOfLetters START *************");

        res = Ex13.noOfLetters("abcd");
        System.out.println("\nrunning noOfLetters(\"abcd\"); 	expected 4, got " + res);

        res = Ex13.noOfLetters("ababa");
        System.out.println("\nrunning noOfLetters(\"ababa\"); 	expected 2, got " + res);

        res = Ex13.noOfLetters("zaqaQ1Z");
        System.out.println("\nrunning noOfLetters(\"zaqaQ1Z\"); expected 3, got " + res);

        System.out.println("\n************ test Q3 - noOfLetters END *************");


    }
}
