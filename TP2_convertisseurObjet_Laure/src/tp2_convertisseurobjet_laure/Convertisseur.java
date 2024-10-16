/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_laure;

/**
 *
 * @author lenovo
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
 nbConversions = 0 ;
}
    public double celciusVersKelvin(Double tCelcius) {
        nbConversions++;
        return (tCelcius + 273.15);
    }

    public double farenheitVersCelcius(Double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5.0 / 9;
    }

    public double celciusVersFarenheit(Double tCelcius) {
        nbConversions++;
        return (tCelcius * 9.0 / 5) + 32;
    }

    public double kelvinVersFarenheit(Double tKelvin) {
        nbConversions++;
        return (tKelvin - 273.15) * 9.0 / 5 + 32;
    }

    public double farenheitVersKelvin(Double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5.0 / 9 + 273.15;
    }

    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
        
    }
}
