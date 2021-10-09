import java.io.*;

public class StoredContracts
{
    private String name;
    private int price;
    private int id;

    public static void main(String[] args)
    {


        try
        {
            FileWriter contracts = new FileWriter("C:\\Users\\Victo\\OneDrive\\Desktop\\KEA\\Programmering + Softwareudvikling\\Afleveringer\\6. OOP Master\\Booking System\\src\\Contracts\\contracts.txt");
            PrintWriter printContractToFile = new PrintWriter(contracts);

            printContractToFile.println();

            printContractToFile.close();
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }

    }
}
