/*
* write nested for loops to produce the following output, with each line 60 characters wide: 
*
*          |         |         |         |         |         |
* 123456789012345678901234567890123456789012345678901234567890
*/

for (int i = 1; i <= 6; i++) {
    for (int j = 1; j <= 9; j++) {
        System.out.print(" ");
    }
    System.out.print("|");
}

System.out.println();
//This way it just uses more for loops, which fits the spirit of the question
for (int j=0;j<6;j++){ 
    
    for (int i=0;i<9;i++){
        System.out.print(i+1);
    }
    System.out.print("0");
    
}
