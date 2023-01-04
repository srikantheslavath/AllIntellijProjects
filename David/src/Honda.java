class Honda extends Bike{
    void run()
    {

        System.out.println("CBR1000RR");

    }
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();
        obj.bus();
    }
}