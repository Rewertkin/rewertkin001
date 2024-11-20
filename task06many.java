public class task06many {
    public static void main(String[] agrs) {
        byte x = 100;
        byte y = 5;
        byte z = 100;
        System.out.println(toSumm(x, y, z));

    }

    static int factorial(int x) {

        if (x == 1) {

            return 1;
        }
        return x * factorial(x - 1);
    }

    public static String toConcatenations(String ...stringArray){
        String concatenations = "";
        for(String x:stringArray){
            concatenations += x;
        }
        return concatenations;
    }

    public static int toSumm(int ...numbersArray){
        int summ = 0;
        for(int x:numbersArray){
            if(checkLimit(Integer.MIN_VALUE, Integer.MAX_VALUE, summ, x)){
                System.out.println("Внимание! Для типа Integer превышен лимит!");
                return summ;
            }
            summ += x;
        }
        return summ;
    }

    public static byte toSumm(byte ...numbersArray){
        byte summ = 0;
        for(byte x:numbersArray){
            if(checkLimit(Byte.MIN_VALUE, Byte.MAX_VALUE, summ, x)){
                System.out.println("Внимание! Для типа Byte превышен лимит!");
                return summ;
            }
            summ += x;
        }
        return summ;
    }

    public static short toSumm(short ...numbersArray){
        short summ = 0;
        for(short x:numbersArray){
            if(checkLimit(Short.MIN_VALUE, Short.MAX_VALUE, summ, x)){
                System.out.println("Внимание! Для типа Short превышен лимит!");
                return summ;
            }
            summ += x;
        }
        return summ;
    }

    public static boolean checkLimit(long min, long max, long result, long current){

        return current + result < min || current + result > max;
    }
}
