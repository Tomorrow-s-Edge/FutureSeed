import './App.css'
import {Route, Routes} from "react-router-dom";
import LoginPage from "./authentication/LoginPage/index.jsx";
import HomePage from "./pages/HomePage/index.jsx";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import NotFoundPage from "./pages/NotFoundPage/index.jsx";

function App() {

  return (
    <>
        <main>
            <Routes>
                <Route path="/" element={<HomePage/>}/>
                <Route path="/login" element={<LoginPage/>}/>

                <Route path="/*" element={<NotFoundPage/>}/>
            </Routes>
        </main>
    </>
  )
}

export default App
