import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.ShoppingCartRecordDAO;
import com.admin.entity.ShoppingCartRecord;

@Repository
@Transactional
public class ShoppingCartRecordDAOImpl extends BaseHibernateDAOImpl implements ShoppingCartRecordDAO {
  @Override
	public List<Object[]> getCountRecordsGroupByMonth() {
		return getSession()
				.createQuery("SELECT count(*), MONTH(scr.createDate), YEAR(scr.createDate) FROM ShoppingCartRecord as scr " + "LEFT JOIN scr.massageServe as ms "
				+ "GROUP BY YEAR(scr.createDate), MONTH(scr.createDate) "
				+ "ORDER BY scr.createDate desc").setReadOnly(true).list();
	}
}
