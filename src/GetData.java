public class GetData {
    public static void main(String[] args) {
        if (args.length != 0 && args[0] != null) {
            int input = 0;
            try {
                input = Integer.parseInt(args[0]);
                if (input > 0 && input < 250){
                    System.out.println("Correct ID");
                } else {
                    System.out.println("Invalid ID");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid ID");
            }
        } else {
            System.out.println("Invalid Input ");
        }
    }
}
