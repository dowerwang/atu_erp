package com.atu.erp.dao.impl;


import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.atu.erp.dao.PaymentInfoDao;
import com.atu.erp.domain.PaymentInfo;
import com.atu.erp.domain.query.PaymentInfoQuery;

public class PaymentInfoDaoImpl extends SqlMapClientTemplate implements PaymentInfoDao {

	@Override
	public Integer insert(PaymentInfo paymentInfo) {
		return (Integer)insert("PaymentInfo.insert",paymentInfo);
	}

	@Override
	public List<PaymentInfo> selectByCondition(PaymentInfoQuery paymentInfoQuery) {
		return (List<PaymentInfo>)queryForList("PaymentInfo.selectByCondition",paymentInfoQuery);
	}


}
