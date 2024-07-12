public class bank {
    public static class bankacc{
        String accountno,username;
        int balance;
        bankacc(String accno,String username){
            this.accountno=accno;
            this.username=username;
            System.out.println("your balance is null right now");
        }
        void deposit(int amount){
                this.balance+=amount;
        }
        void withdraw(int amount){
                this.balance-=amount;
        }
        void balance(){
            System.out.println("balance left is"+this.balance);
        }
    }
    public static void main(String[] args){
        bankacc b1=new bankacc("123","vishanth");
        b1.deposit(50000);
        b1.withdraw(10000);
        b1.balance();

    }

}
    

