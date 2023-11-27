package io.sebastian.database;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Team implements Serializable{
	private Long id;
	private String name;
	private Collection<Player> players;
	
	public Team() {
		this.name = "Default Team";
		this.players = new HashSet<Player>(); // Why isn't this a list? Order is important, right?
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "team")
	public Collection<Player> getPlayers() {
		return this.players;
	}
	
	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}
	
	public void addPlayer(Player player) {
		if(!players.contains(player)) {
			players.add(player);
		}
	}
	
	public void removePlayer(Player player) {
		players.remove(player);
	}
}
