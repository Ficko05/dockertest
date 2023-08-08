package ff.composethisproject.Repository;

import ff.composethisproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, java.lang.Long> {
}
