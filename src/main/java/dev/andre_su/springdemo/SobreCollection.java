package dev.andre_su.springdemo;

import dev.andre_su.springdemo.cadastro.uf.vo.UfVo;

import java.util.ArrayList;

public class SobreCollection {
    public static void main(String[] args) {
        UfVo matoGrosso = new UfVo(1, "MT", "Mato Grosso", 1);
        UfVo minasGerais = new UfVo(2, "MG","Minas Gerais", 1);
        UfVo rioDeJaneiro = new UfVo(3, "RJ","Rio de Janeiro", 1);
        UfVo goias = new UfVo(4,"GO", "Goiás", 1);
        UfVo saoPaulo = new UfVo(5,"SP", "São Paulo", 1);

        ArrayList<UfVo> arrayList = new ArrayList<>();
        arrayList.add(matoGrosso);
        arrayList.add(saoPaulo);
        arrayList.add(rioDeJaneiro);
        arrayList.add(goias);
        arrayList.add(minasGerais);

        UfVo teste3 = new UfVo(3, "", "", 1);

        arrayList.add(teste3);

        System.out.println(teste3.equals(rioDeJaneiro));
        System.out.printf("teste3 = %d, rio = %d",teste3.hashCode(),rioDeJaneiro.hashCode());
    }
}
