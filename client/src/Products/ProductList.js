import React from 'react'
import Axios from 'axios'
import { Link } from 'react-router-dom'
const ProductList = () => {
    let [products, setProducts] = React.useState([])
    React.useEffect(() => {
        let url = "http://localhost:8080/apis/products"
        Axios.get(url)
            .then((response) => {
                setProducts(response.data)
            })
            .catch()
    }, [])

    let deleteProduct = (id) => {
        console.log("Test Case 123")
        let url = `http://localhost:8080/apis/product/${id}`
        Axios.delete(url).then(() => { }).catch()
    }
    return <div className="container">
        <div className="row">
            <div className="col-md-6">
                <table className='table'>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Qty</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            products.length > 0 ? <>
                                {
                                    products.map((product, index) => {
                                        return <tr key={index}>
                                            <td>{product.id}</td>
                                            <td>{product.name}</td>
                                            <td>{product.price}</td>
                                            <td>{product.qty}</td>
                                            <td><Link to="" className="btn btn-warning mr-2 ">Update</Link><Link onClick={deleteProduct.bind(this, product.id)} className="btn btn-danger">Delete</Link></td>
                                        </tr>
                                    })
                                }
                            </> : null
                        }
                    </tbody>
                </table>
            </div>
        </div>
    </div>
}

export default ProductList
