package com.capgemini.algorithmbattles.ballsapp.logic.model;

public class BoardCell {

  private int x;
  private int y;
  private Player player;

  public BoardCell(int x, int y, Player player) {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;

  }
}
