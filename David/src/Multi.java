class Multi implements Runnable{
    @Override
    public void run() {
        System.out.println("example for both runnable R and String");
    }

    public static void main(String[] args) {
        Runnable t = new Multi();
        Thread v = new Thread(t, " srivastava");
        v.start();
        String h= v.getName();
        System.out.println(h);
    }
}
