package com.vlad.labs.calculation;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Body;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class CalculationService {
    
    public List<DBObject> calcPremiums(@Body Plan plan) throws InterruptedException {
        System.out.println("CalculationService.calcPremiums()");
        System.out.println(plan);
        Thread.sleep(10000);
        List<DBObject> converted = new ArrayList<>();
        
        double basePremium = (plan.getCopay() * 9.0) + (plan.getDeductible() / 12.0) + (plan.getCoinsurance() * 0.5);
        for(int idx = 1; idx < 4; idx++) {
            Premium premium = new Premium(plan.getId(), "type" + idx, basePremium * idx);
            plan.getPremiums().add(premium);
            DBObject dbObj = new BasicDBObject();
            dbObj.put("planId", new ObjectId(premium.getPlanId()));
            dbObj.put("type", premium.getType());
            dbObj.put("value", premium.getValue());
            converted.add(dbObj);
        }
        return converted;
    }
}
