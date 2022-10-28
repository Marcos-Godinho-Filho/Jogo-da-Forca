class TesteTracinhos
{
    public static void main (String args [])
    {
        // testando construtor
        try
        {
            Tracinhos traco = new Tracinhos (-1);
        }
        catch (Exception erro)
        {
            System.err.print("\nconstrutor: " + erro);
        }

        // testando revele()
        try
        {
            Tracinhos traco = new Tracinhos (5);
            traco.revele(0,'a');
            System.out.print("\nrevele(): " + traco.toString());
            traco.revele(6, 'e');
        }
        catch (Exception erro)
        {
            System.out.print("\nrevele: " + erro);
        }

        // testando isAindaComTracinhos()
        try
        {
            Tracinhos traco = new Tracinhos(1);
            System.out.print("\nisAindaComTracinhos: " + traco.isAindaComTracinhos());
            traco.revele(0, 'a');
            System.out.print("\nisAindaComTracinhos: " + traco.isAindaComTracinhos());
        }
        catch (Exception erro)
        {}
       
        //testando toString()
        try
        {
            Tracinhos traco0 = new Tracinhos(5);
            System.out.print("\ntoString(): " + traco0.toString());
        }
        catch (Exception erro)
        {}

        // testando equals()
        try
        {
            Tracinhos traco1 = new Tracinhos(5);
            System.out.print("\nthis == obj: " + traco1.equals(traco1));

            Tracinhos traco2 = new Tracinhos(5);
            Tracinhos traco3 = null;
            System.out.print("\nobj == null: " + traco2.equals(traco3));

            Tracinhos traco4 = new Tracinhos(5);
            BancoDePalavras palavras = new BancoDePalavras();
            System.out.print("\nobj.getClass() != Tracinhos.class: " + traco4.equals(palavras));

            Tracinhos traco5 = new Tracinhos(5);
            Tracinhos traco6 = new Tracinhos(6);
            System.out.print("\nthis.texto.length != tracinhos.texto.length: " + traco5.equals(traco6));

            Tracinhos traco7 = new Tracinhos(5);
            traco7.revele(1, 'm');
            Tracinhos traco8 = new Tracinhos(5);
            System.out.print("\nthis.texto[i] != tracinhos.texto[i]: " + traco7.equals(traco8));

            Tracinhos traco9 = new Tracinhos(5);
            Tracinhos traco10 = new Tracinhos(5);
            System.out.print("\nEquals: " + traco9.equals(traco10));
        }
        catch (Exception erro)
        {}
        
        // testando hashCode()
        try
        {
            Tracinhos traco11 = new Tracinhos(5);
            System.out.print("\nhashCode: " + traco11.hashCode());
        }
        catch (Exception erro)
        {}

        // testando construtor de cópia
        try
        {
            Tracinhos traco12 = null;
            Tracinhos traco13 = new Tracinhos(traco12);
            
            System.out.print("\nconstrutor de cópia: " + traco13);
        }
        catch (Exception erro)
        {
            System.err.print("\nconstrutor de cópia: " + erro);
        }

        // testando clone()
        try
        {
            Tracinhos traco14 = new Tracinhos(5);
            Tracinhos traco15 = (Tracinhos) traco14.clone();

            System.out.print("\nclone(): " + traco15.toString());
        }
        catch (Exception e)
        {} 
    }
}