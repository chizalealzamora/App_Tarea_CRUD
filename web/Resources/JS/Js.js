$('#check').change(function(){
var checar = $(this).attr("checked");
if (checar) {
    alert('true');
}else{
    alert('false');
}
});


function blurParent(ele) {
    ele.parentElement.parentElement.blur();
}

function clickOut() {
    let e_modal = document.getElementById('e_modal_opt');
    e_modal.childNodes[3];
    console.log(e_modal.className);
    //e_modal.classList.toggle("active");
    e_modal.style.display = "block";
    closeEdit();
}

function closeEdit() {
    let e_modal = document.getElementById('e_modal_opt');
    e_modal.childNodes[3];
    e_modal.style.display = "none";
    document.removeEventListener('keydown', escPress);
    document.removeEventListener('click', clickOut);
}

function closeModal() {
    var modal = document.getElementById('modalForm');
    modal.style.top = '100%';
    // modal.style.width = '0';
    modal.style.paddingBottom = '0';
    modal.style.height = '0';
    document.removeEventListener('keydown', escPress2);
    cleanFieldsUsuarios();
    cleanFieldsRoles();
}

function escPress2(ev) {
    if (ev.key === "Escape") {
        closeModal();
    }
}

function openModal() {
    var modal = document.getElementById('modalForm');
    var modal_body = document.getElementById('body_modal');
    modal_body.style.display = 'flex';
    modal.style.display = "flex";
    modal.style.height = '100vh';
    modal.style.paddingBottom = '5rem';
    modal.style.top = '0';
    document.addEventListener('keydown', escPress2);
}

function escPress(ev) {
    if (ev.key === "Escape") {
        closeEdit();
    }
}


const guardarTarea  = async (method) => {
    let datos = {
        nombre: document.getElementById("nombre").value,
        correo: document.getElementById("correo").value,
        telefono: document.getElementById("telefono").value,
        password: document.getElementById("password").value,
        id_sis_perfil: document.getElementById("id_sis_perfil").value,
        id_cat_estado: document.getElementById("checkbox").checked,
    };
    if (method !== 'agregar.htm') {
        datos.id_usuario = document.getElementById("idUsuario").value;
    }
    await $.ajax({
        url: method,
        method: "post",
        data: datos
    }).done((res) => {
        console.log(res);
        if (res.codigo === "001" || res.codigo === "002") {
            closeModal();
            setTimeout(() => {
                renderUsuarios();
            }, 500);
        } else {
            console.log(res.mensaje);
        }
    }).fail((jqXHR, textStatus) => {
        console.log(textStatus, jqXHR);
    });
};