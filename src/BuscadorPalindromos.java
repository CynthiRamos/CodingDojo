
class BuscadorPalindromos {
    private int Numero;

    public BuscadorPalindromos(int Numero) {
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public boolean isPalindromo(){
        char[] cadena = preparaCadena(this.getNumero());
        int cabezaCadena=0, colaCadena=tamañoCadena(cadena)-1;
        for (; cabezaCadena<=colaCadena && cadena[cabezaCadena]==cadena[colaCadena]
                ; cabezaCadena++, colaCadena--);
        return cabezaCadena>=colaCadena; 
    }
    
    public char[] preparaCadena(int valor){
        return Integer.toString(valor).toCharArray();
    }
    
    public int tamañoCadena(char[] cadena){
        return cadena.length;
    }
    

}
