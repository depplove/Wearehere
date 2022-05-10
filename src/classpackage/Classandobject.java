package classpackage;

public class Classandobject {

    // TODO MEMBER VARIABLES PROPERTIES
        String name="Bango";
        int  pages=56;
        String writename="Dr prabhu";

        /*todo Member Function or method -- Capabilities
        // Syntax:- Access_specifier, return_type,function name(Parameter/Arguments){}
        //access_specifier --> pubic, private, protected,default
        //return_type--> output of any function, we use void when function not determine any output
        //function name--> we can use any function name but it should be meaning full
        //parameter--> to input
         */

    public void readbook(int b,String Here){
        System.out.println("THis is read book function "+ b + Here);}

   public void writeBook(int a, double b, String c){
        System.out.println("This is write book function" +a+ b+ c);
    }

    public static void main(String[] args) {
        //TODO object are instance of class
        //TODO Step 1 you have to creat object Syntax : classname objectname ==new classname();`
        //TODO Step 2  Use call method ..Calling function-> object.functionname();

 Classandobject object= new Classandobject();
   object.readbook(45,"Here");
   object.writeBook(56,99.0,"Google");
   object.name();
   object.pages();





    }

    public void  pages() {
        System.out.println("There is total "+pages+" page ");
    }

    public void name() {
        System.out.println("The book name is Bango");
    }

}
