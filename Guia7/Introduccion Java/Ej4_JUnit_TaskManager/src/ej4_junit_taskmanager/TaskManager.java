/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_junit_taskmanager;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class TaskManager {
    	private ArrayList<String> listaTarea = new ArrayList<String>();
	
	
	public TaskManager(){
	}
	
	public TaskManager(ArrayList<String>listaTarea){
		this.listaTarea = listaTarea;
	}

    public ArrayList<String> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(ArrayList<String> listaTarea) {
        this.listaTarea = listaTarea;
    }
	
	
	
	public void agregarTarea(String tarea){
	String tareaMin = tarea.toLowerCase();
	listaTarea.add(tarea);			
	}
	
	public void eliminarTarea(String tarea){
	String tareaMin = tarea.toLowerCase();
	int index = listaTarea.indexOf(tarea);
	listaTarea.remove(index);
	}
	
	public void mostrarTarea(){
		for(String tarea:listaTarea){
			System.out.println(tarea);
		}
		
	}
}
    
    
    
    

