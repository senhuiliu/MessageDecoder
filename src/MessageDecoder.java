/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public interface MessageDecoder {
    // decode and returns the given cipher text
    public abstract String decode(String cipherText);

}
