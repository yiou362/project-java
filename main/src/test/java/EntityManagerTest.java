import com.yale.projectj.AppApplication;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Yale
 */
@SpringBootTest(classes = AppApplication.class)
public class EntityManagerTest {
    @PersistenceContext
    EntityManager entityManager;
    @Test
    public void getUser() {
        List<Tuple> res = entityManager.createNativeQuery("select * from tb_user", Tuple.class).getResultList();
        for (Tuple ele : res) {
            System.out.println(ele.get(0));
            System.out.println(ele.get(1));
            System.out.println(ele.get(2));
        }
    }
}
