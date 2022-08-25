package com.companyadventuredemo;


import java.util.Arrays;

public class List<T> {

    Object myList[];
    private int count=0;


    public List() {
        this.myList = (T[]) new Object[10];
    }
    public List(int capacity) {
        this.myList = (T[]) new Object[capacity];
    }
    public int size(){
        return myList.length;
    }
    public int getCapacity(){
        return count;
    }
    public T getIndex(int index){
        return (T) myList[index];
    }
    public void removeIndex(int index){
        if(index<0 && index > count){
            for (int i = index; i < myList.length - 1; i++) {
                myList[i] = myList[i + 1];
                myList[count]=null;
            }
        }else{
            return;
        }

    }
    public void add(T data){

        if(count<myList.length-1){
            myList[count]=data;

        }else{
           int length = myList.length;
           Object myList[] = (T[]) new Object[length*2];
            myList[count]=data;

        }
        count++;
    }
    public void setIndex(int index, T data){
        if(index<0 && index > count){
            myList[index]=data;
        }else{
            return;
        }

    }
    public String toString(){
        int j=0;
        String toList = "[";
        for(int i=0; i<myList.length;i++){
            if(myList[i]!=null){
                toList += myList[i]+",";
                j++;
            }
        }
        int end = toList.length();
        if(j>0){
            toList = toList.substring(0, end - 1);
        }

        toList+="]";
        return toList;
    }
    public int indexOf(T data){
        for(int i=0;i<myList.length;i++){
            if(myList[i]==data){
                return i;
            }
        }
        return -1;

    }
    public int lastIndexOf(T data){
        for(int i=count;i<myList.length;i--){
            if(myList[i]==data){
                return i;
            }
        }
        return -1;

    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }
    public T[] toArray() {
        return Arrays.copyOf((T[])myList, count);
    }
    public void clear(){
        for(int i=0;i< myList.length;i++){
            myList[i]=null;
        }
        count=0;
    }
    public List<T> sublist(int start,int finish){
        if((start<0 || start> myList.length) && (finish<0 || finish> myList.length || finish<start)){
            return null;
        }
        List<T> list = new List<T>(myList.length);

        for(int i=start;i<=finish;i++){

                list.add((T) myList[i]);


        }
        return list;
    }
    public boolean contains(T data){
        for(int i= 0;i<myList.length;i++){
            if(data==myList[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
	List<Integer> liste = new List<Integer>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        List<Integer> altListem = liste.sublist(0,3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());

    }
}
