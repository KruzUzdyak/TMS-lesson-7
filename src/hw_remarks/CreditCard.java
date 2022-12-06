package hw_remarks;

public class CreditCard {

    int sum;
    String number;

    public CreditCard(int sum, String number) {
        this.sum = sum;
        this.number = number;
    }

    void addMoney(int money) {
        sum += money;
    }


    void addMoney(CreditCard card, int money) {
        this.sum += card.getMoney(money);
    }

    int getMoney(int money) {
        sum -= money;
        System.out.println(this.toString() + "\n retrieved = " + money);
        return money;
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(100, "a");
        CreditCard card2 = new CreditCard(200, "b");

        System.out.println(card2);
        card2.addMoney(card1, 50);
        System.out.println(card2);
    }

    @Override
    public String toString() {
        return "Card{" +
                "sum=" + sum +
                ", number='" + number + '\'' +
                '}';
    }
}
