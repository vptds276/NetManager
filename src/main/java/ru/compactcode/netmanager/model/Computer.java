/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.compactcode.netmanager.model;

/**
 *
 * @author dim
 * Объект компьютер
 */
public class Computer {
    
    private String ip;

    public Computer(String ip) {
        this.ip = ip;
    }

    private void turnOn(){
        System.out.println("Включить Пк с ip="+ip);
    }
    private void turnOff(){
        System.out.println("Выключить ПК с ip="+ip);
    }
    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Computer{" + "ip=" + ip + '}';
    }
    
    
}
