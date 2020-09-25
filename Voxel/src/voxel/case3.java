package voxel;

/**
 *
 * @author A S U S
 */
public class case3 {
    public static void main(String [] args){
        String [] kasus ={"kodok", "kakak", "adek"};
        for(String x : kasus){
            System.out.print("Status dari " +x+" : ");
            if(cek(x)){
                System.out.println("Benar");
            } else{
                System.out.println("Salah");
            }
            System.out.println("");
        }
    }
    
    public static boolean cek(String kasus){
        boolean status = false;
        StringBuffer kata = new StringBuffer(kasus);
        if(kata.reverse().toString().equalsIgnoreCase(kasus)){
            status = true;
        } else{
            status = false;
        }
        return status;
    }
}
