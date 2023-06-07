Program Pzim ;
var tecla,number,x,y,i,altura,largura,profundidade,base,velocidade,preco,graus,pNormal,pMeia,pNada:integer;
n:real;
nomeAutomovel:string;
Begin
	writeln('Digite um número para escolher um código ');
	writeln('NÚMERO    CÓDIGO');
	writeln('  1       Sucessor');
	writeln('  2       Divisão inteira');
	writeln('  3       Tabuada');
	writeln('  4       Volume de uma caixa');
	writeln('  5       Área de um triângulo');
	writeln('  6       Velocidade');
	writeln('  7       Calculadora quebrada');
	writeln('  8       Carro');
	writeln('  9       Temperatura');
	writeln(' 10       Ônibus');
	writeln('--------------------------------------------------------------------------------');
	readln(tecla);
	writeln('O código escolhido foi: ',tecla);
  if (tecla=1) then begin
  	write('Escreva um número inteiro: ');
  	read(number);
  	write('O sucessor de ',number,' é ',number+1);
  end else if (tecla=2) then begin
		write('Escreva dois números inteiros: ');
		readln(x,y);
		write('O quociente da divisão inteira entre ',x,' e ',y,' é ',x div y,' e o resto é ',x mod y,'.');
  end else if (tecla=3) then begin
  	write('Escreva um número: ');
		read(n);
  	writeln('A taboada do número ',n,' é: ');
  	for i:= 1 to 50 do
    begin
    		writeln(i,' X ',n,' = ',n*i);
   	end;
  end else if (tecla=4) then begin 
		writeln('Escreva as medidas a seguir de uma caixa em cm.');
		write('Altura: ');
		read(altura);
		write('Largura: ');
		read(largura);
		write('Profundidade: ');
		read(profundidade);
		write('O volume da caixa é ',altura*largura*profundidade,' cm.');	
	end else if (tecla=5) then begin 
		writeln('Escreva as medidas a seguir de um triângulo em cm.');
		write('Base: ');
		read(base);
		write('Altura: ');
		read(altura);	
		write('A área do triângulo é ',(base*altura)/2,' cm.');
	end else if (tecla=6) then begin
		write('Escreva a velocidade de um veículo em km/h: ');
		read(velocidade);
		writeln('A velocidade ',velocidade,' km/h equivale a ',velocidade*3.6,' m/s.');
		writeln('Levará ',435/velocidade,' horas para viajar de São Paulo até Rio de Janeiro a ',velocidade,' km/h.');
	end else if (tecla=7) then begin
		writeln('12 x 4 = ',12+12+12+12);
		writeln('23 x 11 = ',23+23+23+23+23+23+23+23+23+23+23);
		writeln('10 ÷ 2 = ',10-5);
		writeln('175 ÷ 7 = ',175-150);
		writeln('28 x 5 = ',28+28+28+28+28);
	end else if (tecla=8) then begin
		write('Escreva o nome do automóvel: ');
		read(nomeAutomovel);
		write('Escreva preço de fábrica: ');
		read(preco);
		write('O preço final do automóvel ',nomeAutomovel,' é de ',preco+(preco*0.15)+(preco*0.25),' reais.'); 
	end else if (tecla=9) then begin
		write('Escreva a temperatura em graus Celsius: ');
		read(graus);
		write('A temperatura ',graus,' graus Celsius equivale a ',(9*graus)/5+32,' graus Fahrenheit e ',graus+273,' Kelvin.');
	end else if (tecla=10) then begin
		write('nº do ônibus: ');
		read(number);
		write('quantos passageiros pagaram a passagem normal: ');
		read(pNormal);
		write('quantos estudantes: ');
		read(pMeia);
		write('quantos idosos: ');
		read(pNada);
		write('Considerando a passagem custando R$5,50, o total faturado foi de ',(pNormal+(pMeia/2))*5.5,' reais, o total de passageiros foi de ',pNormal+pMeia+pNada,' pessoas, a soma geral de dinheiro foi de ',(pNormal+(pMeia/2))*5.5,' reais e a soma geral de passageiros foi de ',pNormal+pMeia+pNada,' passageiros.');
	end; 
End.