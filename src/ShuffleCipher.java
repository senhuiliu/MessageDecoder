/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class ShuffleCipher implements  MessageDecoder {
   
    
    private int n;
   
   
    public ShuffleCipher (int n){
        this.n = n;
    }
   
  
    private String reShuffle(String text){
        String first ="", second="";
        // splits into two halves by taking alternative chars
        for(int i=0;i<text.length();i++)
        {
            if(i%2==0)
                first += text.charAt(i);
            else
                second += text.charAt(i);               
        }   
        // merges the both halves
        return first+second;
    }
   
  
    //decode and returns the cipher text
    public String decode(String cipherText){
        String decodedMsg = cipherText;
        for(int i=0;i<n;i++)
            decodedMsg = reShuffle(decodedMsg);
        return decodedMsg;
    }
} 