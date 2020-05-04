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

import java.util.ArrayList;


class Admin{
    
    private int id;
    private String name;
    
    Admin(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    
}



class User{
    private final String username;
    private final String password;
    
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
    
    private ArrayList<Channel> channels = new ArrayList<Channel>();
    
    Creator(String n, String p)
    {
        super(n,p);
    }
    
}


class Channel{

    private final String ChannelName;
    private final int SubsCount;
    ArrayList<Video> videos = new ArrayList<Video>();
    
    Channel(String name,int count){
        this.ChannelName = name;
        this.SubsCount = count;
    }
    
}


class Add{
    
    private final String name;
    private final int length;
    private final int payPerClick;
    private int noofClicks,revenue;
    
    Add(String n, int l, int p)
    {
        this.name = n;
        this.length = l;
        this.payPerClick = p;
        this.noofClicks = 0;
        this.revenue = 0;
    }
    
    public void clicks()
    {
        this.noofClicks+=1;
    }
 
    public int getRevenue()
    {
        this.revenue = this.payPerClick*this.noofClicks;
        return this.revenue;
    }
    
}


class SkippableAdd extends Add{
    
    
    SkippableAdd(String n, int l, int p)
    {
        super(n,l,p);
    }
    
}

class NonSkippableAdd extends Add{
    
    NonSkippableAdd(String n, int l, int p)
    {
        super(n,l,p);
    }
}

class Card extends Add{
    
    Card(String n, int l, int p)
    {
        super(n,l,p);
    }
}

class Banner extends Add{

    Banner(String n,int l,int p)
    {
        super(n,l,p);
    }
}


class Video{
    
    private final String videoname;
    private final String desc;
    private final String comments;
    private int likes;
    private int dislikes;
    private ArrayList<Add> adds = new ArrayList<Add>();
    
    Video(String vn, String d, String c){
        this.videoname = vn;
        this.desc = d;
        this.comments = c;
    }
    
    public int getLikes()
    {
        return this.likes;
    }
    
    public int getDislikes()
    {
        return this.dislikes;
    }
}


class Feedback{
    
    private int likes;
    private String comments;
    private ArrayList<Creator> creators = new ArrayList<Creator>();
    
    Feedback(Creator c)
    {
        this.creators.add(c);
    }
    
    void getFeebackInfo()
    {
        
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
