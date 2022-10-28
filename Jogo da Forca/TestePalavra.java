class TestePalavra
{
    public static void main (String args [])
    {
        // testando construtor
        try
        {
            Palavra palavra = new Palavra (null);
            Palavra palavra1 = new Palavra ("");
        }
        catch (Exception erro)
        {
            System.err.print("\nconstrutor: " + erro);
        }

        // testando getQuantidade()
        try
        {
            Palavra palavra = new Palavra ("palavra");
            System.out.print("\ngetQuantidade('a'): " + palavra.getQuantidade('a'));
            System.out.print("\ngetQuantidade('p'): " + palavra.getQuantidade('p'));
        }
        catch (Exception erro)
        {}

        // testando getPosicaoDaIezimaOcorrencia()
        try
        {
            Palavra palavra = new Palavra("palavra");
            System.out.print(palavra.getPosicaoDaIezimaOcorrencia(1, 'a'));
            System.out.print(palavra.getPosicaoDaIezimaOcorrencia(1, 'q'));
        }
        catch (Exception erro)
        {
            System.out.print("\ngetPosicaoDaIezimaOcorrencia(): " + erro);
        }
       
        // testando equals()
        try
        {
            Palavra palavra1 = new Palavra("palavra");
            System.out.print("\nthis == obj: " + palavra1.equals(palavra1));

            Palavra palavra2 = new Palavra("palavra");
            Palavra palavra3 = null;
            System.out.print("\nobj == null: " + palavra2.equals(palavra3));

            Palavra palavra4 = new Palavra("palavra");
            BancoDePalavras palavras = new BancoDePalavras();
            System.out.print("\nobj.getClass() != Palavra.class: " + palavra4.equals(palavras));

            Palavra palavra5 = new Palavra("palavra");
            Palavra palavra6 = new Palavra("texto");
            System.out.print("\nthis.texto != palavra.texto: " + palavra5.equals(palavra6));

            Palavra palavra7 = new Palavra("palavra");
            Palavra palavra8 = new Palavra("palavra");
            System.out.print("\nEquals: " + palavra7.equals(palavra8));
        }
        catch (Exception erro)
        {}
        
        // testando hashCode()
        try
        {
            Palavra palavra9 = new Palavra("palavra");
            System.out.print("\nhashCode: " + palavra9.hashCode());
        }
        catch (Exception erro)
        {}
    }
}