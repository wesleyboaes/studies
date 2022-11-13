function contar() {
    /*ler = var*/
    let ini = document.querySelector('input#txti')
    let fim = document.querySelector('input#txtf')
    let passo = document.querySelector('input#txtp')
    let res = document.querySelector('div#res')

    if(ini.value.length == 0 || fim.value.length == 0 || passo.value.length ==0 ){
        window.alert('[ERRO] Faltam Dados! \u{1F615}')
        res.innerHTML = `Impossível Contar! \u{1F62D}`
    } else {
        res.innerHTML = `Contando...  <br>`

        let i = Number(ini.value)
        let f = Number(fim.value)
        let p = Number(passo.value)
        
        if (p <= 0){
            window.alert(`Passo inválido! Considerando PASSO 1 \u{1F60E}`)
            p = 1
        }

        if (i < f){
            //Contagem Crescente
            for (let c = i; c <= f; c += p) {
                res.innerHTML += ` ${c} \u{1F449} ` /*c + " "*/
            }
        } else{
            //Contagem Regressiva
            for (let c = i; c >= f; c -= p) {
                res.innerHTML += ` ${c} \u{1F449} ` /*c + " "*/
            }
        }
        res.innerHTML += `\u{1F3C1}`
    }

}