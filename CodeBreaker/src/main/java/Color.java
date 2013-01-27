package main.java;

public enum Color {
		ROJO('R'), AZUL('A'), AMARILLO('M'), VERDE('V'), NARANJA('N'), VIOLETA('I');
		private char inicial;

		Color (char inicial) {
			this.setInicial(inicial);
		}

		public char getInicial() {
			return inicial;
		}

		private void setInicial(char inicial) {
			this.inicial = inicial;
		}
}
