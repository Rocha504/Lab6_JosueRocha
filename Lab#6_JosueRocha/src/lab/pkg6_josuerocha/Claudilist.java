 
package lab.pkg6_josuerocha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Claudilist {
    
    private String nombre;
    private ArrayList <Programa> programas;
    
    
    
    public Claudilist() {
    }

    public Claudilist(String nombre) {
        this.nombre = nombre;
    }
    
    public Claudilist(String nombre, ArrayList<Programa> programas) {
        this.nombre = nombre;
        this.programas = programas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    public void escribir() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo=null;
        try {
            archivo=new File("./"+getNombre()+".txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Programa c : programas) {
                bw.write(c.getNombre() + "/");
                bw.write(c.getPuntuacion() + "/");
                bw.write(c.getFecha() + "/");
                bw.write(c.getTipo() + "/");
                bw.write(c.getGenero()+"\n");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo() {
        Scanner sc = null;
        programas = new ArrayList();
        File archivo=new File("./"+getNombre()+".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    programas.add(new Programa(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),sc.next(),sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    
    public void mostrarArchivo(String n) throws FileNotFoundException, IOException{
        File archivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        try{
            archivo=new File("./"+n+".txt");
            fr=new FileReader (archivo);
            br=new BufferedReader(fr);
            String linea="";
            while((linea=br.readLine()) != null){
                System.out.println(linea);   
            
        }
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificarPrograma(Claudilist ap,String n,int p,int puntuacion,int fecha, String tipo, String genero) throws IOException{
        
        ap.cargarArchivo();
        ap.getProgramas().get(p).setNombre(n);
        ap.escribir();
        ap.getProgramas().get(p).setPuntuacion(puntuacion);
        ap.getProgramas().get(p).setFecha(fecha);
        ap.getProgramas().get(p).setTipo(tipo);
        ap.getProgramas().get(p).setGenero(genero);
        ap.escribir();
        
    }
    public void escribirC() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo=null;
        try {
            archivo=new File("./"+getNombre()+".txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
           
                bw.write("• Que inciso le toco y en qué manera cree que eso mejorara su programa.\n" +
"• ¿Cuál es el tema en el que más debilidad siente y por qué? (únicamente son válidos\n" +
"los temas que aparecen junto a su número de cuenta en la tabla).\n" +
"• Explicación de como planea incluir ese tema en el que siente debilidad dentro del\n" +
"laboratorio que se le fue asignado\n" +
"• Un comentario hacia su instructora hablando sinceramente sobre: Que cosas le\n" +
"gustaron y no le gustaron sobre los laboratorios que ella le asigno y que haría para\n" +
"mejorar la calidad de los mismo (por ejemplo: aumento en lacomplejidad/dificultad,\n" +
"reducción de extensión en los labs, etc)");
                bw.write("1- Me toco el inciso 2 y se que mejorare el programa haciendo una interfaz mas amigable ademas de hacer que funcione tal y como lo especifica el proyecto.\n");
                bw.write("El tema de tablas y arboles, especificamente los arboles, ya que cuentan\n con muchos metodos como Root entre otros que siento\n que son cosas que no son cuestion de creatividad si no mas bien memorizacion y no se como puede ser mas creativo con eso.");
                bw.write("Yo planeo implentar hilos a mi programa. Por los momentos tengo la idea de poner un reloj que muestre la hora mientra se esta en el programa, aunque intentare usarlo en otras cosas.\n");
                bw.write("Claudia sinceramente tus laboratorios estuvieron excelentes, ya que siento que el nivel de dificultad era apropiado y estabn bien explicados\n pero sobre todo, estabas pendiente si algo no se entendia y lo explicabas muy bien,\n almenos de tu parte no siento que hubiera ningun problema.");
                
                
            
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
      
    
    
    
}
