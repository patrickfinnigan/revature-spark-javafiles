package com.revature.model;

public class ActionFigure extends Doll{
	String skill;
	
	public ActionFigure() {
	    this.eyeColor = "blue";
	    this.name = "Barry Allan";
	    this.skill = "speed";
	  }

	  public ActionFigure(String name, String eyeColor, String skill){
	    this.name = name;
	    this.eyeColor = eyeColor;
	    this.skill = skill;
	  }

	  //getters and setters
	  public String getSkill(){
	     return this.skill;
	  }

	  public void setSkill(String skill){
	     this.skill = skill;
	  }

	  //other methods
	  public void makeTalk(){
	     System.out.println("Hi everyone! I AM-A action figure");
	  }
	  
	  public void useSkill() {
		  System.out.print("I'm using my " + this.skill + " skill!");
	  }
}
