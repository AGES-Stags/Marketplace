public class Stack {
    private int tamanhoMaximo;
    private int[] elementos;
    private int topo;

    public Stack(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanhoMaximo - 1;
    }

    public int Size() {
        return topo + 1;
    }

    public void pop(int elemento) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia!");
        }
        topo++;
        elementos[topo] = elemento;
    }

    public int popOff() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        int elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        return elementos[topo];
    }
}
