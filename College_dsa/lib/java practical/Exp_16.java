// public class Exp_16 extends Thread{
//  public void run(){
//     System.out.println("My thread is in running state");
//   }
//     public static void main(String[] args){
//          Exp_16 a = new Exp_16();
//          a.start();
//     }
// }
class Count extends Thread{
    Count(){
        super("my extending thread");
        System.out.println("My thread created:"+ this);
        start();
    }
    public void run(){
        try {
            for(int i = 0;i<4;i++){
            System.out.println("Printing the count:"+i);
            Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("My Thread run is over");
    }
}
class Exp_16{
    public static void main(String[] args){
        Count cnt = new Count();
        try{
            while (cnt.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}