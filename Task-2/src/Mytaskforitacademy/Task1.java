package Mytaskforitacademy;

public class Task1 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.printf("b=%d;\ns=%d;\ni=%d;\nl=%d;\nc=%c;\nf=%f;\nd=%f;\nboll=%b;",b,s,i,l,c,f,d,bool);
    }
}
