package com.ceres.firstspringbootapp;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore // when run mvn package command, this will Skip.
// may be you should use -D, mvn package -Dmaven.test.skip=true
public class FirstSpringBootAppApplicationTests {

    @Test
    public void contextLoads() {
    }

}

