package com.lsm.trip.mappers;

import com.lsm.trip.dto.OrderScane;
import com.lsm.trip.dto.PageHelpPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lv on 2017/5/8.
 */
public interface OrderScaneMapper {
    void addOrderScane(OrderScane orderScane)throws Exception;
    void updateOrderScane(OrderScane orderScane)throws Exception;
    //通过游客ID和景点ID查询预约
    OrderScane getOrderScaneBySidYkid(OrderScane orderScane)throws Exception;
    //通过地主ID和状态查询预约
    List<OrderScane> getOrderScaneByDzidStatus(@Param("uid") Integer uid)throws Exception;
    //更新预约状态
    void updateOrderStatus(OrderScane orderScane)throws Exception;
    //查询状态为1,2,4的预约条数
    Integer count(@Param("dzid") Integer dzid)throws Exception;
    //分页查询状态为1,2,4的预约
    List<OrderScane> getOrderScaneByPage(PageHelpPojo<Integer> pageHelpPojo)throws Exception;
    //查询所有定单位0的订单
    List<OrderScane> gerOrderScanes()throws Exception;

    //查询用户的动态消息
    List<OrderScane> getOrderScaneByOidandIsread(@Param("oid") Integer oid)throws Exception;
    //通过预约ID查询预约
    OrderScane getOrderScaneByOid(@Param("oid") Integer oid)throws Exception;
    //修改预约
    void updateIsRead(OrderScane orderScane)throws Exception;
    //通过游客ID查询预约
    List<OrderScane> getOrderScaneByykId(PageHelpPojo pageHelpPojo)throws Exception;
    //通过游客ID查询预约条数
    Integer countByykid(@Param("ykid") Integer ykid)throws Exception;
}
