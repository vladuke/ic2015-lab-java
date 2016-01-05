package com.vlad.labs.calculation;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Body;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class CalculationService {

    
    public List<DBObject> calcPremiums(@Body Plan plan) {
        System.out.println("CalculationService.calcPremiums()");
        System.out.println(plan);
        List<DBObject> converted = new ArrayList<>();
        for(int idx = 1; idx < 4; idx++) {
            Premium premium = new Premium(plan.getId(), "type" + idx, idx * 10.0);
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
