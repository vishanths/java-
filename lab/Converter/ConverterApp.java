

public class ConverterApp 
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Converting KtoM : ");
        double kilo = ip.nextDouble();
        System.out.println("Answer : " + DistanceConverter.KtoM(kilo));
    }    
}
