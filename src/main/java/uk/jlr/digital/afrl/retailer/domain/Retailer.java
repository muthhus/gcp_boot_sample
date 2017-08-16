package uk.jlr.digital.afrl.retailer.domain;

import uk.jlr.digital.afrl.common.domain.AuditableDomainObject;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@Entity
@Table(name = "retailer")
public class Retailer extends AuditableDomainObject {
	
	@Column(name="name", length=45)
	private String name;
	
	@Column(name="retailer_code", length=15)
	private String retailerCode;
	
	@Column(name="created_by", nullable=false, length=99)
	@CreatedBy
	private String createdBy;
	
	
	@Column(name="created_at", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;


	@Override
	public String toString() {
		return name + "-" + retailerCode;
	}
	
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retailer", cascade = CascadeType.ALL)
//    private Set<Vehicle> vehicle = new HashSet<Vehicle>();
	

}
