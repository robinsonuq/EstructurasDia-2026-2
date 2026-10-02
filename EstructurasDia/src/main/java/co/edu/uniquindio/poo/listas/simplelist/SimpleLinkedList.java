package co.edu.uniquindio.poo.listas.simplelist;

public class SimpleLinkedList {

    private int size;
    private NodeSimple firstNode;

    public SimpleLinkedList() {
        this.size = 0;
        firstNode = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(int data) {

        NodeSimple newNodeSimple = new NodeSimple(data);
        if(isEmpty()){
            firstNode = newNodeSimple;
        }else{
            newNodeSimple.setNext(firstNode);
            firstNode = newNodeSimple;
        }
        size++;
    }



    private boolean isEmpty() {
        return firstNode == null;
    }

    public void addLast(int data) {
        

    }
}
