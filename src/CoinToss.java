import java.util.Random;
public class CoinToss {
    public static void main(String[] Args) {
        int finalHead =0;
        int finalTail =0;
        int draws = 0;
        for (int p = 0; p < 100000; p++) {
            int head = 0;
            int tail = 0;
            Random coinToss = new Random();
            int coin;
            for (int i = 0; i < 10; i++) {
                coin = coinToss.nextInt(2);
                if (coin == 0) head += 1;
                else tail += 1;
            }
            System.out.println("Heads: " + head + " " + "Tails: " + tail);
            if (head < tail) ++finalTail;
            else if (tail < head) ++finalHead;
            else ++draws;
        }
        System.out.println("Total head wins "+finalHead);
        System.out.println("Total tail wins "+finalTail);
        System.out.println("Total draws "+draws);
    }


}
