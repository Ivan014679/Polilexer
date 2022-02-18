/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polilexer;

/**
 *
 * @author AULA4
 */
public class Token {
    public String name;
    public String content;
    
    public Token(String name, String content){
        this.name = name;
        this.content = content;
    }

    public String toString() {
        return content + ": " + name + "\n";
    }
}
