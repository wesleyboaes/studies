function carregar() {
    var msg = window.document.querySelector('div#msg')
    var img = window.document.querySelector('img#imagem')

    var data = new Date()
    var hora = data.getHours()
    var min = data.getMinutes()

    msg.innerHTML = `Agora são ${hora}h e ${min}min`

    if (hora >= 5 && hora < 12){
        //BOM DIA
        img.src = 'manha.png'
        document.body.style.background = '#e2cd9f'
    } else if ( hora < 18) {
        //BOA TARDE
        img.src = 'tarde.png'
        document.body.style.background = '#b9846f'
    } else {
        //BOA NOITE
        img.src = 'noite.png'
        document.body.style.background = '#515154'
    }
}