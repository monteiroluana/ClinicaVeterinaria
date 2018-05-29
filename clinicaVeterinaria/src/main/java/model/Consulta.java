package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {

    private Integer idConsulta;
    private Date dataConsulta;
    private String relatoConsulta;
    private Integer idAnimal;
    private String nomeVet;

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String data) {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataConsulta = formatador.parse(data);
        } catch (ParseException e) {

        }

    }

    public String getRelatoConsulta() {
        return relatoConsulta;
    }

    public void setRelatoConsulta(String relatoConsulta) {
        this.relatoConsulta = relatoConsulta;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeVet() {
        return nomeVet;
    }

    public void setNomeVet(String nomeVet) {
        this.nomeVet = nomeVet;
    }

}
