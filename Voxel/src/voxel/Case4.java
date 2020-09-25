/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voxel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author A S U S
 */
public class Case4 {
    public static void main(String args[]){
        int [] dat = {23, 45, 67, 90, 23, 1, 6, 90, 12, 43, 90, 67};
        hapusData(dat);
    }
    public static void hapusData(int[]dat){
        List baru = new ArrayList<>();
        for(int i=0; i<dat.length-1;i++){
            for(int j=1;j<dat.length;j++){
                if(dat[i] == dat[j]){
                    continue;
                } else{
                    
                }
            }
        }

    }
}
