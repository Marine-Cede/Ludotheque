package fr.eni.ludotheque.Repository;

import fr.eni.ludotheque.bo.AdresseBo;
import fr.eni.ludotheque.bo.GenreBo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreBo, Integer> {
}
