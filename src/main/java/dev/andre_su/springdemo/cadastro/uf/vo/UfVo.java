package dev.andre_su.springdemo.cadastro.uf.vo;

import java.util.Objects;

public class UfVo {

    private long codigoUF = 0;
    private String sigla = null;
    private String nome = null;
    private int status = 0;
    private Object obj;

    public UfVo(){
        super();
    }

    public UfVo(long codigoUF, String sigla, String nome, int status) {
        setCodigoUF(codigoUF);
        setSigla(sigla);
        setNome(nome);
        setStatus(status);
    }

    public long getCodigoUF() {
        return codigoUF;
    }

    public void setCodigoUF(long codigoUF) {
        if (codigoUF > 0){
            this.codigoUF = codigoUF;
        }
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if(status == 1 || status == 2){
            this.status = status;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = this.sigla.hashCode() * 3;
        hashCode += this.nome.hashCode() * 5;
        hashCode += Long.hashCode(this.codigoUF) * 7;
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass() && this.hashCode() == obj.hashCode();
    }
}
