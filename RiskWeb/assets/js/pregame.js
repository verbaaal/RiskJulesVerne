//url liste des players
var urlPlayers = "http://localhost:8080/getPlayer";

// recuperation de la liste de joueurs dans la bdd
let players
fetch(urlPlayers)
    .then(function (response) {
        return response.json()
    }).then(function (players) {
        var nbjoueur = document.getElementById('nbPlayer');
        nbjoueur.innerHTML += players.length;
    })

// var test;
// let players;
// const getPlayer = async function () {
//     try {
//         let response = await fetch(urlGet)
//         if (response.ok) {
//             players = response.json()
//         } else {
//             console.error('Retour du serveur : ', response.status)
//         }
//     } catch (e){
//         console.log(e)
//     }
// }
// getPlayer(); 
// console.log(players)





