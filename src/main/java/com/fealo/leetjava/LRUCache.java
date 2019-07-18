package com.fealo.leetjava;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class LRUCache<E> {

    private static class LruLinkedNode<E> {
        String key;
        E value;
        LruLinkedNode<E> prev;
        LruLinkedNode<E> next;
    }

    private HashMap<String, LruLinkedNode> cacheMap = new HashMap();
    private int count;
    private int capacity;
    private LruLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;

        head = new LruLinkedNode();
        head.prev = null;

        tail = new LruLinkedNode();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    public LruLinkedNode get(String key) {
        LruLinkedNode node = cacheMap.get(key);
        if (node == null) {
            throw new NoSuchElementException();
        }
        return node;
    }

    public void set(String key, E element) {
        LruLinkedNode node = cacheMap.get(key);

        if (node == null) {
            LruLinkedNode newNode = new LruLinkedNode();
            newNode.key = key;
            newNode.value = element;

            cacheMap.put(key, newNode);
            addNode(node);

            ++count;

            if (count > capacity) {
                LruLinkedNode tailNode = popTail();
                cacheMap.remove(tailNode);

                --count;
            }
        } else {
            node.value = element;
            moveToHead(node);
        }
    }

    private void addNode(LruLinkedNode node) {
        node.prev = head;
        node.next = head.next;

        node.next.prev = node;
        head.next = node;
    }

    private void removeNode(LruLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(LruLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private LruLinkedNode popTail() {
        LruLinkedNode tailNode = tail.prev;
        removeNode(tailNode);

        return tailNode;
    }
}

