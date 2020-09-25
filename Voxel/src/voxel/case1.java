/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voxel;

/**
 *
 * @author A S U S
 */
public class case1 {
    public static void main (String args[]){
        String kalimat = "jika input yang dimasukkan";

        char [] potong = kalimat.toCharArray();
        for(int i = 0; i<potong.length; i++){
            if(potong[i] == 'a' || potong[i] == 'u' || potong[i] == 'e' || potong[i] == 'o'){
                potong[i] ='i';
            }
        }
        System.out.println(String.valueOf(potong));
    }
}
