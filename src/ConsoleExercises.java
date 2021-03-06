import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //Entering a positive integer
        int userInput;
        Scanner ip = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        userInput = ip.nextInt();

        System.out.println("You entered " + userInput);

        //Entering any 3 words
        String first, second, third;
        Scanner wordIp = new Scanner(System.in);

        System.out.print("Please enter any 3 words - ");
        first = wordIp.next();
        second = wordIp.next();
        third = wordIp.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        //Entering a sentence
        String sentence;
        Scanner sentenceIp = new Scanner(System.in);

        System.out.println("Please enter a sentence - any sentence! -");
        sentence = sentenceIp.nextLine();

        System.out.println("Your sentence was.... " + sentence);

        //Calculating the area, perimeter & volume of the Codeup Classroom
        double width,
                length,
                area,
                height,
                volume,
                perimeter;

        Scanner areaIp = new Scanner(System.in);

        System.out.println("Please enter the width of the Codeup classroom: ");
        width = areaIp.nextDouble();

        System.out.println("Now enter the length of the classroom: ");
        length = areaIp.nextDouble();

        System.out.println("Now enter the height of the classroom: ");
        height = areaIp.nextDouble();

        area = length * width;
        perimeter = (2 * length) + (2 * width);
        volume = length * width * height;

        System.out.println("The perimeter for the Codeup classroom is: " + perimeter);
        System.out.println("The area for the Codeup classroom is: " + area);
        System.out.println("The volume for the Codeup classroom is: " + volume);

    }
}
