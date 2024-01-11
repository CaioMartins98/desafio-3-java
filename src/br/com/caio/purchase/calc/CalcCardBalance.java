package br.com.caio.purchase.calc;

public class CalcCardBalance {
    private double cardBalance;

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void showLimit(){
        System.out.println("Saldo: " + this.getCardBalance());

    }
}
