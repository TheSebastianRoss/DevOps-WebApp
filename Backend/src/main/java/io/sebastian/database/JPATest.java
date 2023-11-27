package io.sebastian.database;

import java.util.List;
import javax.persistence.*;

public class JPATest {
	public static void main(String[] args) {
		JPATest.performJPA();
	}
	
	public static void performJPA() {
		Player player1 = new Player();
		player1.setName("Wyatt Mason");
		
		Player player2 = new Player();
		player2.setName("Wyatt Dovenpart");
		
		Team team1 = new Team();
		team1.setName("LA Unlimited Tacos");
		team1.addPlayer(player1);
		team1.addPlayer(player2);

		EntityManagerFactory leagueFactory = Persistence.createEntityManagerFactory("league");
		EntityManager league = leagueFactory.createEntityManager();
		try {
			EntityTransaction transaction = league.getTransaction();
			transaction.begin();

			league.persist(player1);
			league.persist(player2);
			league.persist(team1);
			
			transaction.commit();

			Query queryPlayers = league.createQuery("SELECT p FROM Player p");
			@SuppressWarnings("unchecked")
			List<Player> queryPlayersResults = queryPlayers.getResultList();
			
			Query queryTeams = league.createQuery("SELECT t FROM Team t");
			@SuppressWarnings("unchecked")
			List<Team> queryTeamsResults = queryTeams.getResultList();
			
			System.out.println("Players:");
			for(Player player: queryPlayersResults) {
				System.out.println(player.getName());
			}
			System.out.println("\nTeams:");
			for(Team team: queryTeamsResults) {
				System.out.println(team.getName());
			}
			System.out.println("");
		} finally {
			league.close();
			leagueFactory.close();
		}
	}
}
