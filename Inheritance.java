package week06;

public class Inheritance {
    class Person{
        private String FirstName;
        private String LastName;
        private String Gender;
        Person (String FirstName, String LastName, String Gender){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.Gender = Gender;
        }
        public String getFirstName(){
            return this.FirstName;
        }   
        public void setFirstName(String FirstName){
            this.FirstName = FirstName;
        }
        public String getLastName(){
            return this.LastName;
        }   
        public void setLastName(String LastName){
            this.LastName = LastName;
        }
        public String getGender(){
            return this.Gender;
        }   
        public void setGender(String Gender){
            this.Gender = Gender;
        }
        public String toString(String FirstName, String LastName){
            StringBuilder sb = new StringBuilder();
            sb.append(FirstName);
            sb.append(LastName);
            return sb.toString();

        }
        public boolean equals (Person p){
            if (this.FirstName.equals(p.FirstName) && this.LastName.equals(p.LastName) ) {return true;}
            return false;
        }


    }
    

}
