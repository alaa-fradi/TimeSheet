//package tn.esprit.entities;
//
//import java.io.Serializable;
//
//import java.util.List;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="missionexterne")
//public class MissionExterne implements Serializable{
//
//	private String emailFacturation;
//	
//	private String tauxJournalierMoyen;
//	
//	@OneToOne
//	private Mission mission ;
//
//	public String getEmailFacturation() {
//		return emailFacturation;
//	}
//
//	public void setEmailFacturation(String emailFacturation) {
//		this.emailFacturation = emailFacturation;
//	}
//
//	public String getTauxJournalierMoyen() {
//		return tauxJournalierMoyen;
//	}
//
//	public void setTauxJournalierMoyen(String tauxJournalierMoyen) {
//		this.tauxJournalierMoyen = tauxJournalierMoyen;
//	}
//
//	public Mission getMission() {
//		return mission;
//	}
//
//	public void setMission(Mission mission) {
//		this.mission = mission;
//	}
//}
