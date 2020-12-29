import java.io.*;

/* This is an object class named Member that exhibits fields, a constructor w parameters, and getter setter methods 
*/

public class Member {
  
    private char memberType;
    private int memberId;
    private String name;
    private double fees;
  
  //Constructor
  public Member(char pmemberType, int pmemberId, String pName, double pFees){

  //Methods
 public void setMemberType(char pMemberType)
 {
   memberType = pMemberType;
 }
 public char getMemberType()
 {
   return memberType;
 }
 public void setMemberId(int pMemberId)
 {
   memberId = pMemberId;
 }
 public int getMemberId()
 {
   return memberId;
 }
  public void setname(String pName)
 {
   name = pName;
 }
 public String getname()
 {
   return name;
 }
  public void setfees(double pFees)
 {
   fees = pFees;
 }
 public char getfees()
 {
   return fees;
 }
 @Override
 public String toString(){
   return memberType + ", " + memberId + ", " + name + ", " + fees; 
 }
}
  }
