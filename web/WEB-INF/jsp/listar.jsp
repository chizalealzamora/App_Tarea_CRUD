<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
            <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
                <html>
                
                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <title>Tareas Chiza</title>
                    <link rel="stylesheet" href="Resources/CSS/style.css">
                    <script type="text/javascript" src="/web/Resources/JS/Js.js"></script>
                </head>
                <body>
                
                <header class="header">
                    <div class="box_header">
                        <img class="img_logo" src="Resources/img/tarea.svg">
                        <h1 class="tittle">Tareas chiza.app</h1>
                        
                        <div class="box-boton">
                            <button class="button_create ">Hay ${contador} tareas por hacer</button>
                        </div>  
                        
                    </div>
                </header>
                <div>    
<!-- 
                    <form action="agregar.htm" method="POST" class="center-form">
                        <p>Nombre de la Tarea</p>
                        <input type="text" name="nombre_tarea">
                        <button class="btnAdd" type="submit" name="accion" value="Agregar" onclick="openModal();">Crear tarea</button>
                    </form>
-->
                    <div class="box_center_options">
                        <div class="box_search"> 
                            <input id="search_input" class="input_search" type="search" placeholder="Búsqueda rápida" autocomplete="" value="" onclick="cleanSearch()">
                            <img src="Resources/icons/lupa.svg" class="search_img">
                        </div>
                        <button class="btnAdd" type="submit" name="accion" value="Agregar" onclick="openModal();"><p>Crear tarea</p></button>
                    </div>
                    
                    <table class="table">
                        <thead>
                            <tr>
                                <th></th>
                                <th>TAREA</th>
                                <th class="th_hora">FECHA / HORA</th>
                                <th></th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${Tareas}" var="tarea">
                                <tr class="tr-cursor">
                                    <td class="item-aling" onclick="editarUsuario('${usuario.id}'); openModal();">
                                        <c:if test="${tarea.tarea_realizado == true}">
                                            <input type="checkbox" id="check" checked onclick="window.location='checked.htm?id_tarea=${tarea.id_tarea}&tarea_realizado=false'"> 
                                        </c:if>
                                        <c:if test="${tarea.tarea_realizado == false}">
                                            <input type="checkbox" id="check" onclick="window.location='checked.htm?id_tarea=${tarea.id_tarea}&tarea_realizado=true'">
                                        </c:if>
                                    </td>
                                    <td class="item-aling" onclick="editarUsuario('${usuario.id}'); openModal();">${tarea.nombre_tarea}</td>
                                    <td class="item-aling" onclick="editarUsuario('${usuario.id}'); openModal();">${tarea.fecha_hora}</td>
                                    <td class="item-aling">
                                        <a class="sexo " href="borrar_tarea.htm?id_tarea=${tarea.id_tarea}">
                                            <img class="img-borrar" src="Resources/img/eliminar.svg">
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                    <table class="table">
                        <thead>
                            <tr>
                                <th></th>
                                <th>TAREA</th>
                                <th class="th_hora">FECHA / HORA</th>
                                <th></th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${tarea_boolean}" var="tarea_bool">
                                <tr>
                                    <td>
                                        <c:if test="${tarea_bool.tarea_realizado == true}">
                                            <input type="checkbox" id="check" checked onclick="window.location='checked.htm?id_tarea=${tarea_bool.id_tarea}&tarea_realizado=false'">
                                        </c:if>
                                        <c:if test="${tarea_bool.tarea_realizado == false}">
                                            <input type="checkbox" id="check" onclick="window.location='checked.htm?id_tarea=${tarea_bool.id_tarea}&tarea_realizado=true'">
                                        </c:if>
                                    </td>
                                    <td>${tarea_bool.nombre_tarea}</td>
                                    <td>${tarea_bool.fecha_hora}</td>
                                    <td>
                                        <a class="sexo " href="borrar_tarea.htm?id_tarea=${tarea_bool.id_tarea}">
                                            <img class="img-borrar" src="Resources/img/eliminar.svg">
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    
                    <section id="modalForm" class="create">
                        <div class="modal-nav">
                            <span class="close-modal pointer" onclick="closeModal();">
                                <img src="resources/images/icons/Cerrar.svg">
                            </span>
                            <div id="modalTitle" class="modal-title">Crear una tarea</div>
                            
                            <input id="btnModalSave" type="button" class="save pointer" value="Guardar" onclick="guardarUsuario('crear_usuario.htm')">
                            <button class="btnAdd" type="button" name="accion" value="Agregar" onclick="openModal();">Crear tarea</button>
                        </div>
                        <div id="body_modal" class="modal-body">
                            <div class="modal-form">
                                <div class="operator-body">
                                <div class="form-body">
                                    <input type="hidden" id="idUsuario" name="id_usuario" value="">
                                </div>
                            </div>
                            </div>    
                        </div>
                    </section>

                </div>
                    
                </body>
            </html>