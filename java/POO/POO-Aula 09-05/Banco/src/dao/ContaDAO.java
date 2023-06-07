package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import banco.ContaCorrente;
import banco.ContaPoupanca;

public class ContaDAO {

	private final String arquivo = "contas.txt";
	
	public void salvarContaCorrente(List<ContaCorrente> 
			contas) {
		
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(arquivo))) {
			for (ContaCorrente contaCorrente : contas) {
				writer.write(contaCorrente.getNumeroConta()+";"+
						contaCorrente.getSaldo()+";"+
						contaCorrente.getProprietario().getId()+";"+
						contaCorrente.getLimite()+";cc");
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarContaPoupanca(List<ContaPoupanca>
			contas) {
		
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(arquivo))) {
			for (ContaPoupanca contaPoupanca : contas) {
				writer.write(contaPoupanca.getNumeroConta()+";"+
						contaPoupanca.getSaldo()+";"+
						contaPoupanca.getProprietario().getId()+";"+
						contaPoupanca.getTaxaJuros()+";cp");
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<ContaCorrente> recuperarContaCorrente() {
		
		List<ContaCorrente> contas = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(
				new FileReader(arquivo))) {
			
			String linha;
			while ((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				int numeroConta = Integer.parseInt(partes[0]);
				double saldo = Double.parseDouble(partes[1]);
				int proprietario = Integer.parseInt(partes[2]);
				double limite = Double.parseDouble(partes[3]);
				String cc = partes[4];
				
				if (cc.equals("cc")) {
					ContaCorrente contaCorrente = 
							new ContaCorrente(numeroConta, saldo, proprietario, limite);
					contas.add(contaCorrente);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contas;
	}
	
	public List<ContaPoupanca> recuperarContaPoupanca() {
		
		List<ContaPoupanca> contas = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(
				new FileReader(arquivo))) {
			
			String linha;
			while ((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				int numeroConta = Integer.parseInt(partes[0]);
				double saldo = Double.parseDouble(partes[1]);
				int proprietario = Integer.parseInt(partes[2]);
				double taxaJuros = Double.parseDouble(partes[3]);
				String cp = partes[4];
				
				if (cp.equals("cp")) {
					ContaPoupanca contaPoupanca = 
							new ContaPoupanca(numeroConta, saldo, proprietario, taxaJuros);
					contas.add(contaPoupanca);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contas;
	}
	
	public void excluirConta(int numeroConta, 
			String tipoConta) {
		
		if (tipoConta.equals("cc")) {
			List<ContaCorrente> contasCorrente = new ArrayList<>();
			contasCorrente = recuperarContaCorrente();
			
			for (int i = 0; i < contasCorrente.size(); i++) {
				ContaCorrente contaCorrente = contasCorrente.get(i);
				if (contaCorrente.getNumeroConta() == numeroConta) {
					contasCorrente.remove(i);
					salvarContaCorrente(contasCorrente);
					System.out.println("Conta corrente removida");
				}
			}
		} else {
			List<ContaPoupanca> contasPoupanca = new ArrayList<>();
			contasPoupanca = recuperarContaPoupanca();
			
			for (int i = 0; i < contasPoupanca.size(); i++) {
				ContaPoupanca contaPoupanca = contasPoupanca.get(i);
				if (contaPoupanca.getNumeroConta() == numeroConta) {
					contasPoupanca.remove(i);
					salvarContaPoupanca(contasPoupanca);
					System.out.println("Conta poupança removida");
				}
			}
		}
	}
	
	public void atualizarLimite(ContaCorrente conta) {
		List<ContaCorrente> contas = new ArrayList<>();
		contas = recuperarContaCorrente();
		for (int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = contas.get(i);
			if (cc.getNumeroConta() == conta.
					getNumeroConta()) {
				cc.setLimite(conta.getLimite());
				contas.set(i, cc);
				salvarContaCorrente(contas);
				return;
			}
		}
		System.out.println("Conta não encontrada.");
	}
	
	public void atualizarTaxaJuros(ContaPoupanca conta) {
		List<ContaPoupanca> contas = new ArrayList<>();
		contas = recuperarContaPoupanca();
		for (int i = 0; i < contas.size(); i++) {
			ContaPoupanca cp = contas.get(i);
			if (cp.getNumeroConta() == conta.getNumeroConta()) {
				cp.setTaxaJuros(conta.getTaxaJuros());
				contas.set(i, cp);
				salvarContaPoupanca(contas);
				return;
			}
		}
		System.out.println("Conta não encontrada.");
	}
}