package behavioral.chainOfResponsibility.var2;

public class Money {
    private int amt;

    public Money(int amt) {
        setAmt(amt);
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if ((amt > 0) && (amt <= 200000) && (amt % Note.H20 == 0)) {
            this.amt = amt;
        } else {
            throw new RuntimeException("Сумма должна быть не более 50 000 и должна быть кратна 20");
        }
    }
}
