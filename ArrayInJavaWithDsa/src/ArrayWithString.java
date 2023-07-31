import java.util.Scanner;

public class ArrayWithString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String / Name : ");
        String name= sc.next();
        System.out.println("Enter Character you are looking for : ");
        char target = sc.next().charAt(0);
        System.out.println(searchLiner(name, target));
        System.out.println(searchLiner2(name, target));

    }

    static public boolean searchLiner(String name,char target){
      if(name.length()==0){
          return false;
      }
      for(int i=0;i<name.length();i++){
          if(target==name.charAt(i)){
              return true;
          }
      }
      return false;
    }
    static public boolean searchLiner2(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (char ch : name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}
