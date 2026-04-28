def solucion(num):
    cont = 0
    resta = 0
    if num!=6174:
        while resta!=6174:
            a = num % 10
            num = (num-a)/10
            b = int(num % 10)
            num = (num-b)/10
            c = int(num % 10)
            num = (num-c)/10
            d = int(num)
            lista = [a, b, c, d]
            primero = lista.pop(lista.index(max(lista)))
            segundo = lista.pop(lista.index(max(lista)))
            tercero = lista.pop(lista.index(max(lista)))
            cuarto = lista.pop(lista.index(max(lista)))
            maxNum = primero*1000+segundo*100+tercero*10+cuarto
            minNum = cuarto*1000+tercero*100+segundo*10+primero
            resta = maxNum-minNum
            cont = cont +1
            num = resta
    print(cont)


num = int(input())
solucion(num)