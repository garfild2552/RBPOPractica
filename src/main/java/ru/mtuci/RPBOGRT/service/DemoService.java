package ru.mtuci.RPBOGRT.service;

import ru.mtuci.RPBOGRT.model.Demo;

import java.util.List;

public interface DemoService {
    void save(Demo demo);
    List<Demo> findAll();
    Demo findById(long id);
}