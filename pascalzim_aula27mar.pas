Program Pzim ;
var nome, sobrenome, nomeCliente, nomeProduto: string;
precoProduto,kmInicio,kmFinal,litros,valorTotal,peso,altura:real;
a,b,c,n1,n2,n3,ano,tecla,qtd,horasTrabalhadas,dependentes:integer;
Begin 
	write('Cr�ditos da ideia de fazer uma tabela: ');
	textcolor(black);
	textbackground(green);
	writeln('Matheus Gemballa Gullini');
	textcolor(green);
	textbackground(black);
	writeln('Digite um n�mero para escolher um c�digo ');
	writeln('N�MERO    C�DIGO');
	writeln('  1       apresenta��o');
	writeln('  2       nome');
	writeln('  3       tabela alunos e notas');
	writeln('  4       n�meros aritm�tica');
	writeln('  5       m�dia');
	writeln('  6       idade');
	writeln('  7       cliente');
	writeln('  8       �rea');
	writeln('  9       funcion�rio');
	writeln(' 10       t�xi');
	writeln(' 11       IMC');
	writeln('--------------------------------------------------------------------------------');
	readln(tecla);
	writeln('O n�mero escolhido foi: ',tecla);
  if (tecla=1) then begin
    writeln('Ol�, Mundo!'); 
		writeln('Meu nome �: Ana Carolina Capistrano Huntemann');
		writeln('Moro em Rio do Sul, no bairro Tabo�o');
		write('Meu CEP �: 89160612');
		writeln(' Meu n�mero �: (47)99671-9671');
  end  else if (tecla=2) then begin
    write('Qual � o seu nome? ');
		read(nome);
		write('Qual � o seu sobrenome? ');
		read(sobrenome);
		writeln('Seu nome completo �: ', nome,' ',sobrenome);
	end else if (tecla=3) then begin
	  writeln('ALUNO(A)     NOTA');
		writeln('=======      ====');
		writeln(' ALINE       9.0 ');
		writeln(' M�RIO       DEZ ');
		writeln(' S�RGIO      4.5 ');
		writeln('SHIRLEY      7.0 ');
	end else if (tecla=4) then begin
	 	writeln('Escreva dois n�meros inteiros separados por ENTER ');
		read(a,b);
		writeln('A soma dos n�meros ',a ,' + ', b ,' � igual a: ', a+b);
		writeln('A subtra��o dos n�meros ',a ,' - ', b ,' � igual a: ', a-b);
		writeln('A multiplica��o dos n�meros ',a ,' * ', b ,' � igual a: ', a*b);
		writeln('A divis�o dos n�meros ',a ,' / ', b ,' � igual a: ', a/b);
	end else if (tecla=5) then begin
	   write('Qual � o nome do aluno? ');
		readln(nome);
		writeln('Escreva as tr�s notas desse aluno espa�adas por ENTER ');
		readln(n1,n2,n3);
		writeln('O(a) aluno(a) ', nome, ' tirou a m�dia ', (n1+n2+n3)/3);
	end else if (tecla=6) then begin
		 writeln('Em qual ano voc� nasceu? ');
		read(ano);
		writeln('Voc� tem ', 2023-ano, ' anos');
	end else if (tecla=7) then begin
	   write('Cliente: ');
	   read(nomeCliente);
	   write('Produto: ');
	   read(nomeProduto);
	   write('Pre�o: ');
	   read(precoProduto);
	   write('Quantidade: ');
	   read(qtd);
	   writeln('O valor total da compra de ', qtd,' produtos por ',precoProduto,' reais cada, foi de: ',qtd*precoProduto,' ;'); 
	   writeln('O cliente ',nomeCliente,' comprou o produto ',nomeProduto,' e gastou um total de ',qtd*precoProduto,' reais.');
  end else if (tecla=8) then begin
  	writeln('Escreva tr�s n�meros inteiros separados por ENTER ');
  	readln(a,b,c);
  	writeln('A �rea do tri�ngulo de base ',a,' e altura ',c,' �: ',(a*c)/2);
  	writeln('A �rea de um c�rculo de raio ',c,' �: ',3.14*c*c);
  	writeln('A �rea do quadrado de lado ',b,' �: ',b*b);
  end else if (tecla=9) then begin
  	write('Nome: ');
	  read(nome);
	  write('N�mero de horas trabalhadas: ');
	  read(horasTrabalhadas);
	  write('N�mero de dependentes de um funcion�rio: ');
	  read(dependentes);
	  writeln('O sal�rio de ',nome,' � de ',(12*horasTrabalhadas)+(40*dependentes),' reais.');
	end else if (tecla=10) then begin
		 write('Marca��o do Od�metro (km) no in�cio do dia: ');
	   read(kmInicio);
	   write('Marca��o do Od�metro (km) no final do dia: ');
	   read(kmFinal);
	   write('N�mero de litros de combust�vel gasto: ');
	   read(litros);
	   write('Valor total (R$) recebido dos passageiros: ');
	   read(valorTotal);
	   writeln('A m�dia do consumo �: ',(kmFinal-kmInicio)/litros,' km/L e o lucro l�quido do dia � ',valorTotal-(4.90*litros));
	end else if (tecla=11) then begin
		 write('Peso: ');
	   read(peso);
	   write('Altura: ');
	   read(altura);
	   if (peso/(altura*altura))<20 then begin
        writeln('Abaixo do peso ideal');
       end else if(peso/(atura*altura)>20 and peso/(altura*altura)<25) begin
        writeln('Peso ideal');
	   end else if (peso/(altura*altura)>25 and peso/(altura*altura)<30) then begin 
	    writeln ('Sobrepeso');
	   end else if (peso/(altura*altura)>30) then begin 
	    write ('Obeso');
	   end else begin
	    writeln('Deu ruim');
       end;
	end else begin
  	writeln('tururu');
  end;
End.