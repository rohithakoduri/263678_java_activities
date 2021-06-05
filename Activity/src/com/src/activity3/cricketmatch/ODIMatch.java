package com.src.activity3.cricketmatch;

public class ODIMatch extends Match {
public int overs=50;

	@Override
	public float calculateRunRate() {
		float overs=this.overs-this.getCurrentover();
		int remainingscore=this.getTarget()-this.getCurrentscore();// TODO Auto-generated method stub
		return remainingscore/overs;
	}

	@Override
	public int calculateBalls() {
		
		float overs=this.overs-this.getCurrentover();// TODO Auto-generated method stub
		return (int) (overs*6);
	}

	@Override
	public void display(double reqRunrate, int balls) {
		int remainingscore=this.getTarget()-this.getCurrentscore();// TODO Auto-generated method stub
		
		System.out.println("Need "+remainingscore +" runs in "+balls+" balls");// TODO Auto-generated method stub
		
	}

}
