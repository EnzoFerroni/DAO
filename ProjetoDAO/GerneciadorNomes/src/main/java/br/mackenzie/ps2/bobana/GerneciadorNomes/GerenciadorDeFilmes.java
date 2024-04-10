//Enzo Ferroni – RA: 10417100
//Leonardo Rodrigues – RA: 10418105
//Rafael Neves de Oliveira – RA: 10418316

package br.mackenzie.ps2.bobana.GerneciadorNomes;

public class GerenciadorDeFilmes {

	public static void main(String[] args) {
		FilmeDAO gr = new FilmeDAO();
		
		Filme filme1 = new Filme(0, "Avatar", 180, 14);
		Filme filme2 = new Filme(1, "Oppenheimer", 180, 16);
		Filme filme3 = new Filme(2, "O Poderoso Chefão", 180, 14);
		Filme filme4 = new Filme(3, "Vingadores", 120, 14);
		
		try {
		gr.insert(filme1);
		gr.insert(filme2);
		gr.insert(filme3);
		gr.insert(filme4);
		
		Filme filmeSearch = gr.get(0);
		System.out.println(filmeSearch.toString());
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
