//url liste des players
var urlPlayers = "http://localhost:8080/getPlayer";

// recuperation de la liste de joueurs dans la bdd
let players
fetch(urlPlayers)
    .then(function (response) {
        return response.json()
    }).then(function (players) {
        var boxPlayer = document.getElementById('box-list-player');
        console.log(players)
    })






