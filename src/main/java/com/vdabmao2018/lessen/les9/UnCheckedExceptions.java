package com.vdabmao2018.lessen.les9;

public class UnCheckedExceptions {

    /*TODO: reasons for exceptions: 1: Error handling
      Todo:                         2: Things that shouldn't happen
      Todo:                         3: (Wildly) exceptional circumstances

      not for NORMAL control flow



        // null pointer exception: you're trying to do something with a null value. that's obviously fucking retarded
       //don't divide by zero either you bloody moron
      //if you make a function call itself you should be taken into a mental hospital. seriously.
                    //  actually there are reasons to do that, just make sure it stops, like breaking a loop, by making a return statement based on the index or smth   we call this a recursive function
    //                          //calling too many functions in eachother will result in a STACK(lookup)OVERFLOW ERROR
   // inputMismatchException: when program receives unexpected input, like a string instead of an int. DEUH
  //filenotfoundException

     */

    public static void main(String[] args) {
        int i = 5, j = 0;

          try {
              System.out.println(i / j);
          }catch (ArithmeticException a){
              a.printStackTrace();    
              System.out.println(a.getMessage());

          }


        String s = null;
        try {
            System.out.println(s.toUpperCase());
        }catch (NullPointerException | ArithmeticException a ){
            //je noemt de specifieke exception die kan gebeuren of de superclasse in andere gevallen waar je goed over nagedacht hebt
            //je geeft de exception een variable naam(in dit geval "r"
            //op die manier kun je functies uitvoeren van de exception classes. bvb: r.getmessage()

            //catch multiple errors/exceptions with |
            System.out.println("string is empty");
        }finally {
            //finally wordt ALTIJD uitgevoerd, zelfs als er bvb een return statement staat
        }

   }
}