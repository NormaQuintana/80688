var formulario = document.getElementById("formulario");
var usuario = false;
var password = false;
formulario.addEventListener("submit", e =>{
    e.preventDefault();
    console.log("se presiono el botón enviar");
    if (usuario && password){
        console.log("Enviando");
        formulario.submit();
    }
});

const x = document.getElementById("x");
x.addEventListener("focusout", ()=>{
    if(x.value.length == 0){
        //alert("salida del campo");
        document.getElementById("mensaje1").innerHTML = "El campo esta vacío";
    } else{
        document.getElementById("mensaje1").innerHTML = "";
        usuario = true;
    }

})

const enviar = document.getElementById("xx");

const y = document.getElementById("y");
y.addEventListener("keypress", e =>{
    console.log(e.key);
    if(y.value.length == 4){
        enviar.focus();
        password = true;
    }
});

function limpiar(){
    x.value = "";
    y.value = "";
}