package com.finance.www.oauth_server_8050.service;

import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import org.springframework.data.domain.Example;

import java.util.List;

public interface MemeberService{


    long countByExample(MemeberExample example);

    int deleteByExample(MemeberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Memeber record);

    int insertSelective(Memeber record);

    List<Memeber> selectByExample(MemeberExample example);

    Memeber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Memeber record, MemeberExample example);

    int updateByExample(Memeber record, MemeberExample example);

    int updateByPrimaryKeySelective(Memeber record);

    int updateByPrimaryKey(Memeber record);



	Memeber findAllByUsername(String username);




}
