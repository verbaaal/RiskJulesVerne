//url liste des players
var urlGet = "http://localhost:8080/getPlayer";

// recuperation de la liste de joueurs dans la bdd
var data =fetch(urlGet)
    .then(function (response) {
        return response.json()
    }).then(function (data) {
        return data[0].name
    })
// var nbjoueur = document.getElementById('nbPlayer');
// nbjoueur.innerHTML += data.length;
// var test;
// const getPlayer = async function () {
//     try {
//         let response = await fetch(urlGet)
//         if (response.ok) {
//             let datas = await response.json()

//             console.log(datas)
//         } else {
//             console.error('Retour du serveur : ', response.status)
//         }
//     } catch (e){
//         console.log(e)
//     }
// }

