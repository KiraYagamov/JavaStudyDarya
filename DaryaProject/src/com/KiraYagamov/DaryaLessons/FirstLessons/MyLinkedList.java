package com.KiraYagamov.DaryaLessons.FirstLessons;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    public void Add(T value){
        if(count == 0){
            Node<T> node = new Node<>(value, null);
            head = node;
            tail = node;
        }
        else{
            Node<T> node = new Node<>(value, null);
            tail.nextNode = node;
            tail = node;
        }
        count++;
    }

    public T Get(int index){
        Node<T> node = head;
        if(index > count-1){
            return null;
        }
        else{
            for(int i = 0; i < index; i++){
                node = node.nextNode;
            }
            return node.value;
        }
    }
    public boolean Remove(T value){
        Node<T> node = head;
        if(head.value == value){
            head = head.nextNode;
            count--;
        }
        for(int i = 0; i < count-1; i++){
            if(node.nextNode.value == value){
                Node<T> newNode = node.nextNode.nextNode;
                node.nextNode = newNode;
                count--;
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }

    public boolean RemoveAt(int index){
        Node<T> node = head;
        if(index > count-1){
            return false;
        }
        else if(index == 0){
            head = head.nextNode;
            count--;
            return true;
        }
        else{
            for(int i = 0; i < index-1; i++){
                if(i == 0){
                    node = head;
                }
                else {
                    node = node.nextNode;
                }
            }
            Node<T> newNode = node.nextNode.nextNode;
            node.nextNode = newNode;
            count--;
            return true;
        }
    }



    public void Set(int index, T value){
        Node<T> node = head;
        if(index > count-1){
            return;
        }
        else{
            for(int i = 0; i < index; i++){
                node = node.nextNode;
            }
            node.value = value;
        }
    }

    public int Count(){
        return count;
    }
}