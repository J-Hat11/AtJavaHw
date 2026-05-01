public class PartB {
    public static void main(String[] args) {

        Animal anml1 = new Animal("Snake", 10);
        Animal anml2 = new Animal("Whale", 100000);
        System.out.println("Animal 1: " + anml1);
        System.out.println("Animal 2: " + anml2);

        int result = anml1.compareTo(anml2);
        if (result > 0) {
            System.out.println(anml1.getName() + " weighs more than" + anml2.getName());
        } else if (result < 0) {
            System.out.println(anml1.getName() + " weighs less than " + anml2.getName());
        } else {
            System.out.println(anml1.getName() + " and " + anml2.getName() + " weigh the same");
        }
    }

    }

