public class PayMoney {
    public static int getAchievedTransaction(double[] transactions, double dailyTarget) {
        double runningTotal = 0;
        for (int i = 0; i < transactions.length; i++) {
            runningTotal += transactions[i];
            if (runningTotal >= dailyTarget) {
                return i + 1; // add 1 to get the index of the transaction
            }
        }
        return -1; // target not achieved
    }

    public static void main(String[] args) {
        double[] transactions = { 1000, 2000, 3000, 4000, 5000 };
        double dailyTarget = 8000;

        int achievedTransaction = getAchievedTransaction(transactions, dailyTarget);
        if (achievedTransaction != -1) {
            System.out.println("PayMoney achieves the target #" + achievedTransaction);
        } else {
            System.out.println("PayMoney is unable to achieve the target");
        }
    }
}
