#If
Alvaro = 67
if Alvaro== 67:
    print("Alvaro vale 67")
if Alvaro== 10:
    print("Alvaro vale 10")
if Alvaro!= 10:
    print("alvaro no vale 10")

#If - else - elif
alvaro = 10
if alvaro%2==0:{
    print("Par")
} 
else:{
    print("Impar")
    }

frase = "hol"

if frase == "hola":
    print("Bienvenidos")
elif frase == "hola":
    print("¿Cómo estás?")
else :
    print("ningun resultado")

final = float(input("Digita la nota "))
if final>=9:
    print("Aprobaste la materia")
elif final>=7:
    print("Aprobaste por poco")
elif final == 6:
    print("Te faltó poco")
elif final <= 5 :
    print("Reprobaste")
else :
    print("Dato incorrecto nota 1-10")

#While
i = 0
#cuando queremos usar el while 1 vez usamos "break"
while i<10:
    
    
    i=i+1;
    if i==5:
        print(i)
else :
    print("Se terminó el ciclo")