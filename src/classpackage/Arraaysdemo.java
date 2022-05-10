package classpackage;

public class Arraaysdemo {

    public void Demo(){

        int[] marksArray ={54,54,65,77,33,57,};

        //There is an advanced for loop already created by INTELIJ
     for (int i=0;i<marksArray.length;i++){

         System.out.println("Printing Marks : " +marksArray[i] +"at index "+ i);
     }
     // Advanced loop Syntax: for(DataType var: array){}
        for (int var:marksArray){
            System.out.println("Inside advance for loop" +var);

        }
        String[] studentname ={"raghav","gopal","radhe","jhon"};

        for(String var: studentname){
            System.out.println(var);
        }

        double[] Percentage ={76.5,87.5,98.5,87.9};
            for (double var:Percentage){
                System.out.println(var);
        }
    }


    public static void main(String[] args) {
        Arraaysdemo obj=new Arraaysdemo();
        obj.Demo();
    }

}

