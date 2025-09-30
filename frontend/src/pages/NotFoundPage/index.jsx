import React from 'react';
import { Link } from 'react-router-dom';
import styles from './styles.module.css'; // Optional: create this file for custom styling

const NotFoundPage = () => {
    return (
        <div className={styles.container}>
            <h1>404 – Pagina niet gevonden</h1>
            <p>Oeps! De pagina die je zoekt bestaat niet (meer).</p>
            <Link to="/" className={styles.homeLink}>
                Terug naar de homepage
            </Link>
        </div>
    );
};

export default NotFoundPage;
