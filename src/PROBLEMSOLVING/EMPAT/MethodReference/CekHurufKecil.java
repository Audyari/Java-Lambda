package PROBLEMSOLVING.EMPAT.MethodReference;

public class  CekHurufKecil {
    public static boolean cekhuruf(String datanya){
        for(var data:datanya.toCharArray()){
            if(!Character.isLowerCase(data)){
                return false;
            }
        }
        return true;
    }
}
