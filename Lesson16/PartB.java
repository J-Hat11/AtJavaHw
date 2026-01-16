public class PartB {
    public static void main(String[] args) {
        double avg1 = average(10,9,8);
        System.out.println("Average of Scores are: "+ avg1);
        
        double[] scores = {100, 90, 80, 100, 80};
        double avg2 = average(scores);
        System.out.println("Average of Scores are: "+ avg2);

    }
    public static double average(double ... values){
        if(values.length==0){
            return 0;
        }
        double sum=0;
        for (double v:values){//got help with these lines
            sum+=v;//
        }
        return sum/values.length;




    }

}

