lista=[5,9,"Bayron",15.5,-15]
print(lista[2:])

#Fusionar listas concatenar

primer_lista=[1,2,3,4,5]
segunda_lista=[6,7,8,9]
print(primer_lista+  segunda_lista)

print(primer_lista + [6,7,7,8,9,10])

#Modificar listas

numeros=[1,2,3,4,9,6,7,8,9]
numeros[4]=5

#apennd añadir número al final
numeros.append(10)


abecedario=["a" , "b ", "c","d"]
(abecedario[:3])

abecedario[:2] = ["z , x"]

#anidar listas en listas

primero=[1,2,3]
segundo=[4,5,6]
tercero=[7,8,9]
cuarto=[10,11,12]
anidadas=[primero,segundo,tercero,cuarto]

print(anidadas[2][0])
#Podemos llamar numeros en listas anidadas usando [0][0] primer valor de la primera lista
