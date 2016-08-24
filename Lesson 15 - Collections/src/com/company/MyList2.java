package com.company;

/**
 * Created by eladlavi on 21/08/2016.
 */
public class MyList2 implements  Listable {

    Link anchor;
    Link last;
    int pos;

    public MyList2(){
        anchor = new Link(10);
        last = anchor;
        pos = 0;
    }


    @Override
    public void add(int num) {
        /*
        Link last = anchor;
        while(last.next != null){
            last = last.next;
        }
        */
        last.next = new Link(num);
        last = last.next;
        pos++;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= pos)
            throw new IndexOutOfBoundsException();
        Link theOneBefore = anchor;
        for (int i = 0; i < index; i++) {
            theOneBefore = theOneBefore.next;
        }
        theOneBefore.next = theOneBefore.next.next;
        pos--;
    }

    @Override
    public void addAt(int index, int num) {
        if(index < 0 || index >=pos)
            throw new IndexOutOfBoundsException();
        Link theOneBefore = anchor;
        for (int i = 0; i < index; i++) {
            theOneBefore = theOneBefore.next;
        }
        Link added = new Link(num);
        //we are adding the new one to be the place of the current one.
        added.next = theOneBefore.next;
        theOneBefore.next  = added;
        pos++;


    }

    @Override
    public void set(int index, int num) {
        if(index < 0 || index >=pos)
            throw new IndexOutOfBoundsException();
        Link link = anchor;
        for (int i = 0; i <= index; i++) {
            link = link.next;
        }
        link.value = num;

    }

    @Override
    public int get(int index) {
        if(index < 0 || index >=pos)
            throw new IndexOutOfBoundsException();
        Link link = anchor;
        for (int i = 0; i <= index; i++) {
            link = link.next;
        }
        return link.value;
    }

    @Override
    public int indexOf(int num) {
        Link link = anchor;
        int counter = 0;
        while (link.next != null){
            link = link.next;
            if(link.value == num)
                return counter;
            counter++;
        }
        return -1;
    }

    @Override
    public int[] toArray() {
        int [] arr = new int[pos];
        Link link = anchor;
        for (int i = 0; i < pos; i++) {
            link = link.next;
            arr[i] = link.value;
        }
        return arr;
    }

    @Override
    public int size() {
        return pos;
    }

    static class Link{
        int value;
        Link next;

        public Link(int value){
            this.value = value;
        }
    }

    @Override
    public String toString() {
        if (pos == 0){
            return "{}";
        }
        String s = "{";
        Link link = anchor;
       /* for (int i = 0; i < pos - 1; i++) {
            link = link.next;
            s += link.value + ",";
        }*/
        while(link.next != null){
            link= link.next;
            s += link.value + ",";
        }
        s += last.value;
        s += "}";
        return s;
    }
}


