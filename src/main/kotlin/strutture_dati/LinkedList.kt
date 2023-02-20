package strutture_dati

fun main() {
    print("\n\n Operazione eseguita con ARRAY \n")
    array();

    print("\n\n\n Operazione eseguita con LINKEDLIST \n")
    linkedList();
}

/**
 * ARRAY:
 *  - Pro: più efficienti nell'accedere ai propri elementi => essendo che li memorizzano modo contiguo in memoria
 *  - Contro: meno efficienti quando si tratta d'inserire o eliminare elementi => xke vano spostati anche tutti quelli dopo
 *
 *  LINKEDLIST:
 *  - Pro: più efficienti quando si tratta d'inserire o eliminare elementi => perche basta odificare la referenza al nodo successivo (senza spostarli tutti di un +/-1)
 *  - Contro: meno efficienti come tempi nell'accedere ai suoi elementi => siccome salvati in maniera sparsa nella memoria
 */


fun array() {

    val array = Array(10) { i -> i + 1 } // crea un array con 10 elementi da 1 a 10
    val newValue = 11

    // sposta tutti gli elementi successivi alla posizione 5 di una posizione verso destra
    for (i in 9 downTo 5) {
        array[i] = array[i - 1]
    }

    // inserisce il nuovo valore alla posizione 5
    array[4] = newValue
    // stampa l'array modificato
    println(array.joinToString(", "))
}

fun linkedList() {

    class Node(var value: Int, var next: Node? = null)

    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)
    val node5 = Node(5)
    val node6 = Node(6)
    val node7 = Node(7)
    val node8 = Node(8)
    val node9 = Node(9)
    val node10 = Node(10)

    // crea una linked list con 10 nodi contenenti i valori da 1 a 10
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = node8
    node8.next = node9
    node9.next = node10

    val newValue = 11
    val newNode = Node(newValue)

    // trova il quarto nodo (corrispondente alla posizione 5) e crea un nuovo nodo con il nuovo valore
    val node4Found = node1.next?.next?.next

    // inserisce il nuovo nodo dopo il quarto nodo
    node4Found?.next = newNode //modifico puntatore a nodo PRECEDENTE (inserisce il nuovo nodo davanti al nodo4)
    newNode.next = node4Found?.next //modifico puntatore a nodo SUCCESSIVO (lega il nuovo nodo al nodo a cui era legato node4 prima)

    // stampa i valori dei nodi nella lista modificata
    var currentNode: Node? = node1
    while (currentNode != null) {
        print("${currentNode.value}, ")
        currentNode = currentNode.next
    }
}









