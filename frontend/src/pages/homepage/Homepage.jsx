import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

class Homepage extends Component {
    render() {
        return (
            <div className="container py-5">
                {/* Header */}
                <header className="text-center mb-5">
                    <h1 className="display-3 fw-bold text-primary">School System Manager</h1>
                    <p className="fs-5 text-secondary">Streamline your school operations with ease</p>
                </header>

                {/* Navigation */}
                <nav className="navbar navbar-expand-lg navbar-dark bg-primary rounded mb-5 shadow-sm">
                    <div className="container-fluid">
                        <a className="navbar-brand fw-semibold" href="/">Dashboard</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav ms-auto">
                                <li className="nav-item"><a className="nav-link" href="/students">Students</a></li>
                                <li className="nav-item"><a className="nav-link" href="/teachers">Teachers</a></li>
                                <li className="nav-item"><a className="nav-link" href="/classes">Classes</a></li>
                                <li className="nav-item"><a className="nav-link" href="/attendance">Attendance</a></li>
                                <li className="nav-item"><a className="nav-link" href="/reports">Reports</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>

                {/* Main Content */}
                <main>
                    <section className="mb-5 text-center">
                        <h2 className="h4 text-success">👋 Welcome, Admin!</h2>
                        <p className="text-muted">Use the navigation above to manage school data, track performance, and generate reports.</p>
                    </section>

                    <section>
                        <h3 className="h5 mb-4 text-dark">🔧 Key Features</h3>
                        <div className="row g-3">
                            {[
                                'Student and teacher profiles',
                                'Class scheduling and assignments',
                                'Real-time attendance tracking',
                                'Performance analytics and reporting'
                            ].map((feature, index) => (
                                <div className="col-md-6" key={index}>
                                    <div className="card h-100 shadow-sm">
                                        <div className="card-body">
                                            <p className="card-text">{feature}</p>
                                        </div>
                                    </div>
                                </div>
                            ))}
                        </div>
                    </section>
                </main>

                {/* Footer */}
                <footer className="text-center mt-5 pt-4 border-top">
                    <p className="text-muted small">&copy; 2025 School System Manager. All rights reserved.</p>
                </footer>
            </div>
        );
    }
}

export default Homepage;
