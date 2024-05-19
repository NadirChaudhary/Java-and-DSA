public class AccessModifiers{
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        myAccount.userName = "Nadir";
        System.out.println(myAccount.userName);

        myAccount.setPassword('dhsdj');
        System.out.println(myAccount.password);
    }
}

class BankAccount{
    public String userName;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}