class TesteControladorDeLetrasDigitadas
{
    public static void main (String args [])
    {
        // testando construtor
        try
        {
            ControladorDeLetrasJaDigitadas letras = new ControladorDeLetrasJaDigitadas ();
        }
        catch (Exception erro)
        {}

        // testando isJaDigitada()
        try
        {
            ControladorDeLetrasJaDigitadas letras = new ControladorDeLetrasJaDigitadas ();
            letras.registre('q');
            System.out.print("\nisJaDigitada(): " + letras.isJaDigitada('q'));
            System.out.print("\nisJaDigitada(): " + letras.isJaDigitada('a'));
        }
        catch (Exception erro)
        {
            System.err.print("\n" + erro);
        }

        // testando registre()
        try
        {
            ControladorDeLetrasJaDigitadas letras = new ControladorDeLetrasJaDigitadas();
            letras.registre('a');
            letras.registre('a');
            
        }
        catch (Exception erro)
        {
            System.err.print("\nregistre(): " + erro);
        }

        //testando toString()
        try
        {
            ControladorDeLetrasJaDigitadas letras0 = new ControladorDeLetrasJaDigitadas();
            letras0.registre('a');
            letras0.registre('b');
            letras0.registre('c');
            System.out.print("\ntoString(): " + letras0.toString());
        }
        catch (Exception erro)
        {}
       
        // testando equals()
        try
        {
            ControladorDeLetrasJaDigitadas letras1 = new ControladorDeLetrasJaDigitadas();
           System.out.print("\nthis == obj: " + letras1.equals(letras1));

           ControladorDeLetrasJaDigitadas letras2 = new ControladorDeLetrasJaDigitadas();
           ControladorDeLetrasJaDigitadas letras3 = null;
           System.out.print("\nobj == null: " + letras2.equals(letras3));

           ControladorDeLetrasJaDigitadas letras4 = new ControladorDeLetrasJaDigitadas();
           BancoDePalavras palavras = new BancoDePalavras();
           System.out.print("\nobj.getClass() != ControladorDeLatrasJaDigitadas.class: " + letras4.equals(palavras));

           ControladorDeLetrasJaDigitadas letras5 = new ControladorDeLetrasJaDigitadas();
           letras5.registre('a');
           ControladorDeLetrasJaDigitadas letras6 = new ControladorDeLetrasJaDigitadas();
           letras6.registre('b');
           System.out.print("\nthis.letrasJaDigitadas != ret.letrasJaDigitadas: " + letras5.equals(letras6));

           ControladorDeLetrasJaDigitadas letras7 = new ControladorDeLetrasJaDigitadas();
           ControladorDeLetrasJaDigitadas letras8 = new ControladorDeLetrasJaDigitadas();
           System.out.print("\nEquals: " + letras7.equals(letras8));
        }
        catch (Exception erro)
        {}
        
        // testando hashCode()
        try
        {
            ControladorDeLetrasJaDigitadas letras9 = new ControladorDeLetrasJaDigitadas();
            System.out.print("\nhashCode: " + letras9.hashCode());
        }
        catch (Exception erro)
        {}

        // testando construtor de cópia
        try
        {
            ControladorDeLetrasJaDigitadas letras10 = null;
            ControladorDeLetrasJaDigitadas letras11 = new ControladorDeLetrasJaDigitadas(letras10);
            
            System.out.print("\nconstrutor de cópia: " + letras11);
        }
        catch (Exception erro)
        {
            System.err.print("\nconstrutor de cópia: " + erro);
        }

        // testando clone()
        try
        {
            ControladorDeLetrasJaDigitadas letras12 = new ControladorDeLetrasJaDigitadas();
            letras12.registre('a');
            ControladorDeLetrasJaDigitadas letras13 =  (ControladorDeLetrasJaDigitadas) letras12.clone();

            System.out.print("\nclone(): " + letras13);
        }
        catch (Exception e)
        {}
    }
}