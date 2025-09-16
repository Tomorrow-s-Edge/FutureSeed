import './App.css'
import {Route, Routes} from "react-router-dom";
import Login from "./authentication/login/Login.jsx";

function App() {

  return (
    <>
        <main>
            <Routes>
                <Route path="/" element={<Login/>}/>
            </Routes>
        </main>
    </>
  )
}

export default App
