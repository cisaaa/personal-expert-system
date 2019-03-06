
package finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FinalProject {

   
    public static void main(String[] args) throws IOException {
        
        System.out.println("Ask me about myself\n");
        
        for(;;){
        String name="Cielo Saavedra";
        String age="20";
        String birthday="April 21, 1998";
        String add="Banga, South Cotabato";
        String nationality="Filipino";
        String number="09099267428";
        String email="cielosaavedra21@gmail.com";
        String status="Single";
        String papi="Danilo Saavedra";
        String mami="Cecile Saavedra";
        String mamiMaiden="Cecile Moscoso Tandog";
        String brother="Two";
        String sister="One";
        String siblings="Ian Dave Saavedra \nChester Dan Saavedra \nLucille Joy Saavedra";
        String sport="Badmiton";
        String color="Rust";
        String animal="Dog";
        String favNum="21";
        String petName="Tachi";
        String food="Noodles";
        String place="Beach";
        String eyeColor="Brown";
        String course="Computer Science";
        
        //  QUESTIONS
        String[] nameq={"your name","who are you","who you","you are"};
        String[] ageq={"your age","age","how old","old"};
        String[] birthdayq={"birthday", "birth","date of birth"};
        String[] addq={"where live","live","address","birthplace"};
        String[] nationalityq={"nationality"};
        String[] numberq={"contact number","number", "phone number","cellphone number","mobile number"};
        String[] emailq={"email address","email"};
        String[] statusq={"status"};
        String[] papiq={"father","father's name"};
        String[] mamiq={"mother","mother's name"};
        String[] mamiMaidenq={"maiden name"};
        String[] brotherq={"number of brother","brother","brothers"};
        String[] sisterq={"number of sister","sisters","sister"};
        String[] siblingsq={"siblings"};
        String[] sportq={"sport","favorite sport"};
        String[] colorq={"favorite color"};
        String[] animalq={"favorite animal","animal"};
        String[] favNumq={"favorite number"};
        String[] petNameq={"pet name"};
        String[] foodq={"comfort food","food"};
        String[] placeq={"favorite place"};
        String[] eyeColorq={"eyecolor","eye color"};
        String[] courseq={"course"};
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String user;
        
            
        
        user=br.readLine();
        
       
            if(stringContainsItemFromList(user,nameq)==true){
                System.out.println(name);
            }
            if(stringContainsItemFromList(user,ageq)==true){
                System.out.println(age);
            }
            if(stringContainsItemFromList(user,addq)==true){
                System.out.println(add);
            }
            if(stringContainsItemFromList(user,birthdayq)==true){
                System.out.println(birthday);
            }
            if(stringContainsItemFromList(user,nationalityq)==true){
                System.out.println(nationality);
            }
            if(stringContainsItemFromList(user,numberq)==true){
                System.out.println(number);
            }
            if(stringContainsItemFromList(user,emailq)==true){
                System.out.println(email);
            }
            if(stringContainsItemFromList(user,statusq)==true){
                System.out.println(status);
            }
            if(stringContainsItemFromList(user,papiq)==true){
                System.out.println(papi);
            }
            if(stringContainsItemFromList(user,mamiq)==true){
                System.out.println(mami);
            }
            if(stringContainsItemFromList(user,mamiMaidenq)==true){
                System.out.println(mamiMaiden);
            }
            if(stringContainsItemFromList(user,brotherq)==true){
                System.out.println(brother);
            }
            if(stringContainsItemFromList(user,sisterq)==true){
                System.out.println(sister);
            }
            if(stringContainsItemFromList(user,siblingsq)==true){
                System.out.println(siblings);
            }
            if(stringContainsItemFromList(user,sportq)==true){
                System.out.println(sport);
            }
            if(stringContainsItemFromList(user,colorq)==true){
                System.out.println(color);
            }
            if(stringContainsItemFromList(user,animalq)==true){
                System.out.println(animal);
            }
            if(stringContainsItemFromList(user,favNumq)==true){
                System.out.println(favNum);
            }
            if(stringContainsItemFromList(user,petNameq)==true){
                System.out.println(petName);
            }
            if(stringContainsItemFromList(user,foodq)==true){
                System.out.println(food);
            }
            if(stringContainsItemFromList(user,placeq)==true){
                System.out.println(place);
            }
            if(stringContainsItemFromList(user,eyeColorq)==true){
                System.out.println(eyeColor);
            }
            if(stringContainsItemFromList(user,courseq)==true){
                System.out.println(course);
            }
        }
        
    }
    public static boolean stringContainsItemFromList(String inputStr, String[] items) {
    return Arrays.stream(items).parallel().anyMatch(inputStr::contains);
}
    
}
