package com.shav.therottengame;

import java.util.Calendar;
import java.util.Random;

public class Actors {

	public static final String[] actorsList = {
		"Aaron Paul",
		"Aaron Taylor-Johnson",
		"Abigail Klein",
		"Adam Sandler",
		"Andrew Garfield",
		"Andrew Scott",
		"Ansel Elgort",
		"Anthony Hopkins",
		"Anthony Mackie",
		"Bill Barretta",
		"Bill Milner",
		"Bobby Cannavale",
		"Brad Pitt",
		"Brenton Thwaites",
		"Bryan Cranston",
		"Cameron Diaz",
		"Carlo Rota",
		"Chris Cooper",
		"Chris Evans",
		"Christopher Mintz-Plasse",
		"Dane DeHaan",
		"Dave Franco",
		"Dave Sheridan",
		"David A.R. White",
		"David Belle",
		"David Strathairn",
		"Dean Cain",
		"Denis Leary",
		"Dominic Cooper",
		"Drew Barrymore",
		"Dustin Hoffman",
		"Elise Vargas",
		"Elizabeth Olsen",
		"Ellen Burstyn",
		"Emily Watson",
		"Emma Stone",
		"Essence Atkins",
		"Frank Langella",
		"Gabriel Iglesias",
		"Gouchy Boy",
		"Gugu Mbatha-Raw",
		"Imogen Poots",
		"Jack Reynor",
		"Jaime Pressly",
		"James Lafferty",
		"Jamie Foxx",
		"Jennifer Connelly",
		"Jennifer Garner",
		"Joel McHale",
		"John Leguizamo",
		"Johnny Depp",
		"Jon Favreau",
		"Karen Gillan",
		"Katee Sackhoff",
		"Kate Upton",
		"Kate Winslet",
		"Ken Watanabe",
		"Kevin Costner",
		"Kevin Nealon",
		"Kevin Sorbo",
		"Laura Dern",
		"Leonardo DiCaprio",
		"Leslie Mann",
		"Mark Wahlberg",
		"Marlon Wayans",
		"Matthew Goode",
		"Nat Wolff",
		"Nicki Minaj",
		"Nicola Peltz",
		"Nikolaj Coster-Waldau",
		"Paul Walker",
		"Ramon Rodriguez",
		"Ray Liotta",
		"Ray Stevenson",
		"Ray Winstone",
		"Ricky Gervais",
		"Rory Cochrane",
		"Rose Byrne",
		"Russell Crowe",
		"Samuel L. Jackson",
		"Sarah Gadon",
		"Scarlett Johansson",
		"Scott \"Kid Cudi\" Mescudi",
		"Shailene Woodley",
		"Shane Harper",
		"Sofia Vergara",
		"Stanley Tucci",
		"Theo James",
		"The Rza",
		"Tina Fey",
		"Tom Cruise",
		"Tom Hanks",
		"Tom Hardy",
		"Tom Holland",
		"Tom Wilkinson",
		"Ty Burrell",
		"Wendi McLendon-Covey",
		"Willem Dafoe",
		"Willie Robertson",
		"Zac Efron",
		"Emily Van Camp"
	};
	
	Random rand;
	
	private String mFirstActor, mLastActor;
	
	public Actors() {
		rand = new Random();
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MINUTE);
		rand.setSeed(month);
	}
	
	public String getFirstActor() {
	    int randomNum = rand.nextInt(actorsList.length);
	    mFirstActor = actorsList[randomNum];
		return mFirstActor;
	}
	
	public String getLastActor() {
		mLastActor = mFirstActor;
		while(mFirstActor.equals(mLastActor)) {
		    int randomNum = rand.nextInt(actorsList.length);
		    mLastActor = actorsList[randomNum];
		}
		
		return mLastActor;
		
	}

}
