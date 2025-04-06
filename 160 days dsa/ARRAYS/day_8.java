package ARRAYS;

public class day_8 {
    public static void main(String[] args) {
        int prices[] = {7, 10, 6, 1, 4, 7, 8, 9, 2};
        System.out.print(maxprofit(prices));

    }
    static int maxprofit(int [] prices){
        int n = prices.length;
        int res = 0;
        int min = prices[0];

        for(int i =1;i<n;i++){
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i]-min);
        }
        return res;

    }
}
