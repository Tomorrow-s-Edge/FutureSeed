# 💡 Idea Phase – School Management System (FutureSeed)

## 🎯 Goal
The goal of this project is to build a user-friendly school management platform that enables schools to efficiently manage their administration, student records, class schedules, and communication. The system provides real-time overviews, reduces administrative errors, and makes it easier for teachers, students, and administrators to interact with school operations.

## 💡 Program Concept
The platform acts as a central digital environment for all school stakeholders (students, teachers, administrators). Key features include student registration, scheduling, grading, attendance tracking, messaging, and document management.

## 🛠️ Problem Solutions

### 1. Scattered administration
Schools often rely on disconnected systems or spreadsheets, which can lead to errors.
- As an administrator, I want to manage all student data in one place so I have a clear overview and save time on manual tasks.
- Automatic validation and centralized storage ensure accurate and up-to-date information.

### 2. Unclear communication
It is difficult to keep all students, parents, and teachers informed at the same time.
- As a teacher, I want to send messages to students or entire classes so everyone stays informed about assignments, schedule changes, and announcements.

### 3. Invisible student progress
There is often no clear visibility into student performance or attendance.
- As a student, I want to view my grades and attendance so I know how I’m doing.
- As a teacher, I want to easily input and analyze grades per student or class.

### 4. Limited scalability and customization
Many existing systems lack flexibility or are outdated for different school types.
- As a school administrator, I want to customize roles and permissions to fit our specific setup so the system aligns with how our organization operates.

## 👥 User Roles

- **Administrator**  
  Full access to the system: manage users, assign roles, export reports.

- **Teacher**  
  Can manage students, enter grades, track attendance, and send messages.

- **Student**  
  Can view personal data, track grades, read messages, and download documents.

## 🗃️ Data & Entities

### 1. Students
- Name, student number, date of birth, email, class, attendance, grades

### 2. Teachers
- Name, subjects, classes, email, availability, messages

### 3. Classes
- Class code, student list, assigned teachers, schedules

### 4. Grades
- Student, subject, grade value, term, entered by

### 5. Messages
- Sender, recipient(s), message type (announcement/test/reminder), date, content

### 6. Attendance
- Student, date, status (present, absent, late), reason (if absent)

## 🔐 Security & Authentication
- User login via username and password
- Role-based access: only teachers can enter grades, only administrators can create users
