package com.example.admin.week2test;



class MyLinkedList {
    private static Node head;
    static int counter;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        MyLinkedList.counter = counter;
    }

    //number of elements in list

    //first node of list
    public static void main(String[] args){
    String test = "Hello";
    String test2 = "Goodbye";
    sendStringToList(test);
    sendStringToList(test2);
    int test3 = 6;
    boolean test4 = remove(test3);
    String output = listToString();
    System.out.println(output);
    }
    public static void sendStringToList(String string){
        for(int i = 0; i < string.length(); i++){
            add(string.charAt(i));
        }
    }
    public static String listToString(){
        String string = "";

        Node currentNode = head.getNextNode();
        while(currentNode != null){
            //turn list into string but add . between each to show if was separated
            string += "." + currentNode.getValue().toString();
            currentNode = currentNode.getNextNode();
        }
        return string;
    }
    public static Object get(int index){
        Node currentNode = null;
        if(head != null){
            currentNode = head.getNextNode();
            for(int i = 0; i < index; i++){
                if(currentNode.getNextNode() == null){
                    return null;
                }
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getValue();
        }
        return currentNode;
    }
    //Add element to the end of the list
    public static void add(Object character) {
        if (head == null) {
            head = new Node(character);
        }

        Node tempNode = new Node(character);
        Node currentNode = head;
        //start at the first node and go to the last one
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(tempNode);
        //element added, so increment
        counter++;
    }
//TO DO, fix remove
    public static boolean remove(int index) {


        if (index < 1 || index > counter) return false;

        Node currentNode = head;
        //check to make sure there is even a node to remove
        if(head!= null){
            //iterate through list if it hits the end there's a problem
            for (int i = 0; i < counter ; i++) {
                if(currentNode.getNextNode() == null){
                    return false;
                }
                currentNode = currentNode.getNextNode();
            }
            //since a "middle" node is removed, we need to assign nextNode of
            //before node to the node after the one removed
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());

            //element removed, size decreased
            counter--;
            //element was removed
            return true;
        }
        //else if head is null (no elements in list)
        return false;
   }
    private static class Node {
        Node nextNode;
        Object value;
        private Node(Object value) {
            nextNode = null;
            this.value = value;
        }

        private Node(Object value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public void setValue(Object value) {
            this.value = value;
        }
        public Object getValue(){
            return value;
        }
    }

}
