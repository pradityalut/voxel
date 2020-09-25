package voxel;

/**
 *
 * @author A S U S
 */
public class case2 {
    public static void main(String args[]){
        siswa s1 = new siswa("rudi",8,7,6,9);
        siswa s2 = new siswa("ani",5,8,9,6);
        int countS1 = 0, countS2 = 0, same = 0;
        for(int i=0; i<s1.getDataNilai().length; i++){
            if(s1.getDataNilai()[i] > s2.getDataNilai()[i]){
                countS1++;
            }else if(s1.getDataNilai()[i] < s2.getDataNilai()[i]){
                countS2++;
            }else{
                same++;
            }
        }
        System.out.println("Skor Rudi : "+countS1);
        System.out.println("Skor Ani : "+countS2);
        System.out.println("Imbang : "+same);
    }
}
    class siswa{
        private String nama;
        private int nilSejarah, nilMat,nilSos,nilKwn;

        public siswa(String nama, int nilSejarah, int nilMat, int nilSos, int nilKwn) {
            this.nama = nama;
            this.nilSejarah = nilSejarah;
            this.nilMat = nilMat;
            this.nilSos = nilSos;
            this.nilKwn = nilKwn;
        }
        public int[] getDataNilai(){
            int [] data = {this.nilSejarah, this.nilMat,this.nilSos,this.nilKwn};
            return data;
        }
    }
