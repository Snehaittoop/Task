public class Bank {
    void rateofIntrest(){
        System.out.println(7);
    }



}
class sbi extends Bank{
    void rateofIntrest(){
        System.out.println(7.1);
    }

}
class icici extends Bank{
    void rateofIntrest(){
        System.out.println(7.5);
    }
}
class hdfc extends Bank{
    void rateofIntrest(){
        System.out.println(7.45);
    }
}
class axis extends Bank{
    void rateofIntrest(){
        System.out.println(7.5);
    }
}
class pnb extends Bank{
    void rateofIntrest(){
        System.out.println(7.1);
    }
}
class Main{
    public static void main(String[] args) {
        Bank b1=new sbi();
        b1.rateofIntrest();
        Bank b2 =new axis();
        b2.rateofIntrest();
        Bank b3=new hdfc();
        b3.rateofIntrest();
        Bank b4=new pnb();
        b4.rateofIntrest();


    }

}

