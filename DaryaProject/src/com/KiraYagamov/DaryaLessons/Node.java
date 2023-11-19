package com.KiraYagamov.DaryaLessons;

public class Node<T> {
    public T value;
    Node<T> nextNode;
    public Node(T value, Node<T> node){
        this.value = value;
        nextNode = node;
    }
}