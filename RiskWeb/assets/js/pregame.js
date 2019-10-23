//url liste des players
var urlGet = "http://localhost:8080/getPlayer";

//recuperation de la liste de joueurs dans la bdd
fetch(urlGet)
    .then(function (response) {
        return response.json()
    }).then(function (data) {
        console.log(data)
    });