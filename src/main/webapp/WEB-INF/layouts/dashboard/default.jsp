<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<html xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core"
      xmlns:fn="http://java.sun.com/jsp/jstl/functions"
      xmlns:tiles="http://tiles.apache.org/tags-tiles"
      xmlns:spring="http://www.springframework.org/tags">

    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />-->
        <!--<meta http-equiv="X-UA-Compatible" content="IE=8" />-->
        <%@include file="../index.jsp" %>
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <title>${title}</title>


    </head>
    <body class="container-fluid">
        <tiles:insertAttribute  name="header"   />
        <div class="row">
            <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
                <tiles:insertAttribute  name="menu"   />
            </nav>
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                <tiles:insertAttribute  name="body"   />
            </main>

        </div>

    </body>
</html>