package cn.wmyskxz.service;

import cn.wmyskxz.mapper.OrderMapper;
import cn.wmyskxz.pojo.Order;
import cn.wmyskxz.pojo.OrderExample;
import cn.wmyskxz.pojo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * OrderService 实现类
 *
 * @author: @我没有三颗心脏
 * @create: 2018-04-29-上午 10:19
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderMapper orderMapper;

	@Autowired
	OrderItemService orderItemService;

	@Override
	public Order get(int id) {
		return orderMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Order> listAll() {
		OrderExample example = new OrderExample();
		return orderMapper.selectByExample(example);
	}

	@Override
	public List<Order> list(Integer user_id, String excludedStatus) {
		OrderExample example = new OrderExample();
		example.or().andUser_idEqualTo(user_id).andStatusNotEqualTo(excludedStatus);
		example.setOrderByClause("id desc");
		return orderMapper.selectByExample(example);
	}

	@Override
	public List<Order> listByUserId(Integer user_id) {
		OrderExample example = new OrderExample();
		example.or().andUser_idEqualTo(user_id);
		return orderMapper.selectByExample(example);
	}

	@Override
	public void update(Order order) {
		orderMapper.updateByPrimaryKey(order);
	}

	@Override
	public void add(Order c) {
		orderMapper.insert(c);
	}

}
