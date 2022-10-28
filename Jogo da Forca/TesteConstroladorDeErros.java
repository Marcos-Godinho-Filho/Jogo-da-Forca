class TesteControladorDeErros
{
    public static void main (String args [])
    {
        // testando construtor
        try
        {
            ControladorDeErros erros = new ControladorDeErros (-1);
        }
        catch (Exception erro)
        {
            System.err.print("\n" + erro);
        }

        // testando registreUmErro()
        try
        {
            ControladorDeErros erros = new ControladorDeErros(0);
            erros.registreUmErro();
        }
        catch (Exception erro)
        {
            System.err.print("\n" + erro);
        }

        // testando isAtingidoMaximoDeErros()
        try
        {
           ControladorDeErros erros1 = new ControladorDeErros(0);
           System.out.print("\nthis.qtdErr == this.qtdMax: " + erros1.isAtingidoMaximoDeErros());
        }
        catch (Exception erro)
        {}
       
        // testando equals()
        try
        {
           ControladorDeErros erros1 = new ControladorDeErros(1);
           System.out.print("\nthis == obj: " + erros1.equals(erros1));

           ControladorDeErros erros2 = new ControladorDeErros(2);
           ControladorDeErros erros3 = null;
           System.out.print("\nobj == null: " + erros2.equals(erros3));

           ControladorDeErros erros4 = new ControladorDeErros(4);
           BancoDePalavras palavras = new BancoDePalavras();
           System.out.print("\nobj.getClass() != ControladorDeErros.class: " + erros4.equals(palavras));

           ControladorDeErros erros5 = new ControladorDeErros(5);
           ControladorDeErros erros6 = new ControladorDeErros(6);
           System.out.print("\nthis.qtdMax != control.qtdMax: " + erros5.equals(erros6));

           ControladorDeErros erros7 = new ControladorDeErros(5);
           ControladorDeErros erros8 = new ControladorDeErros(6);
           erros8.registreUmErro();
           System.out.print("\nthis.qtdErr != control.qtdErr: " + erros7.equals(erros8));

           ControladorDeErros erros9 = new ControladorDeErros(9);
           ControladorDeErros erros10 = new ControladorDeErros(9);
           System.out.print("\nEquals: " + erros9.equals(erros10));
        }
        catch (Exception erro)
        {}
        
        // testando hashCode()
        try
        {
            ControladorDeErros erros11 = new ControladorDeErros(11);
            System.out.print("\nhashCode: " + erros11.hashCode());
        }
        catch (Exception erro)
        {}

        // testando construtor de cópia
        try
        {
            ControladorDeErros erros12 = null;
            ControladorDeErros erros13 = new ControladorDeErros(erros12);
            
            System.out.print("\nconstrutor de cópia: " + erros13);
        }
        catch (Exception erro)
        {
            System.err.print("\nconstrutor de cópia: " + erro);
        }

        // testando clone()
        try
        {
            ControladorDeErros erros14 = new ControladorDeErros(14);
            ControladorDeErros erros15 =  (ControladorDeErros) erros14.clone();

            System.out.print("\nclone(): " + erros15);
        }
        catch (Exception e)
        {}
    }
}