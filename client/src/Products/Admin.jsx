import React from 'react'
import Axios from 'axios'
const Admin = () => {
    let [product, setProduct] = React.useState({
        name: '',
        price: "",
        qty: "",
        info: ""
    })
    let updateHandler = (event) => {
        setProduct({ ...product, [event.target.name]: event.target.value })
    }
    let submitHandler = (event) => {
        let url = 'http://localhost:8080/apis/product'
        Axios.post(url, product)
            .then(() => { })
            .catch()
    }
    return <div className="container">
        <pre>{JSON.stringify(product)}</pre>
        <div className="row">
            <div className="col">
                <h2>Create Product</h2>
                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Natus, veritatis, suscipit tempore minus possimus est consequuntur delectus neque distinctio quam enim. Nobis numquam fugiat ratione impedit sit repellat, soluta id?</p>
            </div>
        </div>
        <div className="row">
            <div className="col-md-4">
                <div className="card">
                    <div className="card-header">
                        <h4>Create Product</h4>
                    </div>
                    <div className="card-body">
                        <form onSubmit={submitHandler}>
                            <div className='form-group'>
                                <input type="text" className="form-control" placeholder="Product Name" name="name" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="number" className="form-control" placeholder="Price" name="price" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="number" className="form-control" placeholder="QTY" name="qty" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="text" className="form-control" placeholder="Info" name="info" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="submit" className="btn btn-success" value="Create Product" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>
}

export default Admin
