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
public void Randomizer(Yard yard){
    int height = yard.getHeight();
    int width = yard.getWidth();
    int corner = (int)(Math.random()*4);
    switch(corner){
        case 0: row = 1; column = 1; break;
        case 1: row = 1; column = width; break;
        case 2: row=height; column = 1;
        case 3:row = height; column = width;
    }
    direction = (int)(Math.random()*4);
}
public boolean updateMower(Yard yard){
boolean grassLeftover = false;
for(int i =0; i<yard.getHeight(); i++){
    for (int j=0; j<yard.getWidth(); j++){
        if (yard.getCell(i, j) == '+'){
            grassLeftover = true;
        }
    }
}

if(!grassLeftover) return false;

if(surroundings(yard) == '+'){
    moveForward();
    cut(yard);
    return true;
}
turnLeft();
if(surroundings(yard) == '+'){
    moveForward();
    cut(yard);
    return true;
} 
turnRight();//(2x) because already turned left
turnRight();
if(surroundings(yard) == '+'){
    moveForward();
    cut(yard);
    return true;
}
return grassLeftover;

}}