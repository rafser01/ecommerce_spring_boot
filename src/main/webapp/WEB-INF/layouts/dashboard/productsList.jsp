<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="mt-3">
    <!-- Add Category -->
    <h4>Product entry form</h4>
    <div class="row">
        <form action="/addProduct" method="POST" class="needs-validation" novalidate>
            <div class="row g-3">
                <div class="col-12">
                    <label for="productName" class="form-label">Product Name</label>
                    <div class="input-group">

                        <input  type="text" class="form-control" name="productName" id="productName" placeholder="Product Name" required>
                        <div class="invalid-feedback">
                            Product name is required
                        </div>
                    </div>
                </div>

                <div class="col-12">
                    <label for="description" class="form-label">Description<!-- <span class="text-muted">(Optional)</span> --></label>
                    <input type="text" name="description" class="form-control" id="description" >
                    <div class="invalid-feedback">
                        Please enter product description
                    </div>
                </div>
                <div class="row g-3">
                    <div class="col-sm-6">
                        <label for="stock" class="form-label">Stock</label>
                        <input type="number" class="form-control" name="stock" id="stock" placeholder="Number of quanity " value="" required>
                        <div class="invalid-feedback">
                            Quantity must be in integer format
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <label for="price" class="form-label">Price</label>
                        <input type="number" class="form-control" name="price" id="price" placeholder="0.0" value="" required>
                        <div class="invalid-feedback">
                            Price is required.
                        </div>
                    </div>

                </div>
                <div class="row g-3">
                    <div class="col-sm-6">
                        <label for="stock" class="form-label">Discount</label>
                        <input type="number" class="form-control" name="discount" id="discount" placeholder="i.e. 10%" value="">

                    </div>

                    <div class="col-sm-6">
                        <div class="col-md-5">
                            <label for="country" class="form-label">Category</label>
                            <select class="form-select" name="category" id="category" required>
                                <c:forEach items="${categories}" var="cat">
                                    <option value="${cat.id}"> ${cat.categoryName}</option>
                                </c:forEach>
                                
                            </select>
                            
                        </div>
                    </div>

                </div>

                <div class="col-12">
                    <label for="img" class="form-label">Image Link</label>
                    <input type="text" class="form-control" name="img" id="img" placeholder="http://imglink.com/img1.jpg" required>
                    <div class="invalid-feedback">
                        Please enter your shipping address.
                    </div>
                </div>


                <button class="w-100 btn btn-primary btn-lg" type="submit">Add Product</button>
        </form>
    </div>
    <!--End  add Category -->

    <!-- Start list of  Category -->
    <div class="row mt-3" >
        <h4>List of available products</h4>
        <div class="table-responsive">
            <table class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Category</th>
                        <th>Price</th>
                        <th>Stock</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="#{products}" var="p">
                        <tr>
                            <td>${p.productName}</td>
                            <td>${p.description}</td>
                            <td>${p.category.categoryName}</td>
                            <td>${p.price}</td>
                            <td>${p.stock}</td>
                        </tr>
                    </c:forEach>


                </tbody>
            </table>
        </div>
    </div>
    <!-- End list of  Category -->
</div>