function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fAno = window.document.querySelector('input#txtano')
    var res = window.document.querySelector('div#res')
    if (fAno.value.length < 4 || Number(fAno.value) > ano){
        window.alert('Verifique os dados inseridos e tente novamente!')
    } else {
        var fsex = window.document.getElementsByName('radsex')
        /*var fsex = window.document.getElementsByName('radsex')[0] ou [1] para se referir a cada radio*/
        var idade = ano - Number(fAno.value)
        //res.innerHTML = `Idade Calculada: ${idade}`
        var genero = ''
        var img = window.document.createElement('img')/*criando elemento imagem*/
        img.setAttribute('id', 'foto')/*atribuindo id = foto para o elemento img*/
        img.setAttribute('width', '250')
        img.setAttribute('height', '250')
        if (fsex[0].checked) {
            genero = 'homem'
            if (idade >=0 && idade < 14) {
                //Criança
                img.setAttribute('src', 'homem crianca.png')
            } else if (idade < 30) {
                //Jovem
                img.setAttribute('src', 'homem jovem.png')
            } else if (idade < 70) {
                //Adulto
                img.setAttribute('src', 'homem adulto.png')
            } else {
                //Idoso
                img.setAttribute('src', 'homem idoso.png')
            }
        } else {
            genero = 'mulher'
            if (idade >=0 && idade < 14) {
                //Criança
                img.setAttribute('src', 'mulher crianca.png')
            } else if (idade < 30) {
                //Jovem
                img.setAttribute('src', 'mulher jovem.png')
            } else if (idade < 70) {
                //Adulto
                img.setAttribute('src', 'mulher adulta.png')
            } else {
                //Idoso
                img.setAttribute('src', 'mulher idosa.png')
            }
        }
        //res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }
}