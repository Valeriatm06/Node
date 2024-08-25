package co.edu.uptc.models;

public class SimpleList {
    private Node header;

    // VERSION 1 
    // public void add(String info){
    //     Node node = new Node();
    //     node.setInfo(info);
    //     node.setNext(null);
    //     header = node;
    // }

    public void add(String info){
        Node newNode = new Node();
        newNode.setInfo(info); 
        newNode.setNext(null);
        if(isEmpty()){
            header = newNode;
        }else{
            findLastNode().setNext(newNode);
        }
    }

    public boolean isEmpty(){
        return header == null;
    }

    public Node findLastNode(){
        Node last = header;
        while (last.getNext()!=null) {
            last = last.getNext();
        }
        return last;
    }


    //TODO: Ingresar al inicio
    public void addToTop(String info){
        Node newNode = new Node();
        newNode.setInfo(info); 
        newNode.setNext(header);
        header = newNode;
    }

    // test algoritm 
    public void showList(){
        Node aux =  header;
        while (aux!=null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    //Añadir después de un nodo indicado
    public void addAfterNode(String key, String info) {
        Node foundNode = findNode(key);
        if (foundNode != null) { 
            Node newNode = new Node();
            newNode.setInfo(info);
            newNode.setNext(foundNode.getNext()); 
            foundNode.setNext(newNode); 
        }
    }

    public Node findNode(String key) {
        Node auxNode = header;
        Node foundNode = null;
        boolean itIs = false;
        while (auxNode != null && !itIs) {
            if (auxNode.getInfo().equals(key)) {
                itIs = true;
                foundNode = auxNode;
            }
            auxNode = auxNode.getNext();
        }
        return foundNode; 
    }
    

}
