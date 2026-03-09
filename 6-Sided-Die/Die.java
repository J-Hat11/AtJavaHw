public class Die {

    //used internet for help with classes ex public void or public int etc.
    //Also used AI to help debug code as it was not previously working
    private int value;
    private static final int MAX = 6;
    private static final int MIN = 1;
    
    public Die () {
        value =1;
    }

    public Die(int initialVal){
        if(initialVal>=MIN && initialVal<=MAX){
            value = initialVal;
        } else {
            value =1;
        }

    }
    public void roll(){
        value = (int)(Math.random()*MAX)+MIN;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        if(value>=MIN && value<=MAX){
            this.value = value;
        }
    }
    public String toString(){
        return Integer.toString(value);
    }
    public String getASCIIArt(){
        switch(value){
            case 1: 
            return "+--------+\n" +
                   "+        +\n" +
                   "+    0   +\n" +
                   "+        +\n" +
                   "+--------+\n";
        case 2: 
            return "+--------+\n" +
                   "+0       +\n" +
                   "+        +\n" +
                   "+       0+\n" +
                   "+--------+\n";
    case 3: 
            return "+--------+\n" +
                   "+  0     +\n" +
                   "+    0   +\n" +
                   "+       0+\n" +
                   "+--------+\n";
case 4: 
            return "+--------+\n" +
                   "+  0   0 +\n" +
                   "+        +\n" +
                   "+  0   0 +\n" +
                   "+--------+\n";
 case 5:
            return "+--------+\n" +
                   "+  0   0 +\n" +
                   "+    0   +\n" +
                   "+  0   0 +\n" +
                   "+--------+\n";
case 6: 
            return "+--------+\n" +
                   "+  0   0 +\n" +
                   "+  0   0 +\n" +
                   "+  0   0 +\n" +
                   "+--------+\n";
            default:
                return "Invalid input";
        }
    }
}
