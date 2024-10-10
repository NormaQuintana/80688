import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import MiFieldSet from './MiFieldSet/MiFieldSet.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/*<App >*/}
    <form action="">
    <MiFieldSet p1="Datos personales" id1="1" p2="nombre" id2="2" p3="password"/>
    <input type="submit" value="Enviar" />
    </form>
  </StrictMode>,
)
