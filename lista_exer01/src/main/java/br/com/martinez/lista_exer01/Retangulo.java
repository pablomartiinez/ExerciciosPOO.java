
package br.com.martinez.lista_exer01;

public class Retangulo {
    double altura;
    double largura;
    double area;
    double perimetro;
    
    double calcularArea() {
        area = altura * largura;
        return area;
    }
    
    double calcularPerimetro() {
        perimetro = altura * largura;
        return perimetro;
    }
    
}
