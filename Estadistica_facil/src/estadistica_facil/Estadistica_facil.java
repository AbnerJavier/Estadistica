package estadistica_facil;

import java.util.Scanner;

public class Estadistica_facil {
    int r;
    double k;
    double c;
    double media;
    double moda;
    double mediana;
    double Xi;
    int L;
    int n;
    int a;

    public Estadistica_facil() {
        this.r = 0;
        this.k = 0.0;
        this.c = 0.0;
        this.media = 0.0;
        this.moda = 0.0;
        this.mediana = 0.0;
        this.Xi = 0.0;
        this.L = 0;
        this.n = 0;
        this.a = 0;
    }
    
    public void setRango(int r)
    {
        this.r = r;
    }
    public void setClase(double k)
    {
        this.k = k;
    }
    public void setAmplitud(double c)
    {
        this.c = c;
    }
    public void setMedia(double media)
    {
        this.media = media;
    }
    public void setModa(double moda)
    {
        this.moda = moda;
    }
    public void setMediana(double mediana)
    {
        this.mediana = mediana;
    }
    public void setXi(double Xi)
    {
        this.Xi = Xi;
    }
    public void setL(int L)
    {
        this.L = L;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    public void setA(int a)
    {
        this.a = a;
    }
    public int getRango()
    {
        return(this.r);
    }
    public double getClase()
    {
        return(this.k);
    }
    public double getAmplitud()
    {
        return(this.c);
    }
    public double getMedia()
    {
        return(this.media);
    }
    public double getModa()
    {
        return(this.moda);
    }
    public double getMediana()
    {
        return(this.mediana);
    }
    public double getXi()
    {
        return(this.Xi);
    }
    public int getL()
    {
        return(this.L);
    }
    public int getN()
    {
        return(this.n);
    }
    public int getA()
    {
        return(this.a);
    }
    public void rango(int xm,int xM)
    {
        int r;
        r = xM - xm;
        setRango(r);
        System.out.println("El rango es "+getRango());
    }
    public void clase(int na)
    {
        double k1;
        k1 = 1+3.322*(Math.log10((double)na));
        setClase(k1);
        System.out.println("La clase es "+getClase());
    }
    public void frecuencias()
    {
        Scanner sc = new Scanner(System.in);
        int datos[] = new int [5], lon = 0;
        System.out.println("Ingrese unos 5 datos");
        for(int i=0; i<datos.length; i++)
        {
            System.out.println("Ingrese dato "+(i+1));
            datos[i] = sc.nextInt();
        }
        //Ordenamietno Burbujas
        int aux;
        for(int j=1;j<datos.length;j++)
        {
            if(datos[j-1] > datos[j])
            {
                aux = datos[j-1];
                datos[j-1] = datos[j];
                datos[j] = aux;
            }
        }
        rango(datos[0], datos[4]);
        for(int i=0;i<datos.length;i++)
        {
            lon += datos[i];
        }
        clase(lon);
        
    }
    public static void main(String[] args) {
        Estadistica_facil ef = new Estadistica_facil();
        ef.frecuencias();
    }
    
}
