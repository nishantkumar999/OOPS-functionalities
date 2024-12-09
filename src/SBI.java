public class SBI extends RBI{

    private int bankTotalBalance = 0;

    public int getBankTotalBalance(){
        return this.bankTotalBalance;
    }
    public void setbankTotalBalance(int amount){
        this.bankTotalBalance += amount;
    }

    public void closeAccount(){
        System.out.println("closing account only offline available");
    }
}
