import com.kodilla.jdbc.DbManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        Assertions.assertNotNull(dbManager.getConnection());
    }
}
