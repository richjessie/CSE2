      for(int b = 1; b<=mynumber; b++ ){ //outer big loop
             for(int c=0;c<b;c++){// 2nd outer loop
              for(int space= mynumber-b; space>0; space--){ // math to find the number of spaces
                  System.out.print(' ');
              }
              for( int row=(2*b)-1; row>0;row--){
                  System.out.print(b); 
              }
             System.out.println();
              } 
              for(int space2= mynumber-b; space2>0; space2--){
                  System.out.print(' ');
              }
              for( int ndash=(2*b)-1; ndash>0;ndash--){
                  System.out.print("-"); 
              }
               System.out.println();
     //  } //end of out big loop
     
     
     
int a = 1;
   do 
    { //outer big loop
     int b = 0;
        do { // second outer big loop
        int spaces= mynumber-a;
            do { // start of space loop
                System.out.print(' ');
                spaces--;
            }while( spaces>0); //end of space loop
            int row = (2*a)-1;
            do { // start of row loop
              System.out.print(a);
              row--;
            }while (row >0); // end of row loop
            
          System.out.println();
          b++;
            
        }while( b<a); // end of second outer big loop
        int space1 =mynumber-a;
        do {
            System.out.print(' ');
            space1--;
        }while( space1>0);
        int numdash= (2*a)-1;
        do {
            System.out.print("-"); 
            numdash--;
        }while( numdash>0);
    
      System.out.println();
        a++;
    } while( a<=mynumber); // end of big outer loop

 System.out.print("That was an example of a do-while Loop");