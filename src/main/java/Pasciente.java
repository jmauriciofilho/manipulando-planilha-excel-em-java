/**
 * Created by mauricio on 04/04/17.
 */
public class Pasciente {

	private double requisicao;
	private String paciente;
	private String UFResidencia;
	private String requisitante;
	private String munRequisitante;
	private String exame;
	private String metodo;
	private String material;
	private String laboratorio;
	private String DTCadastro;
	private String DTRecebimento;
	private String DTLiberacao;
	private String laboratorioExecutor;
	private String statusExame;
	private String resultado;

	public Pasciente(){};

	public Pasciente(double requisicao, String paciente, String UFResidencia, String requisitante,
	                 String munRequisitante, String exame, String metodo, String material,
	                 String laboratorio, String DTCadastro, String DTRecebimento, String DTLiberacao,
	                 String laboratorioExecutor, String statusExame, String resultado) {
		this.requisicao = requisicao;
		this.paciente = paciente;
		this.UFResidencia = UFResidencia;
		this.requisitante = requisitante;
		this.munRequisitante = munRequisitante;
		this.exame = exame;
		this.metodo = metodo;
		this.material = material;
		this.laboratorio = laboratorio;
		this.DTCadastro = DTCadastro;
		this.DTRecebimento = DTRecebimento;
		this.DTLiberacao = DTLiberacao;
		this.laboratorioExecutor = laboratorioExecutor;
		this.statusExame = statusExame;
		this.resultado = resultado;
	}

	public double getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(double requisicao) {
		this.requisicao = requisicao;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getUFResidencia() {
		return UFResidencia;
	}

	public void setUFResidencia(String UFResidencia) {
		this.UFResidencia = UFResidencia;
	}

	public String getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(String requisitante) {
		this.requisitante = requisitante;
	}

	public String getMunRequisitante() {
		return munRequisitante;
	}

	public void setMunRequisitante(String munRequisitante) {
		this.munRequisitante = munRequisitante;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getDTCadastro() {
		return DTCadastro;
	}

	public void setDTCadastro(String DTCadastro) {
		this.DTCadastro = DTCadastro;
	}

	public String getDTRecebimento() {
		return DTRecebimento;
	}

	public void setDTRecebimento(String DTRecebimento) {
		this.DTRecebimento = DTRecebimento;
	}

	public String getDTLiberacao() {
		return DTLiberacao;
	}

	public void setDTLiberacao(String DTLiberacao) {
		this.DTLiberacao = DTLiberacao;
	}

	public String getLaboratorioExecutor() {
		return laboratorioExecutor;
	}

	public void setLaboratorioExecutor(String laboratorioExecutor) {
		this.laboratorioExecutor = laboratorioExecutor;
	}

	public String getStatusExame() {
		return statusExame;
	}

	public void setStatusExame(String statusExame) {
		this.statusExame = statusExame;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
