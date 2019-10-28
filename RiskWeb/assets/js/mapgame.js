 
document.getElementById('text-circle1').textContent = "8";

document.getElementById('province1').style.fill = "yellow";

var nameTerritoryText = document.getElementById("name-territory-text");

var terr = document.getElementsByClassName('territory')


document.onclick = function afficheNameTerritory(event) {

  event = event || window.event;
  var x = event.target
  var id = event.target.id
  var n = id.includes("province");

    console.log(id);

    if (n = true) {

        switch(id) {

            // L'Ilot d'Axel

            case "province1" :
                    nameTerritoryText.innerHTML = "L'Île des Géants";
                    break;
            case "province2" :
                    nameTerritoryText.innerHTML = "L'Île Mystérieuse";
                    break;
            case "province3" :
                    nameTerritoryText.innerHTML = "L'Île du Tonnerre";
                    break;
            case "province4" :
                    nameTerritoryText.innerHTML = "Le Temple Engloutit";
                    break;

            // Les Cavernes

            case "province73" :
                    nameTerritoryText.innerHTML = "La Caverne des lamentations";
                    break;
            case "province74" :
                    nameTerritoryText.innerHTML = "La Crypte des Oubliés";
                    break;
            case "province75" :
                    nameTerritoryText.innerHTML = "Le Coeur de Pierre";
                    break;
            case "province78" :
                    nameTerritoryText.innerHTML = "La Fosse Sombre";
                    break;
            case "province92" :
                    nameTerritoryText.innerHTML = "Les Profondeurs de Rochenoire";
                    break;
            case "province93" :
                    nameTerritoryText.innerHTML = "Les Mortemines";
                    break;

            // La Champignoneuse

            case "province12" :
                    nameTerritoryText.innerHTML = "La Fôret de Champignons Géants";
                    break;
            case "province13" :
                    nameTerritoryText.innerHTML = "La Valée Fongique";
                    break;
            case "province95" :
                    nameTerritoryText.innerHTML = "La Vallée Champorage";
                    break;
            case "province15" :
                    nameTerritoryText.innerHTML = "Le Bois des Champs Eternels";
                    break;

            // Les Terres de Cristalisées 

            case "province87" :
                    nameTerritoryText.innerHTML = "Les Flèches Argentées";
                    break;
            case "province62" :
                    nameTerritoryText.innerHTML = "Les Terres Pourpres";
                    break;
            case "province61" :
                    nameTerritoryText.innerHTML = "Les Terres Foudroyées";
                    break;
            case "province64" :
                    nameTerritoryText.innerHTML = "Les Tranchantes";
                    break;
            case "province65" :
                    nameTerritoryText.innerHTML = "Le Coeur de Cristal";
                    break;
            case "province63" :
                    nameTerritoryText.innerHTML = "La Couronne Gelée";
                    break;
            case "province94" :
                    nameTerritoryText.innerHTML = "La Citadelle de Glace";
                    break;
            case "province60" :
                    nameTerritoryText.innerHTML = "Les Milles Pointes";
                    break;
            case "province38" :
                    nameTerritoryText.innerHTML = "Les Pics Jumeaux";
                    break;
    
            // Les Marécages

            case "province52" :
                    nameTerritoryText.innerHTML = "Le Sombre Marécage";
                    break;
            case "province56" :
                    nameTerritoryText.innerHTML = "Les Rivages Brisés";
                    break;
            case "province61" :
                    nameTerritoryText.innerHTML = "Les Terres Foudroyées";
                    break;
            case "province59" :
                    nameTerritoryText.innerHTML = "Le Bassin des Regrets";
                    break;
            case "province80" :
                    nameTerritoryText.innerHTML = "Les Marais Hurlant";
                    break;
            case "province89" :
                    nameTerritoryText.innerHTML = "Les Terres Ingrates";
                    break;
            case "province58" :
                    nameTerritoryText.innerHTML = "Les Marais Purrisants";
                    break;
            case "province55" :
                    nameTerritoryText.innerHTML = "Les Tranchantes";
                    break;
        
            // Les Terres Volcaniques

            case "province43" :
                    nameTerritoryText.innerHTML = "Le Coeur de Magma";
                    break;
            case "province70" :
                    nameTerritoryText.innerHTML = "Les Pics Fumants";
                    break;
            case "province69" :
                    nameTerritoryText.innerHTML = "Le Cratére Infernal";
                    break;
            case "province45" :
                    nameTerritoryText.innerHTML = "La Fournaise";
                    break;
            case "province46" :
                    nameTerritoryText.innerHTML = "La Forge des Âmes";
                    break;
            case "province89" :
                    nameTerritoryText.innerHTML = "Les Terres Ingrates";
                    break;
            case "province48" :
                    nameTerritoryText.innerHTML = "Les Serres Rocheuses";
                    break;
            case "province49" :
                    nameTerritoryText.innerHTML = "Les Flèches Ardentes";
                    break;
            case "province51" :
                    nameTerritoryText.innerHTML = "Les Steppes Ardentes";
                    break;
            case "province83" :
                    nameTerritoryText.innerHTML = "Le Sanctuaire du Courage";
                    break;
            case "province42" :
                    nameTerritoryText.innerHTML = "Le Rivage Bouillonant";
                    break;
            case "province91" :
                    nameTerritoryText.innerHTML = "La Citadelle de Feu";
                    break;
            case "province90" :
                    nameTerritoryText.innerHTML = "La Crête de Givrefeu";
                    break;
                default :
                nameTerritoryText.innerHTML = "La Crête de Givrefeu";
                breack;
    
    } 
    
}

};
