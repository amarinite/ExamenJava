package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        System.out.println(message);

        byte b = ' ';
        boolean success = false;
        while(!success) {
            try {
                b = scanner.nextByte();
                success = true;
            } catch(InputMismatchException e) {
                System.out.println("Number must be an integer between -128 and 127");
                scanner.next();
            }
        }
        return b;
    };

    public static int readInt(String message) {
        System.out.println(message);

        int i = 0;
        boolean success = false;
        while (!success) {
            try {
                i = scanner.nextInt();
                success = true;
            } catch(InputMismatchException e) {
                System.out.println("Number must be an integer");
                scanner.next();
            }
        }
        return i;
    };

    public static float readFloat(String message) {
        System.out.println(message);

        float f = 0f;
        boolean success = false;
        while (!success) {
            try {
                f = scanner.nextFloat();
                success = true;
            } catch(InputMismatchException e) {
                System.out.println("Input must be a number");
                scanner.next();
            }
        }
        return f;
    };

    public static double readDouble(String message) {
        System.out.println(message);

        double d = 0d;
        boolean success = false;
        while(!success) {
            try {
                d = scanner.nextDouble();
                success = true;
            } catch(InputMismatchException e) {
                System.out.println("Input must be a number");
                scanner.next();
            }
        }
        return d;
    };

    public static char readChar(String message) {
        System.out.println(message);

        char c = ' ';
        String input;
        boolean success = false;
        while(!success) {
            try {
                input = scanner.next();
                if(input.length() == 1 && !Character.isDigit(input.charAt(0))) {
                    c = input.charAt(0);
                } else {
                    throw new Exception("Input must be a single character and not a number");
                }
                success = true;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return c;
    }

    public static String readString(String message) {
        System.out.println(message);

        String s = "";
        boolean stringFlag = false;
        int i = 0;
        boolean success = false;

        while(!success) {
            try {
                s = scanner.next();
                while(i < s.length() && !stringFlag) {
                    if(Character.isLetter(s.charAt(i))) {
                        stringFlag = true;
                    }
                    i++;
                }
                if(!stringFlag) {
                    throw new Exception("Input must be a string and not a number");
                }
                success = true;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return s;
    }

    public static boolean readYesNo(String message) {
        System.out.println(message);

        boolean bool = false;
        String s;
        boolean success = false;

        while(!success) {
            try {
                s = scanner.next();
                if(s.charAt(0) == 'y' && s.length() == 1) {
                    bool = true;
                    success = true;
                } else if(s.charAt(0) == 'n' && s.length() == 1) {
                    bool = true;
                    success = true;
                } else {
                    throw new Exception("You must answer 'y' or 'n'");
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return bool;
    }
}