package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testTaskQueues() {
        //Given
        Homework javaDeveloperPlus = new JavaDeveloperPlus();
        Homework fullStackDeveloper = new FullStackDeveloper();
        Homework springAndHibernate = new SpringAndHibernate();
        Mentor jamesGosling = new Mentor("James Gosling");
        Mentor linusTorvalds = new Mentor("Linus Torvalds");
        javaDeveloperPlus.registerTaskObserver(jamesGosling);
        springAndHibernate.registerTaskObserver(jamesGosling);
        fullStackDeveloper.registerTaskObserver(linusTorvalds);
        //When
        javaDeveloperPlus.addTask("Java task 1");
        javaDeveloperPlus.addTask("Java task 2");
        fullStackDeveloper.addTask("Full Stack task 1");
        fullStackDeveloper.addTask("Full Stack task 2");
        springAndHibernate.addTask("Spring task 1");
        springAndHibernate.addTask("Spring task 2");
        springAndHibernate.addTask("Hibernate task 1");
        springAndHibernate.addTask("Hibarnate task 2");
        //Then
        assertEquals(6, jamesGosling.getTaskCount());
        assertEquals(2, linusTorvalds.getTaskCount());
    }
}
