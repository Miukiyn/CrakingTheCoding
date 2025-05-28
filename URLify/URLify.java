/**
* Author: Iago Adrien - Miukiyn
* Version: 1.0
*/
package URLify; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URLify{
  
  /**
  *
  * @param 
  */
  public static void main(String[] agr){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    try{
      String in = reader.readLine();
      System.out.println(urlString(in, in.length()));
      
    }catch(IOException e){
      System.out.println("Erro: " + e);
    } 
  }

  /**
  * Converts the given string into a URL-friendly format by replacing spaces with "%20".
  *
  * @param str    The original string to be modified.
  * @param length The true length of the string to consider for the transformation.
  * @return       A character array representing the URLified version of the string.
  */
  public static String urlString(String str, int length){
      int spaceCounter = 0;
      int index = 0;
      char c;
      for(int i = 0; i < length; i++){
        if(str.charAt(i) == ' '){
          spaceCounter++;
        }
      }
      char[] charString = new char[length + (spaceCounter * 3)];

      for(int i = 0; i < length; i++){
        c = str.charAt(i);
        if(c == ' '){
          charString[index] = '%';
          charString[index+1] = '2';
          charString[index+2] = '0';
          index+=3;
        }else{
          charString[index] = c;
          index++;
        }
      }
      return new StringBuilder().append(charString).toString();
    }

  
}
