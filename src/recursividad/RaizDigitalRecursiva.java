
package recursividad;

public class RaizDigitalRecursiva {
    public static int raizDigital(int numero)
{
    if (numero < 10)
    {
        return numero;
    }
    else
    {
        int sumaDigitos = sumaDeDigitos(numero);
        return raizDigital(sumaDigitos);
    }
}

private static int sumaDeDigitos(int numero)
{
    if (numero == 0)
    {
        return 0;
    }
    else
    {
        return numero % 10 + sumaDeDigitos(numero / 10);
    }
}
    
}
