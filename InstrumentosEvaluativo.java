package evaluacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InstrumentosEvaluativo {
	
		static ArrayList<String> listProductos;
		static ArrayList<Integer> listCantidadesProducto;
		
		
		public static void main(String[]args) {
			
			InstrumentosEvaluativo iniciar= new InstrumentosEvaluativo();
			
			iniciar.ProductoYCantidades();
			iniciar.RegistrarProductos();
			iniciar.consultarProductoYUnidades();
			iniciar.ActualizarUnidades();
		
			
			System.out.println(listProductos);
			
			
		}
		
		
		public void ProductoYCantidades() {
			
			listProductos=new ArrayList<>();
			listCantidadesProducto=new ArrayList<>();
			
			
			
			
		}
		
		/*Registrar Productos en el inventarios , con condiconal para que no se repita el nombre del producto */
		
		private void RegistrarProductos() {
			int contador = 0;
	        String producto = "";
	        System.out.println("\n<<<Registro de Productos>>>\n");

	        contador = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos Productos desea registrar?"));

	        for (int i = 0; i < contador; i++) {
	            producto = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1));
	        	if(!listProductos.contains(producto)) {
	        		listProductos.add(producto);
	        		  int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos unidades desea registrar para el producto?" ));
	   	         
	  	                
	  	              
	  	                listCantidadesProducto.add(unidades);
	  	                System.out.println("Registro de unidades exitoso!!");
	        		}else{
					
	        			System.out.println("El producto ya existe en el registro");
	        			i--;
	        			continue;
	        		}
	  
	        }

	        System.out.println("Registro de producto exitoso!!\n");
	    }
		
		/*Actualiza las unidades , segun la posicion del producto, utilizamos un ciclo para recorrer  la cadena*/
		
		private void ActualizarUnidades() {
	        System.out.println("\n<<<Registro de  unidades de los productos >>>\n");
	        for (int i = 0; i < listProductos.size(); i++) {
	            JOptionPane.showMessageDialog(null, "Ingrese las unidades para "
	            		+ "el producto " + listProductos.get(i));
	            Integer producto =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que se agregara al producto  "));
	            listCantidadesProducto.set(i, producto );

	            
	          
	        }
	        
	        System.out.println("Registro de unidades exitoso!!");
	    }
		
		
		private void consultarProductoYUnidades() {
	        System.out.println("\n<<<Lista de Productos y unidades>>>\n");
	        int listaTemporal;
	        for (int i = 0; i < listCantidadesProducto.size(); i++) {
	        	
	        	listaTemporal=listCantidadesProducto.get(i);
	        	System.out.print("Producto: "+listProductos.get(i)+" = ["+ listaTemporal+ "]\n");
	        
	        		
	        		
	        	}
	        	
	        }
	    
	/*	
		private void consultarProducto() {
	    	System.out.print("\n<<<Consulta de Producto >>>");
	    	String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto a consultar");
	    	
	    	
	    		
	    		if(listProductos.contains(nombre)) {
	    			for(int j=0;j<listProductos;j++) {
	    			ArrayList<Integer> listProductoTemporal=listCantidadesProducto.get(j);
	    			
	    			System.out.print("\nEl Producto : "+nombre+ " = ");
	    			System.out.print("[");
	    			for(int i=0;i<listProductoTemporal.size();i++) {
	    				System.out.print(listProductoTemporal.get(i));
	    				
	    				if(i<listProductoTemporal.size()-1) {
	    					System.out.println(",");
	    					
	    				}
	    				
	    			}
	    			System.out.print("]\n");
	    		}else {
	    			System.out.println("No se encuentra el producto "+nombre);
	    		}
	    		
	    	}
	    */
		
		

}
