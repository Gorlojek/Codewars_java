package kyu4.secret_string_from_random_triplets;

import java.util.*;
import java.util.stream.Collectors;

public class SecretDetective {
    public static void main(String[] args) {
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };
        recoverSecret(triplets);
    }

    public static String recoverSecret(char[][] triplets) {
        //usuwamy po kolei literki co maja tylko indeksy zero i ponownie rozpatruje cala tablice
        // jezeli "wiersz" nie ma juz literek to tez go usuwam
        // wykonuje pętle dopóki triplets.length = 0;

        //pętla do wpisania literek do listy
        List<char[]> copyOfTriplets = new ArrayList<>();
        for(int i = 0;i<triplets.length;i++){
            copyOfTriplets.add(triplets[i]);
        }
        List<Character> chr = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < triplets.length; i++) {
            for (int j = 0; j < triplets[i].length; j++) {
                chr.add(triplets[i][j]);
            }

        }
        System.out.println(chr);
        //pojedyncze literki
        List<Character> chars = chr.stream().distinct().collect(Collectors.toList());
        System.out.println(chars);
        while(chars.size()>0) {
            System.out.print(chars.size() + " ");
            int indexToRemove =0;
            for (int i = 0; i < chars.size(); i++) {
                int[] indexes = indexes(chars.get(i), triplets);
                int sum = 0;
                for (int x : indexes) {
                    sum += x;
                }
                if (sum == 0) {
                    result.add(chars.get(i));
                    indexToRemove = i;
                    System.out.println("index: " + indexToRemove);
                }
            }
            chars.remove(indexToRemove);
        }
        System.out.println(result);
        return null;
    }
    public static int[] indexes (char ch, char[][] triplets){
        int[] indexes = new int[0];
            for(int j = 0;j<triplets.length;j++){
                for(int k = 0;k<triplets[j].length;k++){
                    if(ch == triplets[j][k]){
                        indexes = addIndexToArr(indexes,k);
                    }
                }
            }
            return indexes;
    }
    public static int[] addIndexToArr(int[] indexes, int index){
        int[] temp = Arrays.copyOf(indexes,indexes.length+1);
        temp[indexes.length] = index;
        return temp;
    }


}