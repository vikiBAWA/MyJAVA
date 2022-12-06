package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="travel_detail")

public class TravelDetail {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    
	    //variables
	    @Column(name="id")
	    private int id;
	    
	    @Column(name="company_name")
	    private String companyName;
	    
	    @Column(name="type")
	    private String type;
	    
	    @Column(name="model_no")
	    private int modelNo;
	    
	    @OneToOne(mappedBy="instructorDetail", cascade=CascadeType.ALL)
	    private Travel instructor;
	    
	    //default constructor
	    public TravelDetail() {
	        
	    }

	 
	    //Parameterized Constructor
	    public TravelDetail(String companyName, String type, int modelNo) {
			super();
			this.companyName = companyName;
			this.type = type;
			this.modelNo = modelNo;
		}


		//getter & setter


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCompanyName() {
			return companyName;
		}


		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public int getModelNo() {
			return modelNo;
		}


		public void setModelNo(int modelNo) {
			this.modelNo = modelNo;
		}


		public Travel getInstructor() {
			return instructor;
		}


		public void setInstructor(Travel instructor) {
			this.instructor = instructor;
		}


		@Override
		public String toString() {
			return "TravelDetail [id=" + id + ", companyName=" + companyName + ", type=" + type + ", modelNo=" + modelNo
					+ ", instructor=" + instructor + "]";
		}
		
		
}
