package cl.ubb;

public class Robot {
	private String estado;;
	private int num_detenciones;
	
	
	public Robot() {
		estado = "Detenido";
		num_detenciones = 0;
	}
	
	
	public void mover(char direccion){
		if("Detenido".equalsIgnoreCase(estado)) {
			if(direccion=='A'){
				estado = "Avanzando";
			}else{
				estado = "Retrocediendo";
			}
		}
	}

	public void girar(char direccion){
		if("Detenido".equalsIgnoreCase(estado)) {
			if(direccion=='I'){
				estado = "Izquierda";
			}else{
				estado = "Derecha";
			}
		}
	}
	
	public void detener(){
		if (!"Detenido".equalsIgnoreCase(estado)) {
			estado = "Detenido";
		} 		
	}


	public String getEstado() {
		return estado;
	}



	public int getNum_detenciones() {
		return num_detenciones;
	}

	

}
