
@Service
@Transactional
@Lazy(false)
@EnableScheduling
public class StatisticServiceImpl implements StatisticService {
@Autowired
	ShoppingCartRecordDAO shoppingCartRecordDAO;
  
  @Override
	public List<StatisticModel> getMonthlyStatistic(Integer storeId) throws Exception {

		List<Object[]> results = shoppingCartRecordDAO.getCountRecordsGroupByMonth();
		for(Object[] o: results) {
			System.out.println(o[0]);
		}
    System.out.println(Calendar.getInstance().get(Calendar.MONTH) - 3);
		System.out.println(DateUtil.formatMonth(String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1)));
		return null;
	}
}
