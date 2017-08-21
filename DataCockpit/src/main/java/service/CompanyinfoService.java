package service;

import java.util.List;

import entity.Companyinfo;

public interface CompanyinfoService {
	
	/**
	 * 查询所有公司信息
	 * @return
	 */
	List<Companyinfo> selectAllCompanies();
	
	/**
	 * 根据公司id删除公司信息
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);
	
	/**
	 * 根据公司记录添加公司客户
	 * @param record
	 * @return
	 */
    int insert(Companyinfo record);
    
    /**
     * 动态查询公司信息
     * @param record
     * @return
     */
    int insertSelective(Companyinfo record);
    
    /**
     * 根据公司id查公司信息
     * @param id
     * @return
     */
    Companyinfo selectByPrimaryKey(Integer id);
    
    /**
     * 动态更新公司信息
     * @param id
     * @return
     */
    int updateByPrimaryKeySelective(Companyinfo record);
    
    /**
     * 更新公司信息
     * @param id
     * @return
     */
    int updateByPrimaryKey(Companyinfo record);
	
	
}
