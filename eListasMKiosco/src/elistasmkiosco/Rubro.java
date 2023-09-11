/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elistasmkiosco;

import java.util.ArrayList;

/**
 *
 * @author Piruxb17
 */
public class Rubro {
    
    private int codRubro;
    private String descripcion;
    private  ArrayList <String> Articulo;

    public Rubro() {
    }

    public Rubro(int codRubro, String descripcion, ArrayList Articulo) {
        this.codRubro = codRubro;
        this.descripcion = descripcion;
        this.Articulo = Articulo;
    }

    /**
     * @return the codRubro
     */
    public int getCodRubro() {
        return codRubro;
    }

    /**
     * @param codRubro the codRubro to set
     */
    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the Articulo
     */
    public ArrayList getArticulo() {
        return Articulo;
    }

    /**
     * @param Articulo the Articulo to set
     */
    public void setArticulo(ArrayList Articulo) {
        this.Articulo = Articulo;
    }
    public Boolean validadCodigo(int codigo){
/*if (codigo>=1 && codigo<=9){
        return true;
        }else
        return false;*/
                return ( codigo>=1 && codigo<=9);
    }
    public Boolean codigoRepetido(int codigo){
        
    return codigo==this.codRubro;
    }
    public Boolean validadDescripcion(String descripcion){
        
        return (descripcion.length()>0&&descripcion.length()<=20);
    }
   /* public ArrayList filtroArticulos(String nombre){
        ArrayList <String> filtrado= new ArrayList();
        for(int i=0; i<Articulo.size();i++){
            String[] primeraPalabra= Articulo.get(i).split(" ");
            if (nombre.equals(primeraPalabra[0]))
                filtrado.add(Articulo.get(i).toString());
        }
    return filtrado;
    }*/

    @Override
    public String toString() {
        return "Rubro{" + "codRubro=" + codRubro + ", descripcion=" + descripcion + '}';
    }

    
    
    public String toStringArt() {
        return "Rubro{" + ", Articulo=" + Articulo + '}';
    }
    
        
}
