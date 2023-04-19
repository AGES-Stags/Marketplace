
public class AppDouble{

    public static void main(String[] args) {
         linkedListHeaderTrailer l = new linkedListHeaderTrailer();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(0, 1);
        l.add(3, 25);
        l.add(l.size(), 60);

        System.out.println(l);
        System.out.println("size=" + l.size());
        System.out.println("Elemento da posicao 2: " + l.get(2));
        System.out.println("Elemento removido da posicao 0: " + l.removeByIndex(0));
        System.out.println("Removeu 30? " + l.remove(30));
        System.out.println("Removeu 33? " + l.remove(33));
        System.out.println("Trocou " + l.set(2, 30) + " por 30.");

        System.out.println("Lista l: ");
        System.out.println(l);

        Integer a[] = l.subList(1, 4);
        System.out.println("Sublist(1,4)");
        for (Integer i : a) {
            System.out.println(i);
        }
        
        linkedListHeaderTrailer l2 = new linkedListHeaderTrailer();
        l2.add(2);
        l2.add(30);
        l2.add(8);
        l2.add(50);
        l2.add(7);
        
        System.out.println("Maior valor comum entre l e l2 = " +getBiggestComumValue(l,l2));
   
        l.reverse();
        
        System.out.println("Lista l depois da inversao: ");
        System.out.println(l);
    }

    /**
     * Metodo que recebe duas listas de inteiros por parametro, l1 e l2, e
     * retorna o maior valor que aparece simultaneamente nas duas listas. Caso
     * as listas nao possuam valores em comum, o metodo retorna null. Nao podem
     * ser usados os atributos da lista, isto e´, apenas os seus metodos podem
     * ser chamados. Exemplo: lista1 = {1,2,3,4,5,6,7,8} lista2 = {0,2,4,6,8,10}
     * Integer n = getBiggestComumValue(lista1,lista2) Conteúdo de n = 8
     *
     * @param l1 lista a ser verificada
     * @param l2 lista a ser verificada
     * @return Integer maior valor que aparece simultaneamente nas duas listas
     */
    public static Integer getBiggestComumValue(linkedListHeaderTrailer l1, linkedListHeaderTrailer l2) {
        Integer maior = null;

        // Percorre l1 (for)
        //  Verifica se l2 contem o elemento do l1
        //      Se contem, se maior == null, inicializa maior com este elemento
        //                 se maior != null, verifica se este elemento eh > que 
        //                                  maior para atualizar maior
        for (int i = 0; i < l1.size(); i++) {
            Integer n = l1.get(i);
            if (l2.contains(n)) {
                if (maior == null) { // primeiro elemento em comum encontrado
                    maior = n;
                } else {
                    if (n > maior) {
                        maior = n;
                    }
                }
            }
        }
        return maior;
    }

}
