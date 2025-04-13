import java.util.Stack;

public class Pila {
    private Stack <String> arreglo;
    private static final int LIMITE=10;
    public Pila(){
        arreglo=new Stack<String>();
    }

    public void apilar(String dato)throws Exception{
        if (arreglo.size()>=LIMITE){
            throw new Exception("Error al apilar, Se ha alcanzado el limite de "+LIMITE+" objetos");
        }

        arreglo.push(dato);
    }
    public String desapilar() throws Exception {
        if (arreglo.isEmpty())
            throw new Exception("Error al desapilar, la pila está vacía");

        return arreglo.pop();
    }

    public String cima() throws Exception{
        if (arreglo.isEmpty())
            return "La pila esta vacia";
        return arreglo.peek();
    }

    @Override
    public String toString() {
       StringBuilder cadena= new StringBuilder();
       for(int indice=arreglo.size()-1;indice>=0;indice--){
           cadena.append(arreglo.get(indice)+"\n");
       }
       return cadena.toString();
    }
}
