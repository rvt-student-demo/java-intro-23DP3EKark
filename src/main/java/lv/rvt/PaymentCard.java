package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = this.balance + openingBalance;

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros.";
    }

    public void eatAffordably() {
        this.balance = this.balance - 2.6;
    }
    
    public void eatHeartily() {

        if (this.balance >= 4.6) {
            this.balance = this.balance;
        }
        
        else {
            this.balance = this.balance - 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }
}