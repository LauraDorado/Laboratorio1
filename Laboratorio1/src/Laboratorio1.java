package laboratorio1;
import java.util.Scanner;

    public class Laboratorio1 {

        //scanner:
        static Scanner sc = new Scanner(System.in); 

        //Variables:
        
            //Int variables:
            int majorNumber;            
            int summation1;
            int summation2; 
            int summation3;
            int arrayMajor;
            int operation;
            
            //Double variables:
            static double n1;
            static double n2;
            static double average;
            
            //String variables:              
            static String string1;
            static String string2;
            static String string3;
            
            //Arrays:                                    
            static int [] array1;
            static int [] array2;
            static int [] array3;
            int [] result;
            int[]intersection;
            int[]saved;

            //Constants:                      
            final static int ARRAYSLENGTH = (array1[].length++array2[].length++array3[].length);
        
        //Methods:
            
            //Main
            public static void main (String [] args){

            menu();
            static int option = sc.nextInt();
            System.out.println ("Option: "+option); 
             switch (option){
                    case 1: 
                        enterThreeStrings();
                    break;

                    case 2:
                        desplayTheLength();
                    break;

                    case 3:
                        concatenateStrings();
                    break;	  

                    case 4:
                        showCharacterPosition();
                    break;

                    case 5:
                        enterTwoNumbers();
                    break;

                    case 6:
                        showDivision();
                    break;

                    case 7:
                        showEntireDivision();
                    break;    
                    case 8:
                        enterThreeArrays();
                    break;

                    case 12:
                        operationArrays();
                    break;  

                    case 13:
                        System.out.println("The union of th arrays is: "+Arrays.toString(unionOfArrays()));
                    break;   

                    case 14:
                        System.out.println ("The union of the arrays without the repeated numbers is:"+Array.toString(unionWithoutRepeatedNumbers(int [] union)));
                    break;

                    case 15:
                        System.out.println ("The intersection of the arrays is: "+Array.toString(arrayIntersection(int[]union)));
                    break;    

                    case 16:
                        rotateNPositions();
                    break;

                    case 17:
                        bubbleMethod();
                    break;    
                    }
        }
            //Menu:
            public static void menu(){ 
                System.out.println ("Welcome to the laboratory of units 1 and 2. What would you like to do?");
                System.out.println ("1. Enter 3 character strings");
                System.out.println ("2. Display the string's length");
                System.out.println ("3. Concatenate the three strings");
                System.out.println ("4. Show the three characters of each of the three strings located in a position");
                System.out.println ("5. Enter two positive real numbers");
                System.out.println ("6. Show the division of both numbers");
                System.out.println ("7. Show the division and the remainder of the entire part of both numbers");
                System.out.println ("8. Enter three entire number arrays");
                System.out.println ("9. Display the three array entered");
                System.out.println ("10. Show the average value of the array");
                System.out.println ("11. Show the higher value in the array");
                System.out.println ("12. Generate a array with the indicated operation");
                System.out.println ("13. Generate a array with the union of the arrays");
                System.out.println ("14. Generate a array with the union of the arrays (without repeated numbers)");
                System.out.println ("15. Generate a array with the interception of the arrays");
                System.out.println ("16. Rotate n positions");
                System.out.println ("17. Order from lowest to highest");
                System.out.println ("18. Exit");   
 
           }//Menu ends
            
            //Option 1: Method to enter three strings
            public static void enterThreeStrings(){

                System.out.println ("Enter the first string");
                string1 = sc.nextLine();
                System.out.println ("Enter the second string");
                string2 = sc.nextLine();
                System.out.println ("Enter the third string");
                string3 = sc.nextLine(); 
                
            }//Method 1 ends
            
            //Option 2: Method to desplay the length of the three strings
            public static void desplayTheLength(){

                System.out.println ("The length of the first string is:"+string1.length());
                System.out.println ("The length of the second string is:"+string2.length());
                System.out.println ("The length of the third string is:"+string3.length());  

            }//Method 2 ends
            
            //Option 3: Method to concatenate the three strings
            public static void concatenateStrings(){                
                
                System.out.println (string1 + " " + string2 + " " + string3);
            }//Method 3 ends
            
            //Option 4: Method to show the three characters of each of the three strings located in the position entered previously
            public static void showCharacterPosition(){                
                
                System.out.println ("Enter a position");
                int position = Integer.parseInt(sc.nextLine());

                if (position>string1.length() || position < 1)
                        System.out.println ("Position "+position+" does not exist in the first string"); 
                else
                        System.out.println ("In the first string: " + string1.charAt(position - 1));

                if (position>string2.length() || position < 1)
                        System.out.println ("Position "+position+" does not exist in the second string");
                else
                        System.out.println ("In the second string: " + string2.charAt(position - 1));

                if (position>string3.length() || position < 1)
                        System.out.println ("Position "+position+" does not exist in the third string"); 
                else
                        System.out.println ("In the third string: " + string3.charAt(position - 1));  
                    
            }//Method 4 ends
            
            //Option 5: Methot to enter two real numbers
            public static void enterTwoNumbers(){                          
                
                System.out.println ("Enter a positive real number");                 
                do {
                    System.out.println ("Enter the first number"); 
                    double n1 = sc.nextDouble();
                }while (n1 < 0);

                do{
                    System.out.println ("Enter the second number");  
                    double n2 = sc.nextDouble(); 
                }while (n2 < 0);
                
            }//Method 5 ends 
            
            //Option 6: Method to show the division of the two numbers
            public static void showDivision(){
                
                double division = (n1/n2);
                System.out.println ("The division between the first number and the second number is: "+division);
                

            }//Method 6 ends
            
            //Option 7: Method to show the division of the entire part of the numbers
            public static void showEntireDivision(){
		
               int division = ((int)n1/(int)n2);
               System.out.println ("The division between the first number and the second number is: "+division);
               int residuo =  ((int)n1%(int)n2);
               System.out.println ("The division between the first number and the second number is: "+residuo);
                    
            }//Method 7 ends
            
            //Option 8: Method to enter three arrays of entire numbers
            public static void enterThreeArrays(){

                System.out.println ("Enter the length of the first array");
                int array1Length = sc.nextInt();
                array1 = new int [array1Length]; 
                    for (int i=0;i<(array1.length);i++){
                        System.out.println ("Enter the number "+(i+1)+" of the array1");
                        array1[i]=sc.nextInt();  
                    }                                               
                System.out.println ("Enter the length of the second array");
                int array2Length = sc.nextInt();
                array2 = new int [array2Length];
                    for (int j=0;j<(array2.length);j++){
                        System.out.println ("Enter the number "+(j+1)+" of the array2");
                        array2[j]=sc.nextInt();
                    }                                                
                System.out.println ("Enter the length of the third array");
                int array3Length = sc.nextInt();
                array3 = new int [array3Length];
                    for (int k=0;k<(array3.length);k++){
                        System.out.println ("Enter the number "+(k+1)+" of the array3");
                        array3[k]=sc.nextInt();
                    }                     
            }//Method 8 ends
            
            //Option 9: Method to display the three arrays on the screen
            public static void displayArrays(){
               
                System.out.println ("The first array is: "+Arrays.toString(array1));
                System.out.println ("The second array is: "+Arrays.toString(array2));
                System.out.println ("The third array is: "+Arrays.toString(array3));
                
            }//Method 9 ends
            
            //Option 10: Method to get the average of one of the arrays
            public static void getAverage(int summation1, int summation2, int summation3){              

                do{
                    System.out.println("Which array do you want to know its average?");
                    System.out.println("1.First array");
                    System.out.println("2. Second array");
                    System.out.println("3. Third array");
                    int arrayAverage = sc.nextInt();
                }while(arrayAverage<=0||arrayAverage>3);
                
                if (arrayAverage==1){
                    for (int i=0;i<(array1.length);i++){
                        summation1=(summation1+array1[i]);
                    }     
                        average=((double)summation1/(double)array1.length);
                   }
                    
                    else if (arrayAverage==2){
                    for (int j=0;j<(array2.length);j++){
                        summation2=(summation2+array2[j]);
                    }     
                        average=((double)summation2/(double)array2.length);
                   }
                    
                    else if (arrayAverage==3)
                   {
                    for (int k=0;k<(array3.length);k++){
                        summation3=(summation3+array3[k]);
                    }     
                        average=((double)summation3/(double)array3.length);
                   }
                    
                System.out.println("The average of the array " + arrayAverage + " is: " + average);
            }//Method 10 ends
            
            //Option 11: Method to show the major number of one of the arrays
            public static void showMajorNumber(int majorNumber){
 
                    int position = 0;

                    do{
                        System.out.println("Choose one of the arrays");
                        System.out.println("1. First array");
                        System.out.println("2. Second array");
                        System.out.println("3. Third array");                    
                        int optionMajor = sc.nextInt();
                    }while(optionMajor<=0||optionMajor>3);
                    
                    if (optionMajor==1){                                                  
                        majorNumber = array1[0];
                        for (int i=0;i<array1.length;i++){
                            position = array1[i];
                            if (majorNumber<position)
                                majorNumber = position;
                        }
                    }    
                    else if (optionMajor==2){                                                  
                        majorNumber = array2[0];
                        for (int i=0;i<array2.length;i++){
                            position = array2[i];
                            if (majorNumber<position)
                                majorNumber = position;                                                    
                        } 
                    } 
                    else if (optionMajor==3){                                                  
                        majorNumber = array3[0];
                        for (int i=0;i<array3.length;i++){
                            position = array3[i];
                            if (majorNumber<position)
                                majorNumber = position;                        
                        }                         
                    } 
                    System.out.println(majorNumber);
            }//Method 11 ends
            
            //Option 12: Method to do an operation with two of the arrays
            public static void operationArrays(int arrayMajor, int [] result, int operation){
            
            int selection= 0;                       
            
            do{
                System.out.println ("Choose two arrays");
                System.out.println ("1. First array and second array");
                System.out.println ("2. Second array and third array");
                System.out.println ("3. Third array and first array");            
                selection = sc.nextInt(); 
            }while(selection<=0 || selection>3);
            
            do{
                System.out.println ("Choose the operation");
                System.out.println ("1. Addition");
                System.out.println ("2. Substraction");
                System.out.println ("3. Multiplication");            
                operation = sc.nextInt(); 
            }while(selection<=0 || selection>3);
            
                if(selection==1){    
                    if (array1.length>array2.length)
                            arrayMajor = array1.length;
                        else (arrayMajor = array2.length);

                    //Addition:          
                    if (operation==1){                        
                        for (i=0;i<arrayMajor;i++){
                            if (array1[i]='')
                                array1[i]=0;
                            if (array2[i]='')
                                array2[i]=0;
                            result[i] =(array1[i]+array2[i]) ;
                        }
                    }    
                    //Substraction:
                    else if (operation==2){                                   
                        for (i=0;i<arrayMajor;i++){
                            if (array1[i]='')
                                array1[i]=0;
                            if (array2[i]='')
                                array2[i]=0; 
                            result[i] =(array1[i]-array2[i]);        
                        }                                                
                    }    
                    //Multiplication:
                    else if (operation==3){                        
                        for (i=0;i<arrayMajor;i++){
                            if (array1[i]='')
                                array1[i]=0;
                            if (array2[i]='')
                                array2[i]=0;
                            result[i] =(array1[i]*array2[i]);  
                        }                               
                    }
                }    
                                                             
                if(selection==2){                     
                     if (array2.length>array3.length)
                            arrayMajor = array2.length;
                        else (arrayMajor = array3.length);

                    //Addition:          
                    if (operation==1){                       
                        for (i=0;i<arrayMajor;i++){
                            if (array3[i]='')
                                array3[i]=0;
                            if (array2[i]='')
                                array2[i]=0;
                        result[i] =(array2[i]+array3[i]) ;
                        }
                    }    
                    //Substraction:
                    else if (operation==2){                                  
                        for (i=0;i<arrayMajor;i++){
                        if (array3[i]='')
                                array3[i]=0;
                            if (array2[i]='')
                                array2[i]=0;    
                        result[i] =(array2[i]-array3[i]);
                        }
                    }    
                    //Multiplication:
                    else if (operation==3){                       
                        for (i=0;i<arrayMajor;i++){
                            if (array3[i]='')
                                array3[i]=0;
                            if (array2[i]='')
                                array2[i]=0;
                        result[i] =(array2[i]*array3[i]);         
                        }
                    }                          
                }
                
                if(selection==3){
                    if (array3.length>array1.length)
                            arrayMajor = array3.length;
                        else (arrayMajor = array1.length); 
                 
                    //Addition:        
                    if (operation==1){
                        for (i=0;i<arrayMajor;i++){
                            if (array3[i]='')
                                array3[i]=0;
                            if (array1[i]='')
                                array1[i]=0;
                        result[i] =(array3[i]+array1[i]) ;
                        }
                    }    
                    //Substraction:
                    else if (operation==2){                                   
                        for (i=0;i<arrayMajor;i++){
                            if (array3[i]='')
                                array3[i]=0;
                            if (array1[i]='')
                                array1[i]=0;
                        result[i] =(array3[i]-array1[i]);
                        }
                    }    
                    //Multiplication:
                    else if (operation==3){                        
                        for (i=0;i<arrayMajor;i++){
                            if (array3[i]='')
                                array3[i]=0;
                            if (array1[i]='')
                                array1[i]=0;
                        result[i] =(array1[i]*array2[i]);         
                        }    
                    }                          
                }  
            System.out.println("The results of the operations are: "+Array.toString(result));  
        }//Method 12 ends
            
        //Option 13: Method to do an array with the union of the three arrays
        public static [] int unionOfArrays(){

            int []  union = new int [ARRAYSLENGTH];
            int a =(array1.length+array2.length);

            System.arraycopy(array1, 0, union, 0, array1.length);
            System.arraycopy(array2, 0, union, array1.length, array2.length);
            System.arraycopy(array3, 0, union, a, array3.length);

            return union;
        }//Method 13 ends
        
        //option 14: Method to do an array with the union of the three arrays without the repeated numbers
        public static int [] unionWithoutRepeatedNumbers(int [] union){
            int [] union2;                

            for(int i=0;i<union.length;i++){
                for(int j=0;j<union.length-1;j++){
                    if(i!=j){
                        if(union[i]==union[j])						
                            union[i]="";

                        }
                    }
                }

            for (int k=0;k<=union.length-1;k++){
                if(union[k]!=""){
                    union2[] = (union[k]);
                return union2;                                
                }
            }  
        }//Method 14 ends
        
        //Option 15: Method to do an array with the intersection of the three arrays
        public static []int arrayIntersection(int[]union, int[]intersection){
            
            for(int i=0;i<union.length;i++){
                for(int j=0;j<union.length-1;j++){
                    if(i!=j){
                        if(union[i]!=union[j])						
                            union[i]="";
                    }
                }
            }

            for (int k=0;k<=union.length-1;k++){
                if(union[k]!=""){
                    intersection[] = (union[k]);
                return intersection;   
                }
            }
        }//Method 15 ends
        
        //Option 16: Method to rotate n positions 
        public static void RotateNPositions(int[]saved){

            int n;                                          

            do{
            System.out.println ("Which array do you want to rotate?");
            System.out.println ("1. First array");
            System.out.println ("2. Second array");
            System.out.println ("3. Third array");
            selection = sc.nextInt(); 
            }while (selection<=0||selection>3)
            System.out.println ("How many positions do you want to rotate?");
            n = sc.nextInt();

            if (selection==1){ 
                int[]arrayFinal = new int [array1.length];

                for (int k=0;k<array1.length-n;k++){
                    for (int u=(array1.length-n);u<array1.length;u++)                        
                        saved[k] = array1[u];                       
                  }
                for (int i=(array2.length-n);i>=0;i--) 
                    arrayFinal[i+n] = array1[i]

                for (int j=0;j<=n;j++)
                    arrayFinal[j] = saved[j];               
            }
            else if (selection==2){ 
                int[]arrayFinal = new int [array2.length];

                for (int k=0;k<array2.length-n;k++){
                    for (int u=(array2.length-n);u<array2.length;u++)                        
                        saved[k] = array2[u];                       
                  }
                for (int i=(array2.length-n);i>=0;i--) 
                    arrayFinal[i+n] = array2[i]

                for (int j=0;j<=n;j++)
                    arrayFinal[j] = saved[j];
            }
            else if (selection==3){ 
                int[]arrayFinal = new int [array3.length];

                for (int k=0;k<array3.length-n;k++){
                    for (int u=(array3.length-n);u<array3.length;u++)                        
                        saved[k] = array3[u];                       
                  }
                for (int i=(array3.length-n);i>=0;i--) 
                    arrayFinal[i+n] = array3[i]

                for (int j=0;j<=n;j++)
                    arrayFinal[j] = saved[j];                            
            }
            return arrayFinal;
        }//Method 16 ends
        
        //Option 17: Method to order the values of one of the arrays from lowest to highest
        public static void bubbleMethod(){

            int aux = 0;
            System.out.println ("Which array do you want to ordenate?");
            System.out.println ("1. First array");
            System.out.println ("2. Second array");
            System.out.println ("3. Third array"); 
            selection = sc.nextInt(); 

            if (selection==1){
                for (int i=0;i<array1.length-1;i++){
                    for (int j=0<array1.length-1;i++){
                        if (array1[j]>array1[j+1]){
                            aux = array1[j];
                            array1[j] = array1[j+1];
                            array1[j+1] = aux;
                        }
                    }  
                }
                System.out.println("The numbers of the first array in order are: "+Array.toString(array1));
            }
            if (selection==2){
                for (int i=0;i<array2.length-1;i++){
                    for (int j=0<array2.length-1;i++){
                        if (array2[j]>array2[j+1]){
                            aux = array2[j];
                            array2[j] = array2[j+1];
                            array2[j+1] = aux;
                        }
                    }  
                }
                System.out.println("The numbers of the second array in order are: "+Array.toString(array2));
            }
            if (selection==3){
                for (int i=0;i<array3.length-1;i++){
                    for (int j=0<array3.length-1;i++){
                        if (array3[j]>array3[j+1]){
                            aux = array3[j];
                            array3[j] = array3[j+1];
                            array3[j+1] = aux;
                        }
                    }  
                }
                System.out.println("The numbers of the third array in order are: "+Array.toString(array3));
            }

        }//Method 17 ends
        
    }// Laboratorio1 class ends