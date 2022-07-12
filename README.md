# Xatrock
xatrock is an open-source java project that has been designed via several libraries and frameworks.
it's an educational software which can helps teachers and students to manage their lessons, and also have an interaction with each other.
in this system you can easily create new lesson, add your students and finally publish that.
When you create that lesson, you can easily add some activities and exams.
and other features that will be explained further.
> ###         Fancy joining us :)

## Basic information:
### Graphics:
- Javafx
### Database:
- MySql
### Frameworks:
- hibernate
### Dependency management:
- Apache Maven

________________________________________________________________________________________________________________________________________________________


### Login Page:
On this page you can easily log into your account with couple of options:
1. Normal login
2. Login with QrCode Scanner:
> Normal Login:  
>   In this option you can easily writedown your email and your password and press Enter to login.   
>   Qrcode Login:  
>   you can scan your id qrcode with your webcam and simply login to your account
>> in fact this mechansim using Xatrock Computer Vision Protocol to hopefully login without any problem. 
   
  
  
  
  ![Another Pic](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/homepage.png) 
   ![Xatrock CV Pro.](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/Computer%20Vision.png)

      
________________________________________________________________________________________________________________________________________________________
  
  ### SignUp Page:
  Now on this page you can easily signup and create new account 
  > i should mention that every new user who can signup successfully will be added into main database of the project immediatly
  >> We've used hibernate framework to handle all these transactions with database.  
    
    
  
  
  
  
    
    
  ________________________________________________________________________________________________________________________________________________________
      
### Home page:  
  We have two kind of homepage:  
  1. **Teacher homepage**:
        - Options:  
          - Access to his lesson
          - Chat
          - Check current time
          - Check Profile
        - Abilities:  
          - Add new lesson
          - Check other students
          - Change Profile
 2. **Student homepage**:
      - Options:
        - Same as teacher
      - Ability:
        - Change Profile  
          
   >  ### Also we have dark theme in our GUI Design :) [***see this***](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/StudentHomepageDarkThem.png) 
   
   
  ![Teacher homepage](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/TeacherHomePage.png) 
   
  ________________________________________________________________________________________________________________________________________________________
    
    
  ### Lesson Page:
  1. **Teacher Lesson Page Controller**:
       - Attributes:  
         - Back to home page
         - messenger of that lesson
       - Functions:  
         - Add new student
         - Enter exam grades
         - Make new exam
         - Create new homework
     
  ![Teacher lesson](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/TeacherAPPage.png) 
    
    
      
   2.   **Student homepage Lesson Page Controller**:
        - Attributes:
          - Same as teacher
        - Functions:
          - Check exams
          - check his own grades
          - Check newest homework
          
     
  > ***you can see more lesson page design on Screen shot folder of the project*** 
  >      
       
  ![Student lesson](https://github.com/salehmhosseini/Xatrock/blob/master/screenshots/StudentApPage.png) 
  
  
  
  
      
  
    
    
 
