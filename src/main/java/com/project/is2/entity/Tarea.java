package com.project.is2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tarea")
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tarea_id", nullable = false)
	private int id;

	@Column(nullable = false, name = "estado")
	private String estado;
	
	@Column(nullable = false, name = "descripcion")
	private String descripcion;
	
	@Column(nullable = false, name = "id_tarea_padre")
	private int idTareaPadre;

	@ManyToOne(targetEntity = Tarea.class)
    @JoinColumn(name = "proyecto_id")
    @JsonIgnore
    private Proyecto proyecto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdTareaPadre() {
		return idTareaPadre;
	}

	public void setIdTareaPadre(int idTareaPadre) {
		this.idTareaPadre = idTareaPadre;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
}