<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Tarea</h1>
        <form action="editar.htm?id_tarea=${Tarea.id_tarea}" method="POST">
                <p>Ingresa el nombre de la tarea</p>
                <input type="text" name="nombre_tarea" value="${Tarea.nombre_tarea}"><br>
                <input type="submit" name="accion" value="Agregar"><br>
        </form>
    </body>
</html>
