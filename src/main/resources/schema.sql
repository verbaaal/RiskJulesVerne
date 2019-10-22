CREATE TABLE continent

(
 id_cont serial NOT NULL ,

 name_cont varchar(45) DEFAULT NULL,

 bonus_cont INTEGER,


 PRIMARY KEY (id_cont)

);

CREATE TABLE territory

(
id_terr serial NOT NULL ,

 name_terr varchar(45) DEFAULT NULL,

 cont_id INTEGER,

 player_owner INTEGER DEFAULT NULL,

 pawn_count INTEGER DEFAULT NULL,


 PRIMARY KEY (id_terr),
 FOREIGN KEY (cont_id) REFERENCES continent (id_cont)

);

CREATE TABLE card_territory

(

 id_card serial NOT NULL ,

 card_type varchar(45) DEFAULT NULL,

 territory_id INTEGER,


 PRIMARY KEY (id_card),
 FOREIGN KEY (territory_id) REFERENCES territory (id_terr)

);

CREATE TABLE player

(

 id_player serial NOT NULL ,

 name_player varchar(45) NOT NULL,

 pawn_color varchar(45) NOT NULL,

 territory_card_id INTEGER,


 PRIMARY KEY (id_player),
 FOREIGN KEY (territory_card_id) REFERENCES card_territory (id_card)

);
