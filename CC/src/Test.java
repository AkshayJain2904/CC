import java.io.File;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.employee.EmployeeDetails;
import com.careerconsultancy.entities.jobseeker.JobSeeker;
import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;
import com.carrerconsultancy.entities.job.JobInfo;
import com.carrerconsultancy.entities.logincredential.LoginCredential;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * JobSeeker jobSeeker=new JobSeeker();
		 * 
		 * 
		 * 
		 * JobSeekerAddress address=new JobSeekerAddress();
		 * address.setHouseNo("11-A"); address.setStreet("Gali mahlloa");
		 * address.setCity("Indore"); address.setState("MP");
		 * address.setCountry("India"); address.setPincode(452010);
		 * 
		 * JobSeekerPersonalDetails jobSeekarPersonalDetails=new
		 * JobSeekerPersonalDetails(); jobSeekarPersonalDetails.setJsFirstName("Ram");
		 * jobSeekarPersonalDetails.setJsLastName("Singh");
		 * jobSeekarPersonalDetails.setjSfathersName("Mohan Singh");
		 * jobSeekarPersonalDetails.setGender("Male");
		 * jobSeekarPersonalDetails.setDob(new Date(1998-04-12));
		 * jobSeekarPersonalDetails.setJsemail("careerconsultancyzen@email.com");
		 * jobSeekarPersonalDetails.setjSmobNo(1234567891);
		 * jobSeekarPersonalDetails.setjSpassword("Ram1234");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * JobSeekerEducationalDetails jobSeekerEducationalDetails=new
		 * JobSeekerEducationalDetails();
		 * jobSeekerEducationalDetails.setTenthPercentage(68);
		 * jobSeekerEducationalDetails.setTenthBoard("MP board");
		 * jobSeekerEducationalDetails.setTwelthPercentage(65);
		 * jobSeekerEducationalDetails.setTwelthBoard("CBSE");
		 * jobSeekerEducationalDetails.setGraduationPercentage(84);
		 * jobSeekerEducationalDetails.setGraduation("BE");
		 * jobSeekerEducationalDetails.setGraduationSpecialization("CSE");
		 * jobSeekerEducationalDetails.setPostGraduationPercentage(76);
		 * jobSeekerEducationalDetails.setPostGraduation("M Phil");
		 * jobSeekerEducationalDetails.setPostGraduationSpecialization("CSE");
		 * 
		 * 
		 * JobSeekerProffesionalDetails jobSeekarProffesionalDetails=new
		 * JobSeekerProffesionalDetails();
		 * jobSeekarProffesionalDetails.setTotalExperienceInYears(5);
		 * jobSeekarProffesionalDetails.setJobProfile("Trainee");
		 * jobSeekarProffesionalDetails.setIndustry("IT");
		 * jobSeekarProffesionalDetails.setFunctionalArea("Development");
		 * jobSeekarProffesionalDetails.setSkillSet("java");
		 * jobSeekarProffesionalDetails.setResume(new File("D:\\package.txt"));
		 * jobSeekarProffesionalDetails.setImage(new File("D:\\package.txt"));
		 * 
		 * 
		 * jobSeekarPersonalDetails.setJobSeeker(jobSeeker);
		 * jobSeekerEducationalDetails.setJobSeeker(jobSeeker);
		 * jobSeekarProffesionalDetails.setJobSeeker(jobSeeker);
		 * address.setJobSeeker(jobSeeker);
		 * 
		 * jobSeeker.setJobSeekerPersonalDetails(jobSeekarPersonalDetails);
		 * jobSeeker.setJobSeekerProffesionalDetails(jobSeekarProffesionalDetails);
		 * jobSeeker.setJobSeekerEducationalDetails(jobSeekerEducationalDetails);
		 * jobSeeker.setJobSeekerContactDetails(address);
		 */
		/*
		 * EmployeeDetails employeeDetails=new EmployeeDetails(); JobInfo jobInfo=new
		 * JobInfo();
		 */
		
				 
				  
		/* LoginCredential loginCredential=new LoginCredential(); */
				  JobSeekerAddress address=new JobSeekerAddress();
		/*
		 * loginCredential.setEmailId("careerconsultancyzen@email.com");
		 * loginCredential.setPassword("Ram1234"); loginCredential.setRole("admin");
		 */
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(address);
		
		/*
		 * session.save(employeeDetails); session.save(jobInfo);
		 */
		/*
		 * session.save(jobSeeker); session.save(address);
		 * session.save(jobSeekarPersonalDetails);
		 * session.save(jobSeekerEducationalDetails);
		 * session.save(jobSeekarProffesionalDetails);
		 */
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
