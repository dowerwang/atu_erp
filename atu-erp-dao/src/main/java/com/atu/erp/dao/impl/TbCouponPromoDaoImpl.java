package com.atu.erp.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.atu.erp.dao.TbCouponPromoDao;
import com.atu.erp.domain.TbCouponPromo;
import com.atu.erp.domain.query.TbCouponPromoQuery;

public class TbCouponPromoDaoImpl extends SqlMapClientTemplate implements
		TbCouponPromoDao {

	@Override
	public Integer insert(TbCouponPromo TbCouponPromo) {
		return (Integer)insert("TbCouponPromo.insert",TbCouponPromo);
	}

	@Override
	public void modify(TbCouponPromo TbCouponPromo) {
		update("TbCouponPromo.updateByPrimaryKey",TbCouponPromo);
	}

	@Override
	public TbCouponPromo selectByCouponPromoId(int couponPromoId) {
		return (TbCouponPromo)queryForObject("TbCouponPromo.selectByPrimaryKey",couponPromoId);
	}

	@Override
	public int countByCondition(TbCouponPromoQuery TbCouponPromoQuery) {
		return (Integer)queryForObject("TbCouponPromo.countByTbCouponPromoCondition",TbCouponPromoQuery);
	}

	@Override
	public List<TbCouponPromo> selectByCondition(TbCouponPromoQuery TbCouponPromoQuery) {
		return (List<TbCouponPromo>)queryForList("TbCouponPromo.selectByTbCouponPromoCondition",TbCouponPromoQuery);
	}

	@Override
	public List<TbCouponPromo> selectByConditionForPage(TbCouponPromoQuery TbCouponPromoQuery) {
		return (List<TbCouponPromo>)queryForList("TbCouponPromo.selectByTbCouponPromoConditionForPage",TbCouponPromoQuery);
	}

}
