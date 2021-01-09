package com.srivish.shanti.testAngularJS2.dto;

import java.sql.Date;

public class AJSGroup {
	String adGroupDN;
	String sqlFilter;
	int adDynamicGroupCriteriaPk;
	String owner;
	String description;
	Date lastModifiedDate;
	String lastModifiedBy;

	public String getAdGroupDN() {
		return adGroupDN;
	}
	public void setAdGroupDN(String adGroupDN) {
		this.adGroupDN = adGroupDN;
	}
	public String getSqlFilter() {
		return sqlFilter;
	}
	public void setSqlFilter(String sqlFilter) {
		this.sqlFilter = sqlFilter;
	}

	public int getAdDynamicGroupCriteriaPk() {
		return adDynamicGroupCriteriaPk;
	}
	public void setAdDynamicGroupCriteriaPk(int adDynamicGroupCriteriaPk) {
		this.adDynamicGroupCriteriaPk = adDynamicGroupCriteriaPk;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	
}
