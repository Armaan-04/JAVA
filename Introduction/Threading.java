public class Threading { //Threading is used for multiple sequences of execution.
    public static void main(String[] args){
        System.out.println("Thread id: " + Thread.currentThread().getId()); //currentThread tells us which thread is being executed
        new Thread(new Runnable(){ //thread requires a runnable object.
            @Override
            public void run(){
                System.out.println("New thread: " + Thread.currentThread().getId());
            }
        }).start();
        try{
            Thread.sleep(3000);
        } catch( InterruptedException e){
            System.out.println("Exception came in threading ");
        }
        System.out.println("Main program ends here");
    }
}

        