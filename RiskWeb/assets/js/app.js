//url liste des players
var urlGet = "http://localhost:8080/getPlayer";
//url post list de players
var urlPost = "http://localhost:8080/addPlayers";
//menu select
var select = document.getElementById('nbJoueurs');
//cible la div des inputs a insérer
var divInput = document.getElementById('inputPlayers')



/**
 * modifie l'affichage du nombre des inputs 
 * 
 */
function afficherNbInput() {

    //reinitialisation des inputs affichés
    while (divInput.children.length > 0) {
        divInput.removeChild(divInput.firstChild);
    }
    //affichage des labels et inputs nécessaire
    for (i = 1; i <= select.value; i++) {
        var item = document.createElement('label');
        var newInput = document.createElement('input');
        item.innerHTML = "<br>nom du Joueur " + i + "<br>";
        newInput.setAttribute('type', 'text')
        newInput.setAttribute('id', 'joueur' + i)
        newInput.innerHTML = "<br>";
        divInput.appendChild(item);
        divInput.appendChild(newInput);
    }
}
select.onchange = afficherNbInput

/**
 * 
 * afficher les inputs au chargement de la page
 */
function inputOnLoad() {

    for (i = 1; i < 3; i++) {
        var item = document.createElement('label');
        var newInput = document.createElement('input');
        item.innerHTML = "<br>nom du Joueur " + i + "<br>";
        newInput.setAttribute('type', 'text')
        newInput.setAttribute('id', 'joueur' + i)
        newInput.innerHTML = "<br>";
        divInput.appendChild(item);
        divInput.appendChild(newInput);
    }
}
window.onload = inputOnLoad;


//ecouteur d'evenement sur le bouton
var sendButton = document.getElementById('envoyer');

/**
 * fonction d'envoi des players vers la bdd
 * @param {*} data 
 */
const insertPost = async function (data) {
    let response = await fetch(urlPost, {
        'method': 'POST',
        'headers': {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(data)
    })

} 


function getValue() {

    console.log(select.value)
    switch (select.value) {
        case "2":
            console.log("cas 2")
            let joueur1 = document.getElementById('joueur1').value
            let joueur2 = document.getElementById('joueur2').value
            insertPost([{
                    name: joueur1,
                    color: 'rouge'
                },
                {
                    name: joueur2,
                    color: 'bleu'
                }
            ])
            break;
        case "3":
            console.log("cas 3")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            let joueur3 = document.getElementById('joueur3').value
            insertPost([{
                    name: joueur1,
                    color: 'rouge'
                },
                {
                    name: joueur2,
                    color: 'bleu'
                },
                {
                    name: joueur3,
                    color: 'vert'
                }
            ])
            break;
        case "4":
            console.log("cas 4")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            let joueur4 = document.getElementById('joueur4').value
            insertPost([{
                    name: joueur1,
                    color: 'rouge'
                },
                {
                    name: joueur2,
                    color: 'bleu'
                },
                {
                    name: joueur3,
                    color: 'vert'
                },
                {
                    name: joueur4,
                    color: 'orange'
                }
            ])
            break;
        case "5":
            console.log("cas 5")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            joueur4 = document.getElementById('joueur4').value
            let joueur5 = document.getElementById('joueur5').value
            insertPost([{
                    name: joueur1,
                    color: 'rouge'
                },
                {
                    name: joueur2,
                    color: 'bleu'
                },
                {
                    name: joueur3,
                    color: 'vert'
                },
                {
                    name: joueur4,
                    color: 'orange'
                },
                {
                    name: joueur5,
                    color: 'marron'
                }
            ])
            break
        case "6":
            console.log("cas 6")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            joueur4 = document.getElementById('joueur4').value
            joueur5 = document.getElementById('joueur5').value
            let joueur6 = document.getElementById('joueur6').value
            insertPost([{
                    name: joueur1,
                    color: 'rouge'
                },
                {
                    name: joueur2,
                    color: 'bleu'
                },
                {
                    name: joueur3,
                    color: 'vert'
                },
                {
                    name: joueur4,
                    color: 'orange'
                },
                {
                    name: joueur5,
                    color: 'marron'
                },
                {
                    name: joueur6,
                    color: 'jaune'
                }
            ])
            break;
    }
}
sendButton.onclick = getValue;


//recuperation de la liste de joueurs dans la bdd
fetch(urlGet)
    .then(function (response) {
        return response.json()
    }).then(function (data) {
        console.log(data)
    });