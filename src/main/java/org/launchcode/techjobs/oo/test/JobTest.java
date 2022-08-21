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

    Job testEmptyConstructorJob1 = new Job();
    Job testEmptyConstructorJob2 = new Job();

    @Test
    public void testSettingJobId() {
//TODO: Test whether ID of two objects are distinct
        assertNotEquals(testEmptyConstructorJob1.getId(),testEmptyConstructorJob2.getId(),.001);
    }

    Job test_job;
    @Before
    public void createJobObject() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        //TODO: Test the constructor correctly assigns both the class and value of each field
        // name first
       assertEquals("Product tester", test_job.getName());
       assertTrue(test_job.getName() instanceof String);
       // then Employer
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertTrue(test_job.getEmployer() instanceof Employer);
        // then Location
        assertEquals("Desert", test_job.getLocation().getValue());
        assertTrue(test_job.getLocation() instanceof Location);
        // Position Type
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertTrue(test_job.getPositionType() instanceof PositionType);
        // Core Competency
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

    }

    Job testIdenticalFieldExceptID1 = new Job("Product tester", new Employer("Launchcode"),
            new Location("Philadelphia"), new PositionType("Programmer"), new CoreCompetency("SoftSkills"));
    Job testIdenticalFieldExceptID2 = new Job("Product tester", new Employer("Launchcode"),
            new Location("Philadelphia"), new PositionType("Programmer"), new CoreCompetency("SoftSkills"));


    @Test
    public void testJobsForEquality() {

        //TODO:  Generate two Job objects that have identical field values EXCEPT for id.

        assertNotEquals(testIdenticalFieldExceptID1, testIdenticalFieldExceptID2);

    }
        @Test
        public void testToStringStartsAndEndsWithNewLine() {

        //TODO: when passed a Job object, return a string that contains a blank line before and after the job info

           String jobString = test_job.toString();

            assertEquals('\n', jobString.charAt(0));
            assertEquals('\n',jobString.charAt((jobString.length() - 1)));

                return ;
            }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        //TODO: The string should contain a label for each field, followed by the data stored in that field.
        // Each field should be on its own line

        String jobString = test_job.toString();
        System.out.println(jobString);

        //assertTrue("true",test_job.getId().contains("Id : 5");
        assertTrue("true",test_job.getName().contains("Product tester"));
        assertTrue("true",test_job.getEmployer().getValue().contains("ACME"));
        assertTrue("true",test_job.getLocation().getValue().contains("Desert"));
        assertTrue("true",test_job.getPositionType().getValue().contains("Quality control"));
        assertTrue("true",test_job.getName().contains("Product tester"));


        return ;
    }

    @Test
    public void testToStringHandlesEmptyField() {

        //TODO: If a field is empty, the method should add, “Data not available” after the label

        Job emptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""),
                new CoreCompetency(""));


        assertEquals("",
                emptyJob.getName());
        assertEquals("",
                emptyJob.getLocation().getValue());
        assertEquals("",
                emptyJob.getEmployer().getValue());
        assertEquals("",
                emptyJob.getPositionType().getValue());
        assertEquals("",
                emptyJob.getCoreCompetency().getValue());

        return ;
    }






    }






