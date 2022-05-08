import com.yeop.boardTimeout.domain.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"}
)
public class ConnectionTest {

    @Autowired
    SqlSession sqlSession;

    @Test
    public void connectionTest(){
        System.out.println(sqlSession);
    }

    @Test
    public void create(){

    }
}
