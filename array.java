public class array {
    public static void main (String[] args){
        int [][] flats = new int [2][3];
        flats[0][1]= 100;
        flats[0][2]= 102;
        flats[1][0]= 102;
        flats[1][1]= 104;
        flats[1][2]= 105;
        flats[0][0]= 106;
    System.out.print("lenth of array is");
    for (int i=0; i<flats.length; i++){
        for (int j=0; j<flats[i].length; j++){
        System.out.print(flats[i][j]);
        System.out.print("");
    }
    
    }
    }
    }

