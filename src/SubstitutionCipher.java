/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class SubstitutionCipher implements  MessageDecoder {
   
    // value to shift the chacacters
    private int shiftBy;   
   
    //1-argument constructor
    public SubstitutionCipher (int shiftBy){
        this.shiftBy = shiftBy;
    }
   
    // helper method to shift the given character by given shift value
    private char shift(char ch, int shiftValue){
        char shiftedChar = ch;       
        // if the char is in lower case
        if(ch >= 'a' && ch <= 'z')
            shiftedChar = (char) ( 'a' + ( ch - 'a' + shiftValue ) %26 );
        // upper case char
        else if(ch >= 'A' && ch <= 'Z')
            shiftedChar = (char) ( 'A' + ( ch - 'A' + shiftValue ) %26 );
        return shiftedChar;
    } 
    public String decode(String cipherText){
        String decodedMsg = "";
        for( int i = 0; i < cipherText.length(); i++){
            char ch = cipherText.charAt(i);
            decodedMsg += shift(ch, -shiftBy);
        }
        return decodedMsg;
    }
} // SubstitutionCipher
