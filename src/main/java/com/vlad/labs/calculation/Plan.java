package com.vlad.labs.calculation;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    private String id;
    private String applicantId;
    private String category;
    private Integer copay, coinsurance, deductible;
    private Boolean nonEssentialBenefits;
    private String msg;
    
    private List<Premium> premiums;
    
    public Plan() {
        premiums = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getApplicantId() {
        return applicantId;
    }
    
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCopay() {
        return copay;
    }

    public void setCopay(Integer copay) {
        this.copay = copay;
    }

    public Integer getCoinsurance() {
        return coinsurance;
    }

    public void setCoinsurance(Integer coinsurance) {
        this.coinsurance = coinsurance;
    }

    public Integer getDeductible() {
        return deductible;
    }

    public void setDeductible(Integer deductible) {
        this.deductible = deductible;
    }

    public Boolean getNonEssentialBenefits() {
        return nonEssentialBenefits;
    }

    public void setNonEssentialBenefit(Boolean nonEssentialBenefit) {
        this.nonEssentialBenefits = nonEssentialBenefit;
    }
    
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public List<Premium> getPremiums() {
        return premiums;
    }
    
    public String toString() {
        return "Plan [id=" + id + ", category=" + category + ", copay=" + copay + ", coinsurance=" + coinsurance
                + ", deductible=" + deductible + ", nonEssentialBenefits=" + nonEssentialBenefits + ", premiums="
                + premiums + "]";
    }
    
}
