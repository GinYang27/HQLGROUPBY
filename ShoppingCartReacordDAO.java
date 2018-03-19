import java.sql.Timestamp;
import java.util.List;

public interface ShoppingCartRecordDAO extends BaseHibernateDAO {
  List<Object[]> getCountRecordsGroupByMonth();
}
