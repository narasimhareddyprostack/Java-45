import React from 'react'
import { Link } from 'react-router-dom'
const Navbar = () => {
    return <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
        <Link to="#" className="navbar-brand">Product-CRUD</Link>
        <div className="ml-auto">
            <ul className="navbar-nav">
                <li className="nav-list"><Link className="nav-link" to="/products">Products</Link></li>
                <li className="nav-list"><Link className="nav-link" to="/admin">Admin</Link></li>
                <li className="nav-list"><Link className="nav-link" to="/adminList">Product List</Link></li>
            </ul>
        </div>
    </nav>
}

export default Navbar
