package com.caius.HashTable;

import com.caius.POCClasses.Employee;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        //no collision handling yet
        if(occupied(hashedKey)){
            //when to stop looking
            int stopIndex = hashedKey; //starting and ending - wrap around
            if (hashedKey == hashtable.length-1){
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }
            //if occupied -> increment by 1 -> while loop
            while (occupied(hashedKey) && hashedKey!=stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if (occupied(hashedKey)){
            System.out.println("Already employee at position " + hashedKey);
        }
        else{
            hashtable[hashedKey] = new StoredEmployee(key, employee);
            //hashkey as the lookup value (index of the array analogy)
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey==-1){
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;

        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++){
            if (oldHashTable[i]!=null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }

        hashtable[hashedKey] = null;
        return employee;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        //does the raw key match the employee key?
        if (hashtable[hashedKey]!=null&&
            hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length-1){
            hashedKey=0;
        }
        else{
            hashedKey++;
        }
        while (hashedKey!=stopIndex &&
                hashtable[hashedKey]!=null &&
                !hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1)%hashtable.length;
        }

        if (hashtable[hashedKey]!=null &&
        hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }
    }
    private int hashKey(String key){
        //use last name as key for this impl.
        return key.length() % hashtable.length;
        //return an int
        //key can be anything -> we just hash it to an integer
    }

    private boolean occupied (int index){
        return hashtable[index] != null;
    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length; i++){
            if (hashtable[i]==null){
                System.out.println("empty");
            }
            else {
                System.out.println(hashtable[i].employee);
            }
        }
    }
}
