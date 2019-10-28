//url liste des players
var urlPlayers = "http://localhost:8080/getPlayer";
var urlTerritorries = "http://localhost:8080/getTerritory"

// recuperation de la liste de joueurs dans la bdd
let players
fetch(urlPlayers)
    .then(function (response) {
        return response.json()
    }).then(function (players) {

        let boxPlayer = document.getElementById('container-player');
        for (let i = 0; i < players.length; i++) {
            //creation des éléments de liste player
            let divPlayer = document.createElement('div');
            let namePlayer = document.createElement('h3');
            let nbTerrPlayer = document.createElement('span');
            let br= document.createElement('br')
            let nbContPlayer = document.createElement('span')
            //attibution des id
            divPlayer.setAttribute('id', 'box' + (i+1));
            divPlayer.setAttribute('class', 'box col-12 m-3')
            namePlayer.setAttribute('id', 'j' + (i + 1));
            nbTerrPlayer.setAttribute('id', 'nbterr');
            nbContPlayer.setAttribute('id', 'nbcont')

            //ajout contenu
            //nom du joueur
            namePlayer.innerHTML = players[i].name;
            //nombre de territoires du joueur
            if (players[i].territoriesPlayer != null) {
                nbTerrPlayer.innerHTML = players[i].territoriesPlayer
            } else {
                nbTerrPlayer.innerHTML = 0;
            }
            nbTerrPlayer.innerHTML += " territoire(s) conquis";
            //nombre de continent du joueur
            if (players[i].continentsPlayer != null) {
                nbContPlayer.innerHTML = players[i].continentsPlayer
            } else {
                nbContPlayer.innerHTML = 0;
            }
            nbContPlayer.innerHTML += " continent(s) conquis";

            //insertion du contenu
            boxPlayer.appendChild(divPlayer)
            divPlayer.appendChild(namePlayer)
            divPlayer.appendChild(nbTerrPlayer)
            divPlayer.appendChild(br);
            divPlayer.appendChild(nbContPlayer)
        }
    })
fetch(urlTerritorries)
.then(function (response) {
    if(response.ok){
        console.log('message : liste des territoires recupérée')
        return response.json()
    }
    
}).then(function (territories) {
    console.log(territories)

})