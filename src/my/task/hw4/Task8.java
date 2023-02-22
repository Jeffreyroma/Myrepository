package my.task.hw4;

public class Task8 {

    public static void main(String[] args) {

        int reward = 0;
        for(int ticket=1001;ticket<1000000;ticket++){
            int digit1 = ticket / 100000 % 10;
            int digit2 = ticket / 10000 % 10;
            int digit3 = ticket / 1000 % 10;
            int digit4 = ticket / 100 % 10;
            int digit5 = ticket / 10 % 10;
            int digit6 = ticket % 10;
            if((digit1+digit2+digit3)==(digit4+digit5+digit6)){
                reward++;
            }
        }
        System.out.println("Number of lucky ticket is : " + reward);
    }
}




