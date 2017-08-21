package mapper;

import java.util.List;

import entity.Companyinfo;

public interface CompanyinfoMapper {
	
	List<Companyinfo> selectAllCompanies();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Companyinfo record);

    int insertSelective(Companyinfo record);

    Companyinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Companyinfo record);

    int updateByPrimaryKey(Companyinfo record);
}