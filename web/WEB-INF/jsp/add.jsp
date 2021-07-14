<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Agregar Tarea</h1>
            <form action="agregar.htm" method="POST">
                <p>Nombre de la Tarea</p>
                <input type="text" name="nombre"><br>
                <input type="submit" name="accion" value="Agregar"><br>
            </form>
        </div>
    </body>
</html>
