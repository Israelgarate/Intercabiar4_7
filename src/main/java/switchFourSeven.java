/*
Simple kata, simple rules: your function should accept the inputs 4 and 7. If 4 is entered, the function should return 7. If 7 is entered, the function should return 4. Anything else entered as input should return 0. There's only one catch, your function cannot include if statements, switch statements, or the ternary operator.

There are some very simple ways of answering this problem, but I encourage you to try and be as creative as possible.
* */




public class switchFourSeven {
    public static int fourSeven(int n){
        int res = 0;
        while(n == 4 || n == 7){
            while(n == 4){
                res = 7;
                break;
            }
            while(n == 7){
                res = 4;
                break;
            }
            break;
        }
        return res;
    }
}
