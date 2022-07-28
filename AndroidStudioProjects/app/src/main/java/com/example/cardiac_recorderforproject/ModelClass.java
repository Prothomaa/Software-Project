package com.example.cardiac_recorderforproject;

public class ModelClass {

    private String name ;
    private String time ;
    private String comment ;
    private String line;
    /*private String systolic;
    private String diastolic;
    private String heart;*/

    ModelClass(String name,String time ,String comment,String line/*,String systolic ,String diastolic ,String heart*/){
        this.name=name ;
        this.time=time;
        this.comment=comment;
        this.line=line;
       /* this.systolic=systolic;
        this.diastolic=diastolic;
        this.heart=heart;*/
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getComment() {
        return comment;
    }

    public String getLine() {
        return line;
    }

  /*  public String getSystolic() {
        return systolic;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public String getHeart() {
        return heart;
    }*/

}
