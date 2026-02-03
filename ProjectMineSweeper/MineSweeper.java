//Used the internet as well as AI to help with debugging, syntax and formatiing
//error when bomb is hit it says you win

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

static final int mines =10;
static final int SIZE =9;

public static void main(String[] args) {
     
// arrays for map and board
char [][] map = new char[SIZE][SIZE];
char [][] board = new char[SIZE][SIZE];
Scanner scanner = new Scanner(System.in);


//map and board
for(int i = 0; i<SIZE; i++){
    for (int j = 0; j<SIZE; j++){
        map[i][j] = ' ';
        board[i][j] = '#';
    }
}

Placemines(map);
numberfill(map);


boolean gameOver = false;

while (!gameOver) {
    clearscreen();
    printBoard(board);
System.out.println("Enter r to reveal a tile(row), f to flag/unflag a tile(column), or 'q' to quit");
String input = scanner.next();
if (input.equals("q")) {
    System.out.println("Error... Ending Game");
    break;
} else if (input.equals("z")){
    Cheats(map, scanner);
    continue;
}
int row = scanner.nextInt() -1;
int column = scanner.nextInt() -1;

if (row<0 || row>=SIZE || column<0 || column>=SIZE) {
    System.out.println("Error... invalid");
    continue;
}

if(input.equals("r")){
    if (board[row][column]=='f'){
        System.out.println("You must Unflag tile");
        continue;
    }
        if (map[row][column]=='b') {
            board[row][column] = 'm';
            revealBoard(board, map);
            printBoard(board);
            System.out.println("Mine hit...Game over");
            gameOver = true;
        } else {
        board[row][column] = map[row][column];
    } if(checkwin(board,map)){
        printBoard(board);
        System.out.println("You Win");
        gameOver = true;

    } 
}else if(input.equals("f")){
        if (board[row][column] == '#'){
            board[row][column] = 'f';
        } else if(board[row][column]=='f'){
            board[row][column] ='#';
        } else {
            System.out.println("Tile already revealed.");
        }
    }
}
}
//cheat function 
public static void Cheats(char[][] map, Scanner scanner) {
    clearscreen();
    System.out.println("Revealing Map");
    printBoard(map);
}


//clear screen function 
public static void clearscreen() {
     System.out.print("\033[H\033[2J");
       System.out.flush();
}




//function to check win
public static boolean checkwin(char[][] board, char[][] map) {
    for (int r=0; r<SIZE; r++){
        for (int c=0; c<SIZE; c++){
            if(map[r][c]!= 'b' && board[r][c]=='#'){
                return false;
            }
        }
    }
    return true;
}

//function to print board
 public static void printBoard(char[][] board){
    System.out.print("   ");
    for(int c =0; c<SIZE; c++){
        System.out.print((c +1)+ "  ");
    }
        System.out.println();
        
    for(int r =0; r<SIZE; r++){
        System.out.print((r + 1) + " ");
        System.out.println();
        if(r+1 < 10) System.out.print(" "); 
        for(int c = 0; c < SIZE; c++){
            System.out.print("[" + board[r][c] + "]");
        }
        System.out.println();

    }
    System.out.println();

}


//function for random mines
    public static void Placemines(char[][] map){
Random rand = new Random(); 
int minesPlaced =0;
while(minesPlaced<mines){
    int x = rand.nextInt(SIZE);
    int y = rand.nextInt(SIZE);

    if (map[x][y]!= 'b'){
        map[x][y] = 'b';
        minesPlaced++;
    }
}
}

 //function to reveal board
public static void revealBoard(char[][] board, char[][] map){ //used ai to help pass board as a parameter.
for(int r =0; r<SIZE; r++){
    for(int c =0; c<SIZE; c++){
        board[r][c] = map [r][c];
    }
}
}

//function for filling numbers (non mine tiles)
 public static void numberfill(char[][] map){
    int[]RowChange ={-1,-1,-1,0,0,1,1,1};
    int[]ColmChange ={-1,0,1,-1,0,-1,0,1};

    for(int r =0; r<SIZE; r++){
        for(int c=0; c<SIZE; c++){
            if (map[r][c]!='b') {
                int count =0; 
                for(int i =0; i<8; i++){
                    int newrows= r + RowChange[i];
                    int newcolumn= c + ColmChange[i];
                    
                    if (newrows>=0 && newrows<SIZE && newcolumn>=0 && newcolumn<SIZE) {
                        if(map[newrows][newcolumn]=='b'){
                            count++;
                        }
                    }
                }
                if (count>0){
                    map[r][c]=(char)(count+'0');
                } else{
                    map[r][c] = ' ';
                }
            }
        }
    }





}
}










  






