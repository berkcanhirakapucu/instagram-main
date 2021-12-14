package ibmtal.com.instagram.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="profıle")
public class Profıle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="profılphoto")
	private String profılphoto;
	@Column(name="surname")
	private String surname;
	@Column(name="mail")
	private String mail;
	public Profıle() {
		super();
	}
	public Profıle(int id, String name, String gender, String profılphoto, String surname, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.profılphoto = profılphoto;
		this.surname = surname;
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfılphoto() {
		return profılphoto;
	}
	public void setProfılphoto(String profılphoto) {
		this.profılphoto = profılphoto;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;

	}
}
