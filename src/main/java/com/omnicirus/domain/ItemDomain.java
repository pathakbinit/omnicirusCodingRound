package com.omnicirus.domain;

public class ItemDomain {
    long productId;
    int reqdQuantity;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getReqdQuantity() {
        return reqdQuantity;
    }

    public void setReqdQuantity(int reqdQuantity) {
        this.reqdQuantity = reqdQuantity;
    }
}

