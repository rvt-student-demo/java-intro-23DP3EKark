package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int totalCents = (this.euros * 100 + this.cents) + (addition.euros * 100 + addition.cents);
        return new Money(totalCents / 100, totalCents % 100);
    }

    public boolean lessThan(Money compared) {
        if (this.euros * 100 + this.cents < compared.euros * 100 + compared.cents ) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int totalCents = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
        
        if (totalCents <= 0) {
            return new Money(totalCents = 0, totalCents = 0);
        } else {
            return new Money(totalCents / 100, totalCents % 100);
        }
        
    }


}
