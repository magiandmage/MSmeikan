package com.example.msmeikan;

import android.app.Application;



public class MSmeikan extends Application {
    
    private String MSname;
    private String Pname;
    private String title;

    public String getMSname() { return MSname; }
    public void setMSName(String MSname) { this.MSname = MSname; }

    public String getPname() { return Pname; }
    public void setPname(String Pname ) { this.Pname = Pname; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }


}
