package MAIN_PACKAGE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Account_Holder {

   private String firstName;
   private String MiddleName;
   private String LastName;
   private int age;
   private String Address;
   private LocalDate DOB;
   private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

   public Account_Holder() {
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getMiddleName() {
      return this.MiddleName;
   }

   public void setMiddleName(String middleName) {
      this.MiddleName = middleName;
   }

   public String getLastName() {
      return this.LastName;
   }

   public void setLastName(String lastName) {
      this.LastName = lastName;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getDOB() {
      return this.DOB.format(FORMATTER);
   }

   public void setDOB(String dOB) {
      try {
         this.DOB = LocalDate.parse(dOB, FORMATTER);
      } catch (DateTimeParseException var3) {
         throw new IllegalArgumentException("Please Enter correct format of DOB dd-MM-yyyy");
      }
   }

   public static DateTimeFormatter getFORMATTER() {
      return FORMATTER;
   }

   public static void setFORMATTER(DateTimeFormatter fORMATTER) {
      FORMATTER = fORMATTER;
   }

   public void setAddress(String Address) {
      this.Address = Address;
   }

   public String getAddress() {
      return this.Address;

   }
    
}
