package evaluacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InstrumentosEvaluativo {
	
		static ArrayList<String> listProductos;
		static ArrayList<Integer> listCantidadesProducto;
		
		
		public static void main(String[]args) {
			
			InstrumentosEvaluativo iniciar= new InstrumentosEvaluativo();
			
			iniciar.ProductoYCantidades();
			
			  int codMenuPpal=0;
		        
				do {
					
					String menu="Menu del sistema\n\n";
					menu+="1. Agregar Producto \n";
					menu+="2. Buscar Producto\n";
					menu+="3. Actualizar cantidad de Producto\n";
					menu+="4. Eliminar Producto\n";
					menu+="5. Mostrar Inventario\n";
					menu+="6. Salir\n\n";
					menu+="Por favor Seleccione una opcion \n";
				
					codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
					
					switch (codMenuPpal) {
					case 1:
						
						JOptionPane.showMessageDialog(null,"Registrar Producto" );
						iniciar.RegistrarProductos();
						iniciar.consultarProductoYUnidades();
						break;
					case 2:
						
						JOptionPane.showMessageDialog(null,"Buscar Producto" );
						iniciar.consultarProducto();
						
						break;
					case 3:
						
						
						JOptionPane.showMessageDialog(null,"Actualizar cantidad Producto" );
							
							iniciar.ActualizarUnidades();
							iniciar.consultarProductoYUnidades();
					
					
						
						break;
					case 4:
						
						JOptionPane.showMessageDialog(null,"Eliminar Producto" );
						
						
						break;
					case 5:
						
						JOptionPane.showMessageDialog(null,"Mostrar Inventario" );
						
						
						break;
					case 6:
						
						JOptionPane.showMessageDialog(null,"Consulta de Estudiante" );
						
						 
						break;
					
					default:
						
						JOptionPane.showMessageDialog(null,"No corresponde a un "
								+ "codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE );
						break;
							
					}
					
				}while(codMenuPpal !=6);
				
		        
		       
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
	    
		private void consultarProducto() {
	    	System.out.print("\n<<< Consulta de Producto >>> \n");
	    	String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto para saber"
	    			+ " la cantidad de unidades asociados");
	    	
	    	if(listProductos.contains(nombre)) {
	    		int posicion=listProductos.indexOf(nombre);
	    		int listaTemporal= listCantidadesProducto.get(posicion);
	    		System.out.println("La cantidad de unidades para el producto son: "+nombre+""
	    				+ " es "+listaTemporal);
	    	}else {
	    		System.out.println("No se encuentra producto "+nombre+ "\n");
	    	}
	    	
	    }
		
		

}
