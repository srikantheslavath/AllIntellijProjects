package org.OopsConcepts.Encapsule;

public class Account {
    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no(){
        return acc_no;
    }

    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }

    public static void main(String[] args) {
        Account a= new Account();
        a.setAcc_no(3092758);
        System.out.println(a.getAcc_no());
    }

}
