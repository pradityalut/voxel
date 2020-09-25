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
public class case7 {
    public static void main (String [] args){
        int [] kasusUang = {160400,72500,0,3400};
        for(int i =0; i<kasusUang.length; i++){
            System.out.print("Uang "+kasusUang[i]+" :");
            pecahkan(kasusUang[i]);
            System.out.println();
//            pecahkan(54200);
        }
        
    }
    public static void pecahkan(int uang){
        if(uang < 100){
            return;
        }
        if(uang >= 100000){
            uang -= 100000;
            System.out.print("100000,");
        }else if(uang >= 50000){
            uang -= 50000;
            System.out.print("50000,");
        } else if(uang >= 20000){
            uang -= 20000;
            System.out.print("20000,");
        }else if(uang >= 10000){
            uang -= 10000;
            System.out.print("10000,");
        } else if(uang >= 5000){
            uang -= 5000;
            System.out.print("5000,");
        }else if(uang >= 2000){
            uang -= 2000;
            System.out.print("2000,");
        }else if(uang >= 1000){
            uang -= 1000;
            System.out.print("1000,");
        } else if(uang >= 500){
            uang -= 500;
            System.out.print("500,");
        }else if(uang >= 200){
            uang -= 200;
            System.out.print("200,");
        } else {
            uang -= 100;
            System.out.print("100,");
        }
        pecahkan(uang);
    }
}
