/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author karanrajmokan
 */


class User{
    private String username;
    private String password;
    
    User(String uname, String pass)
    {
        this.username = uname;
        this.password = pass;
    }
}

class NormalUser extends User{
    
    NormalUser(String n, String p)
    {
        super(n,p);
    }
    
}

class Creator extends User{
    
    Creator(String n, String p)
    {
        super(n,p);
    }
    
}

public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
