import com.admin.model.StatisticModel;
public interface StatisticService {
  List<StatisticModel> getMonthlyStatistic(Integer storeId) throws Exception;
}
