package Service;

public class DecBenHex {
    public static void main(String[] args) {
        int id=2;
        int io=010;
        int ih=0xa;
        int ib=100;
        char c ='a';
        String s="строка";
        double d1=1.2e20;
        System.out.printf("fromdeak to win %s%n", Integer.toBinaryString(id));

        for(int i=0; i<16; i++)
        System.out.println(Integer.toBinaryString(i));
        String s1="10101";
        System.out.println("Convert from binary to decimal");
        int nomDec= Integer.parseInt(s1,2);
        System.out.println(nomDec);
        System.out.println("Get one digit from a binary literal");
        int numberBin = 0b0101;
        int bit = numberBin&1;
        System.out.println(bit);
        int bit1= numberBin>>(101>>1)&1;
        System.out.println(bit1);
        //Bitwise operations on a binary
        //Logical NOT
        byte number1 = 0b0101;
        int result = ~number1;
        String sResult = Integer.toBinaryString(result);
        sResult = sResult.substring(28);
        System.out.println(sResult);
        //Logical AND
        byte number2 = 0b0100;
        result = number1 & number2;
        sResult = Integer.toBinaryString(result);
        System.out.println(sResult);
        //Logical OR
        result = number1 | number2;
        sResult = Integer.toBinaryString(result);
        System.out.println(sResult);

    }
}
