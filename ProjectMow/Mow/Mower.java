package Mow;
//colsulted classmates and the internet for help 
public class Mower {
    private int row; 
    private int column;
    private int direction;

    public Mower(int row, int column, int direction){
        this.row=row;
        this.column=column;
        this.direction = direction;
    }

    public int getRow(){
return row;
    }

    public void SetRow(int row){
this.row = row;
    }
     public int getColumn(){
return column;
    }

     public void setColumn(int column){
this.column = column;
    }
     public int getDirection(){
return direction;
    }
    public void setDirection(int direction){
this.direction=direction;
    }
public void moveForward(){
    switch(direction){
    case 0: row--; break;
    case 1: column++; break;
    case 2: row++; break;
    case 3: column--; break;
}
}
//looked to internet for help on this part regarding the %4 part
public void turnLeft(){
    direction = (direction+3)%4;//counterclockwise
}
public void turnRight(){
    direction = (direction+1)%4;//clockwise
}

public char surroundings(Yard yard){
    int r = row, c = column;
    switch(direction){
        case 0: r--; break;
        case 1: c++; break;
        case 2: r++; break; 
        case 3: c--; break;
    }
    return yard.getCell(r, c);
}
public void cut(Yard yard){
    yard.cut(row, column);
}


}
