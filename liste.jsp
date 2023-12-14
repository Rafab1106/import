<%@ page import = "fonc.*" %>
<%
    Fonction fonction = new Fonction();
    
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap-5.0.2-dist/css/bootstrap.css">
    <link rel="stylesheet" href="css/liste.css">
    <title>Liste de matieres premieres</title>
</head>
<body>
    <script type="text/javascript">
        var select = document.getElementById("details");
    </script>
    <header>
        <h1>Liste de matieres premieres</h1>
    </header>
    <div class="mb-3">
        <div class="row">
            <div class="col-sm-1 col-md-1 col-lg-1">
                <!-- <label for="" class="form-label"><h2>City:</h2></label> -->
            </div>
            <div class="col-sm-10 col-md-10 col-lg-10">
                <select class="form-select form-select-lg" name="" id="details">
                    <option selected>See one</option>
                    <option value="luxe">Luxe</option>
                    <option value="normale">Normale</option>
                    <option value="debrailler">Debrailler</option>
                </select>
            </div>
        </div>
    </div>
    
    <ul id="list">
        <li>
            <h2>Luxe</h2>
        </li>
    </ul>
    <script src="css/bootstrap-5.0.2-dist/js/bootstrap.js"></script>
</body>
</html>
