import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner scanner =new Scanner(System.in) ;
     System.out.println("Podaj województwo: ");
     System.out.println(city(scanner.nextLine()));
    
     scanner.close();
    }
    static String city( String user ) 
    {
    boolean odp = false;
     String[][] dane = {
     {"Slask", "Katowice"},
     {"Wielkopolska", "Poznan"},
     {"Malopolska", "Krakow"},
     {"Mazowieckie", "Warszawa"},
     {"Lodzkie", "Lodz"}
     };
int a =0;
while(a <dane.length){
    if(user.equals(dane[a][0])) {
    odp =true;
    break;
         }
         a++;
        }
  if (odp){
      System.out.println("Stolica podanego województwa to: "+dane[a][1]);
  }
  else 
  System.out.println("żle napisane województwo lub brak podanego województwa w bazie danych");
  
  return user;
    }
    
    

    }  

