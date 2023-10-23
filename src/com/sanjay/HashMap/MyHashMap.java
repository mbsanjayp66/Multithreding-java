package com.sanjay.HashMap;

import java.util.HashMap;

public class MyHashMap<K,V> {

	private static final int INITIAL_SIZE = 1<<4;
	private static final int MAXIMUM_CAPACITY = 1<<30;
	
	public Entry[] hashTable;
	public MyHashMap() {
		hashTable = new Entry[INITIAL_SIZE];
	}
	
	public MyHashMap(int capacity) {
		int tableSize = calTableSize(capacity);
		
	}

	private int calTableSize(int capacity) {
		int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}
	@SuppressWarnings({ "null", "unchecked" })
	public void put(K key, V value) {
		int hashCode = key.hashCode()%hashTable.length;
		@SuppressWarnings("rawtypes")
		Entry node = hashTable[hashCode];
		if(node==null) {
			Entry<K, V> entry = new Entry<K, V>(key, value);
			hashTable[hashCode] = entry;
		}else {
			if(node.key==key) {
				node.value = value;
			}
			while(node.next!=null) {
				node = node.next;
				if(node.key==key) {
					node.value = value;
					break;
				}
			}
			if(node.next==null) {
				node.next = new Entry<K, V>(key, value);
			}
			
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode()%hashTable.length;
		Entry<K, V> node = hashTable[hashCode];
		if(node==null) {
			return null;
		}else {
			while(node!=null) {
				if(node.key.equals(key)) {
					return (V)node.value;
				}
				node = node.next;
				
			}
		}
		return null;
	}
	
	
	public static void main(String args[]) {
		MyHashMap<Integer, String>myHashMap = new MyHashMap<>();
		myHashMap.put(1, "Sanjay");
		myHashMap.put(2, "Sn");
		myHashMap.put(3, "Ravi");
		myHashMap.put(4, "Ani");
		myHashMap.put(5, "pank");
		System.out.println(myHashMap.get(11));
		
	}
}


class Entry<K,V>{
	public K key;
	public V value;
	public Entry next;
	
	Entry(K key,V value){
		this.key = key;
		this.value = value;
	}
}
