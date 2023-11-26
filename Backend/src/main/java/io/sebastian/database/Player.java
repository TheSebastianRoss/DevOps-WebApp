package io.sebastian.database;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Player implements Serializable {
	private long id;
	private String name;
	private Team team;
	
	Player() {
		this.name = "Default Name";
	}
	
	Player(String name) {
		this();
		this.name = name;
	}
	
	Player(Team team) {
		this();
		this.team = team;
		team.addPlayer(this);
	}
	
	Player(String name, Team team) {
		this();
		this.name = name;
		this.team = team;
		team.addPlayer(this);
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	public Team getTeam() {
		return this.team;
	}
	
	public void setTeam(Team newTeam) {
		if(this.team != null) {
			this.team.removePlayer(this);
		}
		
		this.team = newTeam;
		
		if(newTeam != null) {
			newTeam.addPlayer(this);
		}
	}
}
