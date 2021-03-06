package com.yc.Service; 
import java.util.List;

import com.yc.Entity.YcGoods;
import com.yc.Tool.ISqlServer;
import com.yc.Tool.Pager; 
/** 
* YcGoods服务接口层 
* Auther:FENG 
*/ 
public interface IYcGoodsService extends ISqlServer<YcGoods> {  
	/**
	 * 根据运单号获取指定的货物信息
	 * Author:FENG
	 * 2016年6月16日
	 * @return
	 */
	public List<YcGoods> getGoodsByDeliveryNo(String dNo);
	/**
	 * 根据指定经销商和指定云仓获得的库区编号去查询所关联的货物
	 * Author:FENG
	 * 2016年6月17日
	 * @param goods
	 * @return
	 */
	public List<YcGoods> getGoodsByDealerId(String dealerId,String branchNo,String outStorageStatus,String goodIds);
	/**
	 * 根据指定经销商和指定云仓获得的库区编号去查询所关联的所有货物
	 * Author:FENG
	 * 2016年6月17日
	 * @param goods
	 * @return
	 */
	public Pager<YcGoods> getPageGoodsByDealerId(Pager<YcGoods> pager,String dealerId);
	
	/**
	 * 根据货物id修改货物出库状态为已出库
	 * Author:FENG
	 * 2016年6月23日
	 * @param wayBillNo
	 * @return
	 */
	public Integer modOutStatusByNo(Integer goodId);
}
