Program Pzim ;
var nome, sobrenome, nomeCliente, nomeProduto: string;
precoProduto,kmInicio,kmFinal,litros,valorTotal,peso,altura,imc:real;
a,b,c,n1,n2,n3,ano,tecla,qtd,horasTrabalhadas,dependentes:integer;
Begin 
	write('Créditos da ideia de fazer uma tabela: ');
	textcolor(black);
	textbackground(green);
	writeln('Matheus Gemballa Gullini');
	textcolor(green);
	textbackground(black);
	writeln('Digite um número para escolher um código ');
	writeln('NÚMERO    CÓDIGO');
	writeln('  1       apresentação');
	writeln('  2       nome');
	writeln('  3       tabela alunos e notas');
	writeln('  4       números aritmética');
	writeln('  5       média');
	writeln('  6       idade');
	writeln('  7       cliente');
	writeln('  8       área');
	writeln('  9       funcionário');
	writeln(' 10       táxi');
	writeln(' 11       IMC');
	writeln('--------------------------------------------------------------------------------');
	readln(tecla);
	writeln('O número escolhido foi: ',tecla);
  if (tecla=1) then begin
    writeln('Olá, Mundo!'); 
		writeln('Meu nome é: Ana Carolina Capistrano Huntemann');
		writeln('Moro em Rio do Sul, no bairro Taboão');
		write('Meu CEP é: 89160612');
		writeln(' Meu número é: (47)99671-9671');
  end  else if (tecla=2) then begin
    write('Qual é o seu nome? ');
		read(nome);
		write('Qual é o seu sobrenome? ');
		read(sobrenome);
		writeln('Seu nome completo é: ', nome,' ',sobrenome);
	end else if (tecla=3) then begin
	  writeln('ALUNO(A)     NOTA');
		writeln('=======      ====');
		writeln(' ALINE       9.0 ');
		writeln(' MÁRIO       DEZ ');
		writeln(' SÉRGIO      4.5 ');
		writeln('SHIRLEY      7.0 ');
	end else if (tecla=4) then begin
	 	writeln('Escreva dois números inteiros separados por ENTER ');
		read(a,b);
		writeln('A soma dos números ',a ,' + ', b ,' é igual a: ', a+b);
		writeln('A subtração dos números ',a ,' - ', b ,' é igual a: ', a-b);
		writeln('A multiplicação dos números ',a ,' * ', b ,' é igual a: ', a*b);
		writeln('A divisão dos números ',a ,' / ', b ,' é igual a: ', a/b);
	end else if (tecla=5) then begin
	   write('Qual é o nome do aluno? ');
		readln(nome);
		writeln('Escreva as três notas desse aluno espa�adas por ENTER ');
		readln(n1,n2,n3);
		writeln('O(a) aluno(a) ', nome, ' tirou a média ', (n1+n2+n3)/3);
	end else if (tecla=6) then begin
		 writeln('Em qual ano você nasceu? ');
		read(ano);
		writeln('Você tem ', 2023-ano, ' anos');
	end else if (tecla=7) then begin
	   write('Cliente: ');
	   read(nomeCliente);
	   write('Produto: ');
	   read(nomeProduto);
	   write('Preço: ');
	   read(precoProduto);
	   write('Quantidade: ');
	   read(qtd);
	   writeln('O valor total da compra de ', qtd,' produtos por ',precoProduto,' reais cada, foi de: ',qtd*precoProduto,' ;'); 
	   writeln('O cliente ',nomeCliente,' comprou o produto ',nomeProduto,' e gastou um total de ',qtd*precoProduto,' reais.');
  end else if (tecla=8) then begin
  	writeln('Escreva três números inteiros separados por ENTER ');
  	readln(a,b,c);
  	writeln('A área do triângulo de base ',a,' e altura ',c,' é: ',(a*c)/2);
  	writeln('A área de um círculo de raio ',c,' é: ',3.14*c*c);
  	writeln('A área do quadrado de lado ',b,' é: ',b*b);
  end else if (tecla=9) then begin
  	write('Nome: ');
	  read(nome);
	  write('Número de horas trabalhadas: ');
	  read(horasTrabalhadas);
	  write('Número de dependentes de um funcionário: ');
	  read(dependentes);
	  writeln('O salário de ',nome,' é de ',(12*horasTrabalhadas)+(40*dependentes),' reais.');
	end else if (tecla=10) then begin
		write('Marcação do Odômetro (km) no início do dia: ');
		read(kmInicio);
		write('Marcação do Odômetro (km) no final do dia: ');
	  read(kmFinal);
	  write('Número de litros de combustível gasto: ');
	  read(litros);
    write('Valor total (R$) recebido dos passageiros: ');
    read(valorTotal);
	  writeln('A média do consumo é: ',(kmFinal-kmInicio)/litros,' km/L e o lucro líquido do dia é ',valorTotal-(4.90*litros));
	end else if (tecla=11) then begin
		write('Peso: ');
	  read(peso);
		write('Altura: ');
	  read(altura);
	  if (peso*10000/(altura*altura)<20) then begin
    	writeln('Abaixo do peso ideal');
    end else if (peso*10000/(altura*altura)<25) then begin
    		writeln('Peso ideal');
    end else if (peso*10000/(altura*altura)<30) then begin
    		writeln('Sobrepeso');
    end else if (peso*10000/(altura*altura)>30) then begin
    		writeln('Obeso');
    end else begin
    	writeln('Deu ruim');
    end;
	end else begin
  	writeln('tururu');
  end;
End.
