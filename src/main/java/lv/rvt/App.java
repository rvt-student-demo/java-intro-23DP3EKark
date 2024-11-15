package lv.rvt;

public class App {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);
    }
}