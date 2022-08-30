package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {



    @Test
    public void testSettingJobId() {
        Job testEmptyConstructorJob1 = new Job();
        Job testEmptyConstructorJob2 = new Job();
//TODO: Test whether ID of two objects are distinct
        assertNotEquals(testEmptyConstructorJob1.getId(),testEmptyConstructorJob2.getId());
    }

    Job test_job;
    @Before
    public void createJobObject() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //TODO: Test the constructor correctly assigns both the class and value of each field
        // name first
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().toString());
        assertEquals("Desert", test_job.getLocation().toString());
        assertEquals("Quality control", test_job.getPositionType().toString());
        assertEquals("Persistence", test_job.getCoreCompetency().toString());
       assertTrue(test_job.getName() instanceof String);
       // then Employer
        assertTrue(test_job.getEmployer() instanceof Employer);
        // then Location
        assertTrue(test_job.getLocation() instanceof Location);
        // Position Type
        assertTrue(test_job.getPositionType() instanceof PositionType);
        // Core Competency
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);


    }

    Job testIdenticalFieldExceptID1 = new Job("Product tester", new Employer("Launchcode"),
            new Location("Philadelphia"), new PositionType("Programmer"), new CoreCompetency("SoftSkills"));
    Job testIdenticalFieldExceptID2 = new Job("Product tester", new Employer("Launchcode"),
            new Location("Philadelphia"), new PositionType("Programmer"), new CoreCompetency("SoftSkills"));


    @Test
    public void testJobsForEquality() {

        //TODO:  Generate two Job objects that have identical field values EXCEPT for id.

        assertFalse(testIdenticalFieldExceptID1.equals(testIdenticalFieldExceptID2));

    }
        @Test
        public void testToStringStartsAndEndsWithNewLine() {

        //TODO: when passed a Job object, return a string that contains a blank line before and after the job info

            Job newjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));


            assertEquals('\n',newjob.toString().charAt(0));
            assertEquals('\n',newjob.toString().charAt((newjob.toString().length() - 1)));

            }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        //TODO: The string should contain a label for each field, followed by the data stored in that field.
        // Each field should be on its own line

        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //assertTrue("true",test_job.getId().contains("Id : 5");
        assertTrue(test_job.toString().contains("Name: Product tester"));
        assertTrue(test_job.toString().contains("Employer: ACME"));
        assertTrue(test_job.toString().contains("Location: Desert"));
        assertTrue(test_job.toString().contains("Position Type: Quality control"));
        assertTrue(test_job.toString().contains("Core Competency: Persistence"));
        assertEquals("Product tester",test_job.getName());
        assertEquals("ACME",test_job.getEmployer().toString());
        assertEquals("Desert",test_job.getLocation().toString());
        assertEquals("Quality control",test_job.getPositionType().toString());
        assertEquals("Persistence",test_job.getCoreCompetency().toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {

        //TODO: If a field is empty, the method should add, “Data not available” after the label

        Job emptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""),
                new CoreCompetency(""));

        assertEquals("\nID: 4\nName: Data not available\nEmployer: Data not available\nLocation: Data not " +
                "available\nPosition Type: Data not available\nCore Competency: Data not available\n",
                emptyJob.toString());

    }


    }






