package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private long securityId;

    protected PortfolioSecurity() {

    }

    public PortfolioSecurity(long portfolioId, long securityId) {
        this.portfolioId = portfolioId;
        this.securityId = securityId;
    }

    public long getId() {
        return id;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }
}