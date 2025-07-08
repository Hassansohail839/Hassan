import { useState } from 'react'
import './App.css'
import kebabImg from './assets/kebab.jpg' // asegúrate de tener esta imagen en esa ruta

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <header>
        <h1>Kebab Express</h1>
        <p>¡Los mejores kebabs de tu ciudad!</p>
      </header>

      <main>
        <img src={kebabImg} alt="Delicioso kebab" className="kebab-image" />
        <h2>Compra tu kebab</h2>
        <button onClick={() => setCount(count + 1)}>
          🍢 Comprar kebab
        </button>
        <p>Total comprados: {count}</p>
      </main>

      <footer>
        <p>© 2025 Kebab Express - Gracias por tu compra</p>
      </footer>
    </>
  )
}
export default App
