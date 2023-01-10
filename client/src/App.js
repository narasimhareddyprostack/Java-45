import React from 'react'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './Navbar/Navbar'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Products from './Products/Products'
import Admin from './Products/Admin'
import ProductList from './Products/ProductList'
const App = () => {
  return (
    <div>
      <Router>
        <Navbar />
        <Routes>
          <Route path="/products" element={<Products />} />
          <Route path="/admin" element={<Admin />} />
          <Route path="/adminList" element={<ProductList />} />

        </Routes>
      </Router>
    </div>
  )
}

export default App
