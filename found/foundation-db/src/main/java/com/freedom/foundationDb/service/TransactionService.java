package com.freedom.foundationDb.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.freedom.foundationDb.dao.domain.TTransaction;
import com.freedom.foundationDb.dao.mapper.TTransactionMapper;
import org.springframework.stereotype.Service;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 17:18 2019/10/31
 */
@Service
public class TransactionService extends ServiceImpl<TTransactionMapper, TTransaction> {
}
