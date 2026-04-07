//reffered to classmates for help
package Mow;

public class Yard {
    public char [][] yard; 
    public Yard(int height, int width){ //looked up had to be capital Yard for constructor issue why is wasn't working 
        int rows = height +2;
        int columns = width +2;
        yard = new char[rows][columns];
        for(int i =0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(i==0 || i==rows-1 || j==0 || j== columns-1){
                    yard[i][j] = 'R';
                } else {
                    yard[i][j] = '+';
                }
            }
        }
    }
    

public int getHeight(){
    return yard.length-2;
}
public int getWidth(){
    return yard[0].length-2;
}

public char getCell(int rows, int columns){
    return yard[rows][columns];
}

public void setCell(int rows, int columns, char value){
     yard[rows][columns] = value;
}


public void cut(int row, int column) {
    if (yard[row][column]== '+') {
        yard[row][column] =' ';
    }
}

public void printYard(Mower mower){
    for (int i =0; i<yard.length; i++){
        for(int j=0; j<yard[i].length; j++){
            if(mower !=null && i == mower.getRow()&& j ==mower.getColumn()){
                switch (mower.getDirection()) {
                case 0: System.out.print('^'); break;
                case 1: System.out.print('>'); break;
                case 2: System.out.print('v'); break;
                case 3: System.out.print('<'); break;
            }
    } else { System.out.print (yard[i][j]);}
        }
        System.out.println();
}

}


}

