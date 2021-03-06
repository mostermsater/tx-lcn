package com.lorne.tx.mq.service.impl;

import com.lorne.tx.service.TxManagerService;
import com.lorne.tx.mq.model.TxGroup;
import com.lorne.tx.mq.service.MQTxManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lorne on 2017/6/7.
 */
@Service
public class MQTxManagerServiceImpl implements MQTxManagerService {


    @Autowired
    private TxManagerService txManagerService;


    @Override
    public TxGroup createTransactionGroup(String taskId,String modelName) {
        return txManagerService.createTransactionGroup(taskId,modelName);
    }

    @Override
    public TxGroup addTransactionGroup(String groupId, String taskId,int isGroup, String modelName) {
        return txManagerService.addTransactionGroup(groupId, taskId,isGroup, modelName);
    }

    @Override
    public boolean closeTransactionGroup(String groupId,int state) {
        return txManagerService.closeTransactionGroup(groupId,state);
    }

    @Override
    public boolean checkTransactionGroup(String groupId, String taskId) {
        return txManagerService.checkTransactionGroup(groupId, taskId);
    }


    @Override
    public int getDelayTime() {
        return txManagerService.getDelayTime();
    }
}
