Algoritmo Actividad4_6
	Definir paso0, paso1, paso2, paso3, paso4, paso5, paso6, emergencia Como Caracter
	Definir correo Como Entero 
	
	//Escribir 'Inicie
	
	paso0 = 'Iniciar sesion'
	paso1 = 'Buscar ingresos publicitarios en los informes de marketing'
	paso2 = 'Completar hoja de calculo'
	paso3 = 'Revisa correo'
	paso4 = 'Revisa correo de voz'
	
	Escribir '¿Cuantos correos hay?'
	leer correo
	
	si correo < 10 Entonces
		Escribir paso4
		Escribir '¿Hay solicitud de emergencia? (SI/NO)'
		Leer emergencia
		si emergencia = 'SI' Entonces
			Escribir 'Haga la solicitud de emergencia'
		FinSi
		Escribir 'Revisar correo de voz ejecutivos'
	FinSi
	
	Escribir 'Enviar correo de actualización'
	

	
	

//0) Iniciar sesion
//1) buscar ingresos publicitarios en los informes de marketing
//2) completar hoja de calculo
//3) revisa correo
//		ver solicitudEmergencia
//4)cantidadCorreo < 10 
//	     revisar correo de voz ejecutivos
//4.1)Enviar correo de actualizacion
//5)Apagar la computadora
//6)Regar la planta del escritorio
//7)
FinAlgoritmo
