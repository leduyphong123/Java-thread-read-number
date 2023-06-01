

public class Main{
    public static void main(String[] args){
        Count count = new Count();
        while (count.getMyThread().isAlive()){
            System.out.println("Main thread will be alive till the child thread is live");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted exception");
            }
            System.out.println("Main thread run is over");
        }
    }
}