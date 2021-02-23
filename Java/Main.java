/*The main method in the controlling class of a Java application controls the flow of the program.
The main method can also access other classes along with the variables and methods of those classes
and of objects instantiated from those classes.*/

class Main
{ //define the controlling class
  //define main method
  public static void main(String[] args)
  {
    //display text string
    System.out.println("Hello World");

    MyClassName NewClass = new MyClassName(); //instantiation of 'NewClass' object of type 'MyClassName'
    new GUI(); //calling GUI class
    
    //calling methods
    NewClass.Hello(); 
    
    
  }//end main
}//End Hello1 class.  No semicolon at end of Java class.
