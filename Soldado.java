


public static void main (args[])

soldado s1 = new Soldado(1, "mikasa");
soldado s2 = new Soldado(1, "Eren");
soldado s3 = new Soldado(1, "Armin");
soldado s4 = new Soldado(1, "Levi");

Titan = 

 public static int cantNormales(Soldado[] soldados){
  
      if(soldados.lenght > 0){
        return cantNormales(soldados,0, soldados.lenght -1)
      
      }
  return 0;
  
  

}
private static int cantNormales(Soldado[] soldados){
  
  if (i==j){
    Soldado sol = soldados[i];
    if(sol.getTitan() == null){
       return 1;
    }
    return 0;
  
  
  }
  
  int mitad = (i+j)/2;
  int cantIzq = mayor(soldados, i, mitad);
  int cantDer = mayor(soldados, mitad +1,j);
  return cantIzq + cantDer;
  
}
  
  
  
 // soldado[0].length
//  soldado.length
  


//  la que se llama el usuario
public static Soldado mayor(Soldado[] soldados){
  
  if(soldados.length>0){
      return mayor(soldados, 0, soldados.length)
  }
  return null;

}

// el metodo de recursion
private static Soldado mayor(Soldado[] soldados){
  
  if(i==j){
    Soldado soldado = soldados[i];
    if(soldados.getTitan() != null){
      return soldado;
    
    }
    return null;
  }
  // el i corresponde al extremo izq y j al derecho, dividir para conquistar
  int mitad = (i+j)/2;
  Soldado mayIzq = mayor(soldados, i, mitad);
  Soldados mayDer = mayor(soldados, mitad +1,j);
  // Aqui se compara retornar un mayor
  // 4 casos: s1,s2  null,S2 s1,null null,
  
  if (mayIzq != null && mayDer != null){
    double alturaIzq = mayIzq.getTitan().getAltura();
    double alturaIzq = mayDer.getTitan().getAltura();
  
  
  }
  // row fila
  public static int cant(Soldado[][] soldados){
   
  
  }
 
  private static int cant(Soldado[] soldados, int rowi,int rowj,int coli,int colj) {
    // retorna objetos, e suna matriz de objetos...
    
    // el caso de que sea matriz 1x1
    if (rowi == rowj && coli == colj){
      Soldado s = soldados[rowi][coli];
      if(s.getTitan() == null){
          return 1;
      }
      return 0; // o poner else
    }
    // matriz de 1x2
    if(row == rowj && coli == colj -1){
      Soldado s1 = soldados[rowi][coli];
      Soldado s2 = soldados[rowj][colj];
   
      if(s1.getTitan() == null && s2.getTitan()){
         return 2;
      }                         // poner los palitos de or
       if(s1.getTitan() == null II s2.getTitan()){
         return 1;
    }
      return 0;
      
      
    // matriz 2x1
    if(rowi == rowj - 1 && coli == colj){
            Soldado s1 = soldados[rowi][coli];
      Soldado s2 = soldados[rowj][colj];
   
      if(s1.getTitan() == null && s2.getTitan()){
         return 2;
      }                         // poner los palitos de or
       if(s1.getTitan() == null II s2.getTitan()){
         return 1;
    }
    return 0; 
    
    }
    
    // caso de matrices mayores
    int mitadrow = (rowi + rowj)/2;
    int mitadcol = (coli + colj)/2;
    int cantSupIzq = cant(soldados, rowi, mitadrow, coli, mitadcol);
    int cantSupDer = cant(soldados, rowi, mitadrow, mitadcol+1, colj);
    int cant InfIzq = cant(soldados, mitadrow +1, rowj, coli, mitadcol);
    int cantInfDer =  cant(soldados, mitadrow +1, rowj, mitadcol+1, colj);
  
    return cantSupIzq+cantSupDer+cant InfIzq+cantInfDer;
  
      return 0;
  }
  
    
  
}
