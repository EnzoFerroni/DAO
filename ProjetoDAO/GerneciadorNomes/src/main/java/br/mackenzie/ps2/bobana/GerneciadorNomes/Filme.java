//Enzo Ferroni – RA: 10417100
//Leonardo Rodrigues – RA: 10418105
//Rafael Neves de Oliveira – RA: 10418316

package br.mackenzie.ps2.bobana.GerneciadorNomes;

public class Filme {
	int id;
	String nome;
	int duracao;
	int faixa;
	public int getId() {
		return id;
	}
	public Filme(int id, String nome, int duracao, int faixa) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.faixa = faixa;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	
	public String toString() {
		String txt ="\nID: " + id;
		txt += "\nNome: " + nome;
		txt += "\nDuração: " + duracao;
		txt += "\nFaixa: " + faixa;
		
		
		return txt;
	}
	
	
	
	
	
	
	
}
