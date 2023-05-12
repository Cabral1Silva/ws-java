package entidades;
import java.util.Date;

public class HoraContrato {
	
	private Date data;
	private Double valorHora;
	private Integer hora;
	
	
	
	public HoraContrato() {
		
	}
	
	public HoraContrato(Date data, Double valorHora, Integer hora){
		
		this.data = data;
		this.valorHora = valorHora;
		this.hora = hora;		
	}
	
	public Date getData() {
		return data;
	}
	public Double getValorHora() {
		return valorHora;
	}
	public Integer getHora() {
		return hora;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	
	
	
}
