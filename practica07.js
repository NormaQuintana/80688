const app = document.getElementById("app")
const fieldset = (p1, p2, p3) =>{
    return `
    <fieldset>
            <legend>${p1}</legend>
            <label for"1">${p2}</label><br>
            <input class="form-control" type="text" id="1"<br>
            <label for"2">${p3}</label><br>
            <input class = "form-control"type="text" id"2">
        </fieldset>
    ` 
}
const button = (p1) =>{
    return `
    <input class="form-control btn btn-primary" type="submit" value=${p1} id = "xx">
    ` 
}
app.innerHTML = fieldset("Información Personal", "Nombre:", "Correo Electronico") + 
fieldset("Información de Dirección", "Dirección", "Ciudad") + button("Enviar")