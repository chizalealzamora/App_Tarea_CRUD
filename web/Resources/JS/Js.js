$('#check').change(function(){
var checar = $(this).attr("checked");
if (checar) {
    alert('true');
}else{
    alert('false');
}
});