Algoritmo Actividad3_5
	Definir numEstHombres, numEstMujeres,  totalEstudiantes Como Entero 
	Definir porcentajeHombres , porcentajeMujeres Como Real
	
	Escribir "Ingrese el n�mero de estudiantes hombres: " 
	Leer numEstHombres
	
	Escribir "Ingrese el n�mero de estudiantes mujeres: " 
	Leer numEstMujeres
	
	totalEstudiantes = numEstHombres + numEstMujeres
	
	porcentajeHombres = numEstHombres / totalEstudiantes
	porcentajeMujeres = numEstMujeres / totalEstudiantes
	
	Escribir " El Porcentaje de ni�os es: ", porcentajeHombres * 100 , " %"
	Escribir " El Porcentaje de nmujeres es: ", porcentajeMujeres *100 , " %"
	
FinAlgoritmo
