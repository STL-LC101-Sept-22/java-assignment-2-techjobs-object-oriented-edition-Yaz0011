package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        PositionType pt = new PositionType("Junior Java Developer");
//        System.out.println(pt);

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3  = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs) {
            System.out.println(job.toString());
        }
//
//        Job j = job1;
//        j.setName("ABC");
//        System.out.println(j.equals(job1));
//        System.out.println(j);
//        System.out.println(job1);
//        Employer e = new Employer("ABC");
//        System.out.println(job1.equals(e));
//        System.out.println(job1.equals(job2));
//        JobField jf = new JobField();
    }

}
