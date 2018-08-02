package com.example.demo;
import lombok.Setter;
import lombok.Getter;

public class Tuong{
  private final int SURRENDER=0;
  private final int ATTACK=1;
  private final int DEFENSE=2;
  @Getter@Setter
  private int headHeal;
  @Getter@Setter
  private int leftHandHeal;
  @Getter@Setter
  private int rightHandHeal;
  @Getter@Setter
  private int damageLeft;
  @Getter@Setter
  private int damageRight;
  @Getter@Setter
  private int defLeft;
  @Getter@Setter
  private int defRight;

  public Tuong(int damageLeft, int damageRight, int defLeft, int defRight){
    this.headHeal=0;
    this.leftHandHeal=0;
    this.rightHandHeal=0;
    this.damageLeft=damageLeft;
    this.damageRight=damageRight;
    this.defLeft=defLeft;
    this.defRight=defRight;
  }
  public Tuong(){}

  public void defence(){
  }

  public void attack(Tuong t2){

  }

  public void ambush(Tuong t2){

  }

  public void regen(){

  }

  public void withdraw(){

  }
}
