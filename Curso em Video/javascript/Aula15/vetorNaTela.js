let valores  = [8, 1, 7, 4, 2, 9]

console.log(valores)

for (let pos = 0; pos < valores.length; pos++){
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
}

//for in para vetores, só para arrays e objetos
for (let pos in valores){
    console.log(valores[pos])
}

console.log('----------------')
console.log(valores.indexOf(4)) //Retorna a chave em que o elemento se encontra