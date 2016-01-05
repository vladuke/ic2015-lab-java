package com.vlad.labs.calculation;

public class Premium {
    private String planId;
    private String type;
    private Double value;
    
    public Premium() {
    }
    
    public Premium(String planId, String type, Double value) {
        this.planId = planId;
        this.type = type;
        this.value = value;
    }
    public String getPlanId() {
        return planId;
    }
    public void setPlanId(String planId) {
        this.planId = planId; 
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public String toString() {
        return "Premium [planId=" + planId + ", type=" + type + ", value=" + value + "]";
    }
}
