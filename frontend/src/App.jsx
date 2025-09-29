import './App.css'
import {Route, Routes} from "react-router-dom";
import Login from "./authentication/login/Login.jsx";
import Homepage from "./pages/homepage/Homepage.jsx";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

function App() {

  return (
    <>
        <main>
            <Routes>
                <Route path="/" element={<Homepage/>}/>
                <Route path="/login" element={<Login/>}/>
            </Routes>
        </main>
    </>
  )
}

export default App
