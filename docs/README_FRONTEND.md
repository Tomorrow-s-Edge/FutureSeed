# 📚 School/Library Management System – Frontend

## 📚 Table of Contents

- [📘 Introduction](#introduction)
- [✨ Features](#features)
- [🛠 Tech Stack](#tech-stack)
- [🚀 Getting Started](#getting-started)
- [📁 Folder Structure](#folder-structure---frontend)
- [📜 Available Scripts](#available-scripts)
- [🔌 API Integration](#api-integration)
- [🤝 Contributing](#contributing)
- [🪪 License](#license)
- [📞 Contact](#contact)


## Introduction

This is the frontend of a web-based School Management System, developed with React. It enables administrators, teachers, and students to manage school operations more efficiently. From student enrollment to class scheduling, grades, and communication — the system brings essential school functionalities into a single, easy-to-use interface.

The frontend communicates with a Java Spring Boot backend and uses PostgreSQL as the database.

---

## Features
🎓 Student Management
- View, add, edit, and delete student records including personal info, class assignments, and academic status.

🧑‍🏫 Teacher Management
- Manage teacher profiles, assign subjects, and monitor performance and schedules.

🗓 Class & Schedule Management
- Create and manage class schedules, subject timetables, and classroom allocations.

📊 Grade & Report System
 - Teachers can enter and update student grades, and students/parents can view academic progress.

📨 Internal Messaging & Notifications
 - Send announcements, assignment updates, or private messages between staff, students, and parents.

✅ Authentication & Role-Based Access
- Secure login system with different roles (Admin, Teacher, Student) and permissions.

🔍 Advanced Search & Filtering
 - Quickly find students, teachers, subjects, or schedules with keyword-based search and filters.

🌐 Responsive Design
 - Fully responsive interface, accessible on desktop, tablet, and mobile devices.

---

## Tech Stack

### Frontend:
- **React** – UI library
- **Axios** – HTTP client for API calls
- **React Router DOM** – Page routing
- **Bootstrap** or **Tailwind CSS** – Styling
- **Figma** – UI/UX design mockups (optional)
- **React Context API** or Redux – State management (optional)

### Backend:
- **Java Spring Boot** – REST API
- **PostgreSQL** – Relational database
- **Postman** – API testing

---

## **Folder Structure - Frontend**


```bash

frontend/
├── public/
│   └── index.html
├── src/
│   ├── assets/            # Images, logos, fonts, etc.
│   ├── components/        # Reusable UI components (e.g. Button, Navbar)
│   ├── pages/             # Page components (e.g. Home, Login, Dashboard)
│   ├── features/          # Specific features or modules (e.g. subjects, users)
│   │   └── subjects/
│   │       ├── SubjectList.jsx
│   │       ├── SubjectForm.jsx
│   │       └── subjectSlice.js (if using Redux)
│   ├── services/          # Axios API calls
│   │   └── api.js
│   ├── hooks/             # Custom React hooks
│   ├── context/           # Context API for state management (if used)
│   ├── styles/            # CSS or SCSS files
│   ├── App.jsx            # Main app component
│   ├── main.jsx           # React entry point
│   └── routes/            # React Router configuration
├── .env                   # Environment variables
├── package.json
└── README.md
```