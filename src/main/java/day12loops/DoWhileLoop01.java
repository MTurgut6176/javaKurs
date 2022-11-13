package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        int i = 1;
        while (i<1){
            System.out.println("While loop");
            i++;
        }
        // burada 1<1 olmaya icin while loop calismaz 'zero execotion"

        int k = 1;
        do{

        }while (k<1);
        System.out.println("do-while loop");
        k++;

        // do mwhile modu yanlis olsa bile bir kere bile olsa calismaz.
        // while loop icin kodun hic calistirilmama ihtimali vardir
        // do while loop un body si icin kod her halukarda en az bir kere calisir.

        // Exampe 1: Bir ondalik sayini ondalik kismindaki rakamlarinin toplamini bulunuz.
        //24.5673  ==> 5+6+7+3 = 23
        double num = 24.5673;
        String str= String.valueOf(num);
        System.out.println(str);//24.5673

        //regex icin nokta kullandigimizda hata aliriz o yuzden \\. seklinde yazmaliyiz
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);//5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;
        do {
            sum = sum + decimalInt%10;
            decimalInt =decimalInt/10;
        }while (decimalInt>0);
        System.out.println(sum);
    }
}
