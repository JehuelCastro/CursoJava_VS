public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Jehuel Castro";
        int idade = 42;
        char sexo = 'M';
        double temperatura = 22;
        boolean arCondicionado = false;

//comandos para concatenar
        System.out.println("Uso de Variáveis na Linguagem Java");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Ar Condicionado: " + arCondicionado);
        System.out.println("");

//utilização de variáveis
        double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("");
		System.out.println("Variáveis Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + ( i + 5 ));
		System.out.println("i = " + i + " - 5 | i = " + ( i - 5 ));
		System.out.println("i = " + i + " * 5 | i = " + ( i * 5 ));
		System.out.println("i = " + i + " / 5 | i = " + ( i / 5 ));
		System.out.println("i = " + i + " % 5 | i = " + ( i % 5 ));
        System.out.println("");


        System.out.println("Atribuições Variáveis");
		System.out.println("i += 5       | i = " + ( i += 5 ));
		System.out.println("i -= 5       | i = " + ( i -= 5 ));
		System.out.println("i *= 5       | i = " + ( i *= 5 ));
		System.out.println("i /= 5       | i = " + ( i /= 5 ));
		System.out.println("i %= 5       | i = " + ( i %= 5 ));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
        System.out.println("");

// Estruturas de controle

        System.out.println("Estruturas de Controle Condicional");
        System.out.println("");
        System.out.println("Exemplo 1 - Uso do 'if' ");
            if (sexo == 'M') {
                System.out.println("O cabra é macho");
                   
        System.out.println("Exemplo 2 - Uso do 'if - else' ");
            if (idade < 18) {
                System.out.println("É menino");
}           else  {
                System.out.println("É homen");
        
        System.out.println("Exemplo 3 - Uso do 'else - if' ");
            if (idade < 16) {
                System.out.println("PROIBIDO VOTAR !");
}           else if (idade >= 18 && idade <= 70) {
                System.out.println("VOTO OBRIGATÓRIO !");
}           else if (idade == 16 || idade == 17 || idade > 70) {
                System.out.println("VOTO FACULTATIVO !");
                    System.out.println("");
}
                    System.out.println("Exemplo 4 - Uso do 'switc case' ");
                    System.out.println("1. Cadastro de Clientes");
                    System.out.println("2. Cadastro de Usuários");
                    System.out.println("3. Relatórios");
                    int opcao = 4;
                        switch (opcao) {
                        case 1:
                            System.out.println("CLIENTES");
                            break;
                        case 2:
                            System.out.println("USUÁRIOSS");
                            break;
                        case 3:
                            System.out.println("RELATÓRIOS");
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                            break;
}
        System.out.println("Estrutura de Repetições");
        System.out.println("");
        System.out.println("Exemplo 5 - Uso do 'for'");
            for (int j = 10; j > 0; j--) {
        System.out.println(j);
}
        System.out.println("");
        System.out.println("Exemplo 6 - Tabuada");
            for (int tabuada = 0; tabuada <= 10; tabuada++) {
    System.out.println("");
   for (int valor   = 0; valor   <= 10;   valor++) {
    System.out.println(tabuada + " x " + valor + " = " + tabuada * valor);
    
}
    
}

        System.out.println("");
        System.out.println("Exemplo 7 - Uso da Estrutura 'while'");
            int contador = 1; 
            while (contador <= 10) {
                System.out.println(contador);
                contador++;
}

        System.out.println("");
        System.out.println("Exemplo 8 - Uso da Estrutura 'do while'");
            char novoJogo; 
            do {
            System.out.println("Deseja Jogar Novamente (s/n)?");
            novoJogo = 'n';
}           while (novoJogo == 's');
        System.out.println("GAME OVER");
        
}
}
}
}

