Program Pzim ;
var tecla,number,x,y,i,altura,largura,profundidade,base,velocidade,preco,graus,pNormal,pMeia,pNada:integer;
n:real;
nomeAutomovel:string;
Begin
	writeln('Digite um n�mero para escolher um c�digo ');
	writeln('N�MERO    C�DIGO');
	writeln('  1       Sucessor');
	writeln('  2       Divis�o inteira');
	writeln('  3       Tabuada');
	writeln('  4       Volume de uma caixa');
	writeln('  5       �rea de um tri�ngulo');
	writeln('  6       Velocidade');
	writeln('  7       Calculadora quebrada');
	writeln('  8       Carro');
	writeln('  9       Temperatura');
	writeln(' 10       �nibus');
	writeln('--------------------------------------------------------------------------------');
	readln(tecla);
	writeln('O c�digo escolhido foi: ',tecla);
  if (tecla=1) then begin
  	write('Escreva um n�mero inteiro: ');
  	read(number);
  	write('O sucessor de ',number,' � ',number+1);
  end else if (tecla=2) then begin
		write('Escreva dois n�meros inteiros: ');
		readln(x,y);
		write('O quociente da divis�o inteira entre ',x,' e ',y,' � ',x div y,' e o resto � ',x mod y,'.');
  end else if (tecla=3) then begin
  	write('Escreva um n�mero: ');
		read(n);
  	writeln('A taboada do n�mero ',n,' �: ');
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
		write('O volume da caixa � ',altura*largura*profundidade,' cm.');	
	end else if (tecla=5) then begin 
		writeln('Escreva as medidas a seguir de um tri�ngulo em cm.');
		write('Base: ');
		read(base);
		write('Altura: ');
		read(altura);	
		write('A �rea do tri�ngulo � ',(base*altura)/2,' cm.');
	end else if (tecla=6) then begin
		write('Escreva a velocidade de um ve�culo em km/h: ');
		read(velocidade);
		writeln('A velocidade ',velocidade,' km/h equivale a ',velocidade*3.6,' m/s.');
		writeln('Levar� ',435/velocidade,' horas para viajar de S�o Paulo at� Rio de Janeiro a ',velocidade,' km/h.');
	end else if (tecla=7) then begin
		writeln('12 x 4 = ',12+12+12+12);
		writeln('23 x 11 = ',23+23+23+23+23+23+23+23+23+23+23);
		writeln('10 � 2 = ',10-5);
		writeln('175 � 7 = ',175-150);
		writeln('28 x 5 = ',28+28+28+28+28);
	end else if (tecla=8) then begin
		write('Escreva o nome do autom�vel: ');
		read(nomeAutomovel);
		write('Escreva pre�o de f�brica: ');
		read(preco);
		write('O pre�o final do autom�vel ',nomeAutomovel,' � de ',preco+(preco*0.15)+(preco*0.25),' reais.'); 
	end else if (tecla=9) then begin
		write('Escreva a temperatura em graus Celsius: ');
		read(graus);
		write('A temperatura ',graus,' graus Celsius equivale a ',(9*graus)/5+32,' graus Fahrenheit e ',graus+273,' Kelvin.');
	end else if (tecla=10) then begin
		write('n� do �nibus: ');
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