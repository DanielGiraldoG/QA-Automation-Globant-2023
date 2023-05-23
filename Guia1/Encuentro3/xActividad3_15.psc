Algoritmo xActividad3_15
	
	Definir horaInicial , minutosInicial, segundosInicial, tiempoViaje, horaInicialSeg, minutosInicialSeg , segInicialTotal, segFinalTotal Como Entero
	Definir horaFinal, minutosFinal, segundosFinal Como Real
	Escribir "Ingrese la hora inicial en HH"
	leer horaInicial
	
	Escribir "Ingrese los minutos iniciales en MM"
	leer minutosInicial
	
	Escribir "Ingrese los segundos iniciales en SS"
	Leer segundosInicial
	
	Escribir "Ingrese el tiempo de viaje en segundos"
	leer tiempoViaje
	
	horaInicialSeg = horaInicial * 60 * 60
	minutosInicialSeg = minutosInicial * 60
	
	segInicialTotal = horaInicialSeg + minutosInicialSeg + segundosInicial
	segFinalTotal = segInicialTotal + tiempoViaje // tiempo total en segundos
	
	// Tiempo total se convierte en formato HH:MM:SS
	
	horaFinal = (Trunc (segFinalTotal * (1/60) * (1/60)))%24
	minutosFinal = Trunc ((segFinalTotal%3600) / 60)
	segundosFinal = (segFinalTotal % 60)
	
	Escribir  horaFinal ," HH " minutosFinal " MM " , segundosFinal " SS "
	
	
	
FinAlgoritmo
