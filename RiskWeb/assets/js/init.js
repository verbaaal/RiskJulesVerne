//url liste des players
var urlDelete = "http://localhost:8080/deleteAll";
//url post list de players
var urlPost = "http://localhost:8080/addPlayers";
//menu select
var select = document.getElementById('nbJoueurs');
//cible la div des inputs a insérer
var divInput = document.getElementById('inputPlayers')


//suppression de la liste de joueurs dans la bdd
const deleteAll = async function (data) {
   let response = await fetch(urlDelete, {
       'method': 'DELETE',
   })
   if(response.ok){
       console.log("message : la liste des joueurs a bien été réinitialisée")
   }else{
       console.log('erreur dans la suppression de la liste des joueurs')
   }
}
deleteAll();

/**
 * modifie l'affichage du nombre des inputs 
 * 
 */
function afficherNbInput() {

    //reinitialisation des inputs affichés
    while (divInput.children.length > 0) {
        divInput.removeChild(divInput.firstChild);
    }
    //creation et affichage des labels / inputs / div nécessaire
    for (i = 1; i <= select.value; i++) {
        //creation des éléments
        var item = document.createElement('label');
        var newInput = document.createElement('input');
        var divColor = document.createElement('div');
        //modification des éléments
        item.innerHTML = "<br>nom du Joueur " + i + "<br>";
        newInput.setAttribute('type', 'text')
        newInput.setAttribute('id', 'joueur' + i)
        newInput.innerHTML = "<br>";
        divColor.setAttribute("class", 'joueur' + i)
        //insertion des éléments
        divInput.appendChild(item);
        divInput.appendChild(divColor);
        divInput.appendChild(newInput);
    }
}
select.onchange = afficherNbInput

/**
 * afficher les inputs au chargement de la page
 * 
 */
function inputOnLoad() {
    //creation et affichage des labels / inputs / div nécessaire
    for (i = 1; i < 3; i++) {
        //creation des éléments
        var item = document.createElement('label');
        var newInput = document.createElement('input');
        var divColor = document.createElement('div');
        //modification des éléments
        item.innerHTML = "<br>Nom du Joueur " + i + "<br>";
        newInput.setAttribute('type', 'text')
        newInput.setAttribute('id', 'joueur' + i)
        newInput.innerHTML = "<br>";
        divColor.setAttribute("class", 'joueur' + i)
        //insertion des éléments
        divInput.appendChild(item);
        divInput.appendChild(divColor);
        divInput.appendChild(newInput);
    }
}
window.onload = inputOnLoad;





/**
 * fonction d'envoi des players vers la bdd
 * @param {*} data 
 * 
 */
const insertPost = async function (data) {
    let response = await fetch(urlPost, {
        'method': 'POST',
        'headers': {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(data)

    })
    // console.log(response)
    //verification de la reponse du serveur
    if (response.ok) {
        nextPage();
    } else {
        console.log("ho nooo")
    }
}


/**
 * redirection vers page de jeux
 * 
 */
function getNextPage() {
    document.location.href = "mapgame.html"
}
/**
 * declenchement de la fonction getNextPage sous 1s
 * 
 */
function nextPage() {
    setInterval(getNextPage, 1000);
}

// cible le bouton d'envoi
var sendButton = document.getElementById('envoyer');

/**
 * envoi les informations des joueurs selon le nombre de joueurs choisit 
 *  
 */
function postValue() {
    //init variables
    var joueur1 = "";
    var joueur2 = "";
    var joueur3 = "";
    var joueur4 = "";
    var joueur5 = "";
    var joueur6 = "";
    // console.log(select.value)

    //recuperation du nombre de joueurs via le select
    switch (select.value) {

        case "2":
            // console.log("cas 2")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
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
            // console.log("cas 3")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
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
            // console.log("cas 4")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            joueur4 = document.getElementById('joueur4').value
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
            // console.log("cas 5")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            joueur4 = document.getElementById('joueur4').value
            joueur5 = document.getElementById('joueur5').value
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
            // console.log("cas 6")
            joueur1 = document.getElementById('joueur1').value
            joueur2 = document.getElementById('joueur2').value
            joueur3 = document.getElementById('joueur3').value
            joueur4 = document.getElementById('joueur4').value
            joueur5 = document.getElementById('joueur5').value
            joueur6 = document.getElementById('joueur6').value
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
//au click on envoi les données au serveur
sendButton.onclick = postValue;

// Modal system
var btnMenu = document.getElementById("btn");
var title = document.getElementById("title");

var btnMenu = document.getElementById("btn");
var modalPlayers = document.getElementById("modal-players");
var modalMenuPrincipal = document.getElementById("menuPrincipal");
var btnJouer = document.getElementById("btn-jouer");

var iconesound = document.getElementById("logo-volume-off");

// Clique du Bouton Jouer
function funcbtnJouer() {
    btnMenu.style.display = "none";
    modalPlayers.style.display = "flex";
    iconesound.style.display = "none";
}

function playMusics(){


    if (iconesound.classList == "fas fa-volume-off") {
        music2.volume=0.5;
        document.getElementById("music1").play();
        document.getElementById("music2").play();
        iconesound.classList = "fas fa-volume-up";
    } else if (iconesound.classList == "fas fa-volume-up"){
        iconesound.classList = "fas fa-volume-off";
        document.getElementById("music1").pause();
        document.getElementById("music2").pause();
    }
}
var audio = document.getElementsByTagName("audio")

function stopPlayHTMLSound() {
    document.getElementById("snare").load();
    document.getElementById("snare").play();
  }
