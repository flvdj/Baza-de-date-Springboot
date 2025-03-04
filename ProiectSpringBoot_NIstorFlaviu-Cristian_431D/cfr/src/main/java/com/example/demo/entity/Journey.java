package com.example.demo.entity;
import java.sql.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "journey")
public class Journey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idjourney;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional =
			false)
			@JoinColumn(name = "idbranchcfr", nullable = false)
			private BranchCFR branchcfr;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional =
			false)
			@JoinColumn(name = "id_travellers", nullable = false)
			private Travellers travellers;
			@Column(name = "date", nullable = false)
			private Date date;
			@Column(name = "hour")
			private Long hour;
			@Column(name = "ticket")
			private String ticket;
			@Column(name = "clasa")
			private Long clasa;
			@Column(name = "start")
			private String start;
			@Column(name = "destination")
			private String destination;
			
			
			public Journey() {
			}
			public Journey( BranchCFR branchcfr, Travellers travellers, Date date, Long hour, String ticket, Long clasa, String start, String destination) {
			super();
			this.branchcfr = branchcfr;
			this.travellers = travellers;
			this.date = date;
			this.hour = hour;
			this.ticket = ticket;
			this.clasa = clasa;
			this.start = start;
			this.destination = destination;
			}
			public Long getIdjourney() {
			return this.idjourney;
			}
			public void setIdjourney(Long idjourney) {
			this.idjourney = idjourney;
			}
			public BranchCFR getBranchcfr() {
			return this.branchcfr;
			}
			public void setBranchcfr(BranchCFR branchcfr) {
			this.branchcfr = branchcfr;
			}
			public Travellers getTravellers() {
			return this.travellers;
			}
			public void setTravellers(Travellers travellers) {
			this.travellers = travellers;
			}
			public Date getDate() {
			return this.date;
			}
			public void setDate(Date date) {
			this.date = date;
			}
			public Long getHour() {
			return this.hour;
			}
			public void setHour(Long hour) {
			this.hour = hour;
			}
			public String getTicket() {
			return this.ticket;
			}
			public void setTicket(String ticket) {
			this.ticket = ticket;
			}
			public Long getClasa() {
			return this.clasa;	
			}
			public void setClasa(Long clasa) {
			this.clasa = clasa;
			}
			public String getStart() {
			return this.start;
			}
			public void setStart(String start) {
			this.start = start;
			}
			public String getDestination() {
			return this.destination;
			}
			public void setDestination(String destination) {
			this.destination = destination;
			}
			
			
			

}
