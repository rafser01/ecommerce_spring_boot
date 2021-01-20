<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="mt-3">
    <!-- Add Category -->
    <h4>Category entry form</h4>
    <div class="row">
        <form action="/addCategory" method="POST" class="needs-validation" novalidate>
            <div class="row g-3">
                <div class="col-12">
                    <label for="categoryName" class="form-label">Category Name</label>
                    <div class="input-group">

                        <input  type="text" class="form-control" name="categoryName" id="categoryName" placeholder="Category Name" required>
                        <div class="invalid-feedback">
                            Category name is required
                        </div>
                    </div>
                </div>

                <div class="col-12">
                    <label for="description" class="form-label">Description<!-- <span class="text-muted">(Optional)</span> --></label>
                    <input type="text" name="description" class="form-control" id="description" >
                    <div class="invalid-feedback">
                        Please enter category description
                    </div>
                </div>

                <div class="col-12">
                    <label for="img" class="form-label">Image Link</label>
                    <input type="text" class="form-control" name="img" id="img" placeholder="http://imglink.com/img1.jpg" required>
                    <div class="invalid-feedback">
                        Please enter your shipping address.
                    </div>
                </div>


                <button class="w-100 btn btn-primary btn-lg" type="submit">Add Category</button>
        </form>
    </div>
    <!--End  add Category -->

    <!-- Start list of  Category -->
    <div class="row mt-3" >
        <h4>List of available categories</h4>
        <div class="table-responsive">
            <table class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Image</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${categories}"  var="c">
                   <tr>
                        <td>${c.id}</td>
                        <td>${c.categoryName}</td>
                        <td>${c.description}</td>
                        <td><img src="${c.img}" width="100" height="100" alt="Image of the product"/></td>

                    </tr> 
                </c:forEach>
                    
                    
                </tbody>
            </table>
        </div>
    </div>
    <!-- End list of  Category -->
</div>