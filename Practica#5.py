nombre=input("ingrese su nombre")
genero=input("ingrese su genero (M o H)")

if genero =="M" and nombre.lower() <"m" or genero == "H" and nombre.lower() > "n":
    grupo = "A"
else : 
    grupo = "B"
    print("Tu grupo es " + grupo)



