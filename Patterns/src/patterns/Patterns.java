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
    
    private Channel[] channels;
    
    Creator(String n, String p)
    {
        super(n,p);
    }
    
}


class Channel{

    private String ChannelName;
    private int SubsCount;
    private Video[] videos;
    
    Channel(String name,int count){
        this.ChannelName = name;
        this.SubsCount = count;
    }
    
}


class Video{
    
    private String videoname;
    private String desc;
    private String comments;
    
    Video(String vn, String d, String c){
        this.videoname = vn;
        this.desc = d;
        this.comments = c;
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
