package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
   @Test
    public void testSettingJobId(){
     Job job1 = new Job();
     //this is how to create a new object

       Job job2 = new Job();

       Assert.assertNotEquals(job1.getId(), job2.getId());
   }

   @Test
    public void testJobConstructorSetsAllFields(){
       Job A = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       // check that the name is a String
       Assert.assertTrue(A.getName() instanceof String);
       // check the value of the name
       Assert.assertEquals("Product tester", A.getName());

       Assert.assertTrue (A.getEmployer() instanceof Employer);
       Assert.assertEquals("ACME", A.getEmployer().getValue());

       Assert.assertTrue (A.getLocation() instanceof Location);
       Assert.assertEquals("Desert", A.getLocation().getValue());

       Assert.assertTrue (A.getPositionType() instanceof PositionType);
       Assert.assertEquals("Quality control", A.getPositionType().getValue());

       Assert.assertTrue (A.getCoreCompetency() instanceof CoreCompetency);
       Assert.assertEquals("Persistence", A.getCoreCompetency().getValue());
   }

   @Test
    public void testJobsForEquality(){
       Job A = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job B = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//   Assert.assertTrue(!A.equals(B));
       Assert.assertFalse(A.equals(B));
   }
   @Test
    public void testToStringStartsAndEndsWithNewLine(){
       Job A = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       String str = A.toString();
       //str holds whatever is the value of A

       Assert.assertEquals('\n', str.charAt(0));
       Assert.assertEquals('\n', str.charAt(str.length()-1));
   }
   @Test
    public void testToStringContainsCorrectLabelsAndData(){
       Job A = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       String str = A.toString();
       String expected = "\nID: " +A.getId()+"\n" +
               "Name: "+A.getName()+"\n" +
               "Employer: "+A.getEmployer()+"\n" +
               "Location: "+A.getLocation()+"\n" +
               "Position Type: "+A.getPositionType()+"\n" +
               "Core Competency: "+A.getCoreCompetency()+"\n";
       Assert.assertEquals(expected, str);

   }
   @Test
    public void testToStringHandlesEmptyField(){
       Job A = new Job("Product tester", new Employer("ACME"),null, new PositionType("Quality control"), new CoreCompetency("Persistence"));
       String str = A.toString();
       String expected = "\nID: " +A.getId()+"\n" +
               "Name: "+A.getName()+"\n" +
               "Employer: "+A.getEmployer()+"\n" +
               "Location: Data not available\n" +
               "Position Type: "+A.getPositionType()+"\n" +
               "Core Competency: "+A.getCoreCompetency()+"\n";
       Assert.assertEquals(expected, str);
   }
 }
