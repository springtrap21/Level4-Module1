package _01_Custom_ArrayList;

import org.junit.platform.engine.support.descriptor.FileSystemSource;

import java.sql.SQLOutput;

@SuppressWarnings("unchecked")

public class ArrayList <T>{

	private Object[] items;
	private int size;
	
	public ArrayList() {

	items = new Object[100];
	size = 0;
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {

		return (T) items[loc];
	}
	
	public void add(T val) {

		items[size] = val;
        size++;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		for (int i = size; i > loc; i--) {
			items[i] = items[i - 1];
		}
		items[loc] = val;
		size++;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {

		items[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {

		items[loc] = items[size - 1];
    }
	
	public boolean contains(T val) {
		for (int i = 0; i < size; i++) {
			if (items[i] == val) {
				return true;
			}
		}
		return false;
	}
}