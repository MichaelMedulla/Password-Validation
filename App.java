import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a password");
        System.out.println("Password length must be between 8-16 and must contain at least 3 of the following categories");
        System.out.println("Lower case letters: a-z");
        System.out.println("Upper case letters: A-Z");
        System.out.println("Numbers: 0-9");
        System.out.println("The following symbols: ~!@#$%^&*()-=+_");
        System.out.println("Example: Password1  pASSWORD_   Password_1");

        String pass = scan.nextLine();
        scan.close();

        if(validatePassword(pass))
        {
            System.out.println("Your password is valid");
        }
        else
        {
            System.out.println("Your password is invalid, please try again");
        }
    }

    public static boolean validatePassword(String pass)
    {
        int i = 0;

        if(pass.length() < 8 || pass.length() > 16)
        {
            return false;
        }

        if(pass.matches(".*[a-z].*"))
        {
            i++;
        }

        if(pass.matches(".*[A-Z].*"))
        {
            i++;
        }

        if(pass.matches(".*[0-9].*"))
        {
            i++;
        }

        if(pass.matches(".*[~!@#$%^&*()-=+_].*"))
        {
            i++;
        }

        if(i >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
