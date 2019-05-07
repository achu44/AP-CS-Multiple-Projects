/*player.java
 			 First and last name
			 Age
			 Grade
			 Points scored in last 5 games
			 opinion */
public class player {

   //Instance variables
   private String name1;
   private String name2;
   private int age;
   private int grade;
   private String opinion;
   public int[] score = new int[5];
   
   //Constructor method

   public player(){
   //Initialize a new student's name to the empty string and the test
   //scores to zero.
      name1 = "";
      name2 = "";
      age = 0;
      grade = 0;
      opinion = "unknown";
      for(int x = 0; x < 5; x++)
      	{
      		score[x] = 0;
      	}
   }
    
   //Other methods

   public void setFName (String nm){
   //Set a student's name
      name1 = nm;
   } 
   public String getFName (){
   //Get a student's name
      return name1;
   }
   public void setLName(String nm){
   //Set a student's name
      name2 = nm;
   }    
   public String getLName (){
   //Get a student's name
      return name2;
   }
   public void setAge(int ag){
   	  age = ag;
   }
   public int getAge(){
   	  return age;
   }
   public void setGrade(int grd){
   	  grade = grd;
   }
   public int getGrade(){
   	  return grade;
   }
   public void setOpinion(boolean op){
   		if(op)
   			opinion = "good";
   		else
   		if(!op)
   			opinion = "bad";   	  
   }
   public String getOpinion(){
   	  return opinion;
   }
   public void setScore(int scr, int i){
   	  score[i] = scr;
   }
   public int getScore(int i){
   	  return score[i];
   }
   public double getAvg(){
   	  return (score[0]+score[1]+score[2]+score[3]+score[4]) / 5.0;
   }
   
   public String toString(){
   //Construct and return a string representation of the student
      String str ="";
      str = "Name:   " + name1 + " "+ name2  + "\n" +
            "Age:  " + age + "\n" +
            "Grade:  "+ grade + "\n" +
            "Score 1:  " + score[0] + "\n"+
            "Score 2:  " + score[1] + "\n"+
            "Score 3:  " + score[2] + "\n"+
            "Score 4:  " + score[3] + "\n"+
            "Score 5:  " + score[4] + "\n"+
            "Average in last 5 games:  " + getAvg()+ "\n" +
            "Opinion:  " + opinion + "\n";
      return str;
   }  
}