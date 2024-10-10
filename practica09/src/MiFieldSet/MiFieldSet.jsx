import './MiFieldSet.css'

function MiFieldSet(params) {
    //p1 es el titulo
    //
    const {p1, id1, p2, id2, p3} = params
    return (
        <>
    <fieldset>
        <legend>{p1}</legend>
        <label htmlFor={id1}>{p2}</label><br />
        <input className="form-control" type="text" id={id1} /><br />
        <label htmlFor={id2}>{p3}</label><br />
        <input className="form-control" type="text" id={id2} />
    </fieldset>
        </>
    )
}

export default MiFieldSet