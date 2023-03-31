package stringProblem;

public class TestString {
    public static void main(String[] args) {
        StringProblem stringProblem = new StringProblem();
        // test count char
        // String test1 = "kiaaaaa is balaaaa";
        // var result = stringProblem.countCharter1(test1);
        // result.entrySet().forEach(entry -> {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // });
//        test palindrome
//        String test2 = "abba";
//        var check = stringProblem.isPalindrome2(test2);
//        System.out.println(check);
        //test remove char from string
//        String test3 = "kiarasjh";
//        char c = "j".charAt(0);
//        var check1 = stringProblem.removeChar(c , test3);
//        System.out.println(check1);
        //test duplicate char from string
        var test = "kiarashVatrian";
        System.out.println(stringProblem.removeDuplicateChar(test));
    }
}
