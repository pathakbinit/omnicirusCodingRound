package com.omnicirus.domain;

import java.util.Set;

public class OrderDomain {
    String username;
    String emailId;
    String address;
    Set<ItemDomain> itemDomain;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<ItemDomain> getItemDomain() {
        return itemDomain;
    }

    public void setItemDomain(Set<ItemDomain> itemDomain) {
        this.itemDomain = itemDomain;
    }
}

