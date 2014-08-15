package com.dimas.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright 2009-2014. NxSystems Inc.
 * PROPRIETARY/CONFIDENTIAL.
 * <p/>
 * Created: 14.08.14 20:15
 *
 * @author Dmitry Borovoy
 */
public class DomainEntity {

    private final Logger l = LoggerFactory.getLogger(getClass());

    public String name;
    public int age;
    public int age2;


    public void display() {
        l.info("name={};age={}", name, age);
    }
}
