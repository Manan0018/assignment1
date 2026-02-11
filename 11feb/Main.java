interface Comparator<T>{
    int compare(T a,T b);
    
}
class integercompare implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return a-b;
        
    }
}
class stringComapre implements Comparator<String>{
    public int compare(String a, String b){
        int len=Math.min(a.length(),b.length());// to check index out of bound error;
        int i;
        for(i=0;i<len;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
            
            
        }
        return a.length()-b.length();
    }
}
public class Main{
    public static void main(String [] args){
        Comparator<Integer> intCmp=new integercompare();
         System.out.println(intCmp.compare(10,20));
        Comparator<String>strcmp=new stringComapre();
        System.out.println(strcmp.compare("Abc","Abc"));}
    
}