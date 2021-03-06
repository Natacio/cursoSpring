package nataciotecnologia.com.br.cursoSpring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Resposta {
	private Long id;
	private String mensagem;
	private Topico topico;
	private LocalDateTime dataCriacao;
	private Usuario autor;
	private boolean solucao = false;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null)? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		return Objects.equals(id, other.id);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico getTopico() {
		return topico;
	}
	public void setTopico(Topico topico) {
		this.topico = topico;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	public boolean isSolucao() {
		return solucao;
	}
	public void setSolucao(boolean solucao) {
		this.solucao = solucao;
	}
	
}
