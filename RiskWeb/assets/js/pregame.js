//url liste des players
var urlPlayers = "http://localhost:8080/getPlayer";
var urlTerritorries = "http://localhost:8080/getTerritory"

// recuperation de la liste de joueurs dans la bdd
let players
fetch(urlPlayers)
    .then(function (response) {
        return response.json()
    }).then(function (players) {

        let boxPlayer = document.getElementById('box-list-player');
        for (let i = 0; i < players.length; i++) {
            //creation des éléments de liste player
            let ulPlayer = document.createElement('ul');
            let namePlayer = document.createElement('li');
            let nbTerrPlayer = document.createElement('li');
            let nbContPlayer = document.createElement('li')
            //attibution des id
            ulPlayer.setAttribute('id', 'ul-Players' + 1);
            namePlayer.setAttribute('id', 'j' + (i + 1));
            nbTerrPlayer.setAttribute('id', 'nbterrJ' + (i + 1));
            nbContPlayer.setAttribute('id', 'nbContJ' + (i + 1))

            //ajout contenu
            //nom du joueur
            namePlayer.innerHTML = players[i].name;
            //nombre de territoires du joueur
            if (players[i].territoriesPlayer != null) {
                nbTerrPlayer.innerHTML = players[i].territoriesPlayer
            } else {
                nbTerrPlayer.innerHTML = 0;
            }
            nbTerrPlayer.innerHTML += " territoire(s)";
            //nombre de continent du joueur
            if (players[i].continentsPlayer != null) {
                nbContPlayer.innerHTML = players[i].continentsPlayer
            } else {
                nbContPlayer.innerHTML = 0;
            }
            nbContPlayer.innerHTML += " continent(s)"

            //insertion du contenu
            boxPlayer.appendChild(ulPlayer)
            ulPlayer.appendChild(namePlayer)
            ulPlayer.appendChild(nbTerrPlayer)
            ulPlayer.appendChild(nbContPlayer)
        }
    })
fetch(urlTerritorries)
.then(function (response) {
    if(response.ok){
        console.log('message : liste des territoires recupérée')
        return response.json()
    }
    
}).then(function (territories) {
    console.log(territories[0])

})