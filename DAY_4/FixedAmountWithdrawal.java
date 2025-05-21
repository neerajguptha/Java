package DAY_4;

class FiexedAmount{
    public int fixedamount=10000;
}

abstract class Withdrawal{
    abstract void withdraw(int amount);
}

public class FixedAmountWithdrawal extends Withdrawal{
     FiexedAmount f=new FiexedAmount();
    
        void withdraw(int amount){
            f.fixedamount-=amount;
            System.out.println("withdrawn "+amount);
            System.out.println("Availabel balance is "+f.fixedamount);
        }
public static void main(String[]args){
    int amount=Integer.parseInt(args[0]);   
    FixedAmountWithdrawal d=new FixedAmountWithdrawal();
    d.withdraw(amount);
    
}}