package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DBUSER database table.
 * 
 */
@Entity
@Table(name="DBUSER", schema="FACKFACEBOOK")
@NamedQueries({
	@NamedQuery(name="Dbuser.findAll", query="SELECT d FROM Dbuser d"),
	@NamedQuery(name="Dbuser.findUserByEmailAndPassword", query="SELECT d FROM Dbuser d where d.email = :email and d.password = :password"),
	@NamedQuery(name="Dbuser.findUserByUserid", query="SELECT d FROM Dbuser d where d.userid = :userid")
})
public class Dbuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, precision=10)
	private long userid;

	@Column(length=100)
	private String address;

	@Column(length=60)
	private String email;

	@Column(length=60)
	private String favcolor;

	@Column(length=60)
	private String favmovie;

	@Column(length=60)
	private String favsong;

	@Column(length=60)
	private String name;

	@Column(length=60)
	private String nickname;

	@Column(length=60)
	private String password;

	public Dbuser() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavcolor() {
		return this.favcolor;
	}

	public void setFavcolor(String favcolor) {
		this.favcolor = favcolor;
	}

	public String getFavmovie() {
		return this.favmovie;
	}

	public void setFavmovie(String favmovie) {
		this.favmovie = favmovie;
	}

	public String getFavsong() {
		return this.favsong;
	}

	public void setFavsong(String favsong) {
		this.favsong = favsong;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}