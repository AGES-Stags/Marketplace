public class Timer {
    long startTime;
    long duration;
    public Timer(){
        
    }
    public void start(){
    startTime = System.currentTimeMillis();
    }

// Chame aqui a função que você deseja medir o tempo de execução
    public void stop(){
    long endTime = System.currentTimeMillis();
    duration = endTime - startTime;
    }

    public String toString(){
       return "timer: " + duration;
    }

}
