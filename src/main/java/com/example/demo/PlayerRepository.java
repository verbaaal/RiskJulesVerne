package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface PlayerRepository extends JpaRepository<Integer, Long> {

	Player save(Player player);
=======
public interface PlayerRepository extends JpaRepository<Player, Integer> {
>>>>>>> c785a33720f05785d1ff10791eb7829fc659696f
	
}
