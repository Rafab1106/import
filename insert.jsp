<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <title>Inserer une matiere premiere dans un look</title>

</head>
<body>

    <header>
        <h1>Inserer une matiere premiere dans un look</h1>
    </header>

    <form action="traitement.jsp" method="post">
        <label for="matiere">Selectionnez la matiere premiere :</label>
        <select id="matiere" name="matiere">
            <option value="">Look....</option>
            <option value="Luxe">Luxe</option>
            <option value="Normal">Normal</option>
            <option value="Debrailler">Debrailler</option>
        </select>

        <label for="description">Matiere a ajouter :</label>
        <input type="text" id="description" name="description" required>

        <button type="submit">Ajouter</button>
    </form>

</body>
</html>
