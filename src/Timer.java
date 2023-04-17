public class Timer {
    public Timer(){
        
    }
    long startTime = System.currentTimeMillis();

// Chame aqui a função que você deseja medir o tempo de execução

    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    

    public String toString(){
       return "timer: " + duration;
    }

}
