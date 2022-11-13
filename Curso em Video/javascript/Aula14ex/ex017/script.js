function tabuada(){
    let num = document.querySelector('input#txtn')
    let tab = document.querySelector('select#seltab')

    if (num.value.length == 0){
        alert(`Por favor digite um número! \u{1F605}` )
    } else{
        let n = Number(num.value)
        let c = 1

        //Para limpar a tabela
        tab.innerHTML = ''

        while(c <= 10){
            let item = document.createElement('option')
            item.text = `${n} x ${c} = ${n*c}`
            item.value = `tab${c}`//Valor para PHP
            tab.appendChild(item)
            c++
        }
    }


}