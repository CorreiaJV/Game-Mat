package model;

import java.util.Random;

public class Calcular {
 private int dificuldade,v1,v2;
 private int operacao;
 private int resultado;
 
 public Calcular(int dificuldade) {
	 Random rand= new Random();	 
	 this.operacao= rand.nextInt(3); //0-somar, 1-diminuir 2-multiplicar
	this.dificuldade= dificuldade; 
	switch (dificuldade) {
	case 1:
		//Fácil
		this.v1= rand.nextInt(10);
		this.v2= rand.nextInt(10);
		break;
	case 2:
		//Médio
		this.v1= rand.nextInt(100);
		this.v2= rand.nextInt(100);
		break;
	case 3:
		//Difícil 
		this.v1= rand.nextInt(1000);
		this.v2= rand.nextInt(1000);
		break;
	case 4:
		//Hardcore
		this.v1= rand.nextInt(10000);
		this.v2= rand.nextInt(10000);
		break;

	default:
		System.out.println("Você escolheu o modo insano");
		this.v1= rand.nextInt(10000);
		this.v2= rand.nextInt(10000);
		break;
	}
 } 
 public boolean somar(int resposta) {
	 this.resultado= this.getV1() +this.getV2();
	 boolean certo= false;
	 if(resposta== this.resultado) {
		 System.out.println("Resposta certa");
		  certo = true;
	 }else {
		 System.out.println("Resposta errada");
		 certo = false;
	 }
	 System.out.println(this.getV1() + " + " + this.getV2() + " = " + this.getResultado());
	 return certo;
 }
 public boolean diminuir(int resposta) {
	 this.resultado= this.getV1() - this.getV2();
	 boolean certo= false;
	 if(resposta== this.resultado) {
		 System.out.println("Resposta certa");
		  certo = true;
	 }else {
		 System.out.println("Resposta errada");
		 certo = false;
	 }
	 System.out.println(this.getV1() + " - " + this.getV2() + " = " + this.getResultado());
	 return certo;
 }
 public boolean multiplicar(int resposta) {
	 this.resultado= this.getV1() * this.getV2();
	 boolean certo= false;
	 if(resposta== this.resultado) {
		 System.out.println("Resposta certa");
		  certo = true;
	 }else {
		 System.out.println("Resposta errada");
		 certo = false;
	 }
	 System.out.println(this.getV1() + " * " + this.getV2() + " = " + this.getResultado());
	 return certo;
 }
 
public int getDificuldade() {
	return dificuldade;
}

public int getV1() {
	return v1;
}

public int getV2() {
	return v2;
}

public int getOperacao() {
	return operacao;
}

public int getResultado() {
	return resultado;
}

 
 
}
