package tenders.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tenders.server.model.Tender;

import java.util.List;

@Repository
public interface TenderRepository extends JpaRepository<Tender, String> {
  List<Tender> findAllByFavouriteIsTrue();
  List<Tender> findAllByNameLikeIgnoreCase(String name);
}
