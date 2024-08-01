public class Result1To100 {
    public static void main(String[] args) {
        
        int iWhile = 1 , sum = 0;
        while (iWhile <= 100) {
            System.err.println("result : "+iWhile);
            iWhile ++ ;
            sum += iWhile;
        }
        System.out.println("result 1 To 100 = " + sum);
    }
}

